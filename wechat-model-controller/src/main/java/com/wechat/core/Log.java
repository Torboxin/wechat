package com.wechat.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Project: wechat-model-controller
 * Title: com.wechat.core.Log
 * Description: 日志类
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public interface Log {
	/**
	 * 日志记录对象
	 */
	Logger log = LogManager.getLogger(Log.class);
	/**
	 * 
	 * Ttile: com.wechat.core.Log.logInfoRecord
	 * Description: 记录info级别日志
	 * @param info 日志内容
	 * @datetime 2019年8月23日上午9:05:57
	 * @return void
	 */
	void logInfoRecord(String info);
	/**
	 * 
	 * Ttile: com.wechat.core.Log.logErrorRecord
	 * Description: 记录error级别日志
	 * @param error 日志内容
	 * @datetime 2019年8月23日上午9:06:33
	 * @return void
	 */
	void logErrorRecord(String error);
	/**
	 * 
	 * Ttile: com.wechat.core.Log.logWarnRecord
	 * Description: 记录warn级别日志
	 * @param warn 日志内容
	 * @datetime 2019年8月23日上午9:06:36
	 * @return void
	 */
	void logWarnRecord(String warn);
}
