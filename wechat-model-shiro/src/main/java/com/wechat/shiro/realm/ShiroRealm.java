package com.wechat.shiro.realm;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.jfinal.plugin.activerecord.Record;
import com.wechat.comm.ExcpUtil;
import com.wechat.comm.WeChatUtil;
import com.wechat.entity.model.Permission;
import com.wechat.entity.model.User;

/**
 * 
 * Project: wechat-model-shiro
 * Title: com.wechat.shiro.realm.ShiroRealm
 * Description: 自定义Shiro - Realm认证规则类
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class ShiroRealm extends AuthorizingRealm{
	
	private Logger log = LogManager.getLogger(ShiroRealm.class);
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User user = (User) SecurityUtils.getSubject().getSession().getAttribute("user");
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		List<Record> permissionList = Permission.findPermissionData(user.getInt("id"));
		authorizationInfo.addStringPermissions(WeChatUtil.conversionStringPermissions(permissionList));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获取提交上来的账号 密码
		String password = new String((char[])token.getCredentials());
		String username = (String)token.getPrincipal();
		// 查询数据库
		User user = User.USER_DAO.findFirst("select * from user where username=?",username);
		SecurityUtils.getSubject().getSession().setAttribute("user", user);
		// 账号不存在
		if(user == null){
			throw new UnknownAccountException();
		}
		// 密码不正确
		if(!user.getStr("password").equals(password)){
			throw new IncorrectCredentialsException();
		}
		int num = 0;
		try {
			String loginTime = WeChatUtil.getFormatDate();
			num = User.userLoginUpdate(user.getInt("id"),loginTime);
			if(num > 0){
				log.info("用户：["+user.getStr("username")+"]，登录成功，登录时间：["+loginTime+"]！");
			}else{
				log.info("用户：["+user.getStr("username")+"]，登录失败，登录时间：["+loginTime+"]！");
			}
		} catch (Exception e) {
			log.error(ExcpUtil.getStackTraceString(e));
			//throw new UserLoginException(e,"执行[更新用户登录信息]Sql语句时异常！");
		}
		return new SimpleAuthenticationInfo(username, password, getName());
	}

}
