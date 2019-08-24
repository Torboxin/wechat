package com.wechat.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import com.wechat.core.AbstractController;
import com.wechat.entity.model.State;

public class TestController extends AbstractController{
	
	@Override
	public void index(){
		System.out.println(State.getStateMap());
		renderText(testService.getMessage());
	}
	
	/**
	 * 
	 * Ttile: com.wechat.controller.TestController.login
	 * Description: 用户登录
	 * @param username 用户名
	 * @param password 密码
	 * @datetime 2019年8月20日上午11:40:19
	 * @return void
	 */
	public void login(){
		String username = getPara("username"),password = getPara("password");
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		try {
			//System.out.println(subject.isAuthenticated());
			subject.login(token);
			//System.out.println(subject.isAuthenticated());
			// 验证当前登录用户是否拥有某项权限
			boolean isInPermission = subject.isPermitted("menu:upd");
			System.out.println(subject.isPermitted("admin2"));
			System.out.println(isInPermission);
			//User user = User.USER_DAO.findById(1);
			renderText("登陆成功！");
		} catch (UnknownAccountException e) {
			//e.printStackTrace();
			log.error("账号不正确！");
			renderText("账号不正确！");
		} catch (IncorrectCredentialsException e) {
			//e.printStackTrace();
			log.error("密码不正确！");
			renderText("密码不正确！");
		}
	}
}
