package com.wechat.core;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.plugin.shiro.ShiroInterceptor;
import com.jfinal.ext.plugin.shiro.ShiroPlugin;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.plugin.druid.DruidStatViewHandler;
import com.jfinal.plugin.druid.IDruidStatViewAuth;
import com.jfinal.template.Engine;
import com.wechat.controller.TestController;
import com.wechat.entity.model.Permission;
import com.wechat.entity.model.Role;
import com.wechat.entity.model.RolePermission;
import com.wechat.entity.model.State;
import com.wechat.entity.model.UserRole;

public class MainConfig extends JFinalConfig{
	
	private static Prop p;
	// 预留一个Routes对象 给shiro使用
	Routes routes;

	@Override
	public void configConstant(Constants me) {
		// 加载配置文件
		PropKit.use("config.properties");
		
	}

	@Override
	public void configRoute(Routes me) {
		this.routes = me;
		me.add("/",TestController.class);
		
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		// 配置shiro插件
		ShiroPlugin shiroPlugin = new ShiroPlugin(routes);
		shiroPlugin.setLoginUrl("/login");
		shiroPlugin.setSuccessUrl("/main");
		shiroPlugin.setUnauthorizedUrl("/permissio");
		me.add(shiroPlugin);
		// 配置druid连接池
		DruidPlugin druidPlugin = createDruidPlugin();
		druidPlugin.addFilter(new StatFilter());
		WallFilter wall = new WallFilter();
		wall.setDbType(PropKit.get("dbType"));
		druidPlugin.addFilter(wall);
		druidPlugin.setTestOnBorrow(true);
		druidPlugin.setTestOnReturn(true);
		// 设置druid连接 初始化 线程数
		druidPlugin.setInitialSize(PropKit.getInt("InitialPoolSize"));
		me.add(druidPlugin);
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		arp.setShowSql(PropKit.getBoolean("showSql"));
		// 添加数据库映射
		arp.addMapping("state", State.class);
		arp.addMapping("user", com.wechat.entity.model.User.class);
		arp.addMapping("role", Role.class);
		arp.addMapping("user_role", UserRole.class);
		arp.addMapping("role_permission", RolePermission.class);
		arp.addMapping("permission", Permission.class);
		me.add(arp);
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		me.add(new ShiroInterceptor());
		
	}

	@Override
	public void configHandler(Handlers me) {
		// 配置druid监控页面以及访问权限
		DruidStatViewHandler dsvh = new DruidStatViewHandler("/druid",new IDruidStatViewAuth() {
			
			@Override
			public boolean isPermitted(HttpServletRequest request) {
				String username = (String) SecurityUtils.getSubject().getPrincipal();
				return username != null;
			}
		});
		me.add(dsvh);
		
	}
	
	public static DruidPlugin createDruidPlugin(){
		loadConfig();
		return new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"));
	}

	public static void loadConfig(){
		if(p == null){
			p = PropKit.use("config.properties");
		}
	}
}
