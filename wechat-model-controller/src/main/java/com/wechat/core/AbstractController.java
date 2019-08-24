package com.wechat.core;

import com.jfinal.core.Controller;
import com.wechat.comm.ExcpUtil;
import com.wechat.service.TestService;
import com.wechat.service.impl.TestServiceImpl;

/**
 * 
 * Project: wechat-model-controller
 * Title: com.wechat.core.AbstractController
 * Description: 该类继承与JFinal的Controller
 * 				用于提取项目中各类Controller中多次复用的方法
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public abstract class AbstractController extends Controller implements Log{
	
	protected ExcpUtil e = new ExcpUtil();
	protected TestService testService = new TestServiceImpl();
	
	/**
	 * 
	 * Ttile: com.wechat.core.AbstractController.index
	 * Description: 默认映射页面
	 * @datetime 2019年8月20日上午11:30:45
	 * @return void
	 */
	public abstract void index();
	
	@Override
	public void logErrorRecord(String error) {
		log.error(error);
		
	}
	
	@Override
	public void logInfoRecord(String info) {
		log.info(info);
		
	}
	
	@Override
	public void logWarnRecord(String warn) {
		log.warn(warn);
		
	}
	
}
