package com.wechat.comm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jfinal.plugin.activerecord.Record;

/**
 * 
 * Project: wechat-model-comm
 * Title: com.wechat.comm.WeChatUtil
 * Description: 工具类
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class WeChatUtil {
	
	/**
	 * 
	 * Ttile: com.wechat.comm.WeChatUtil.getDateFormat
	 * Description: 获取当前格式化后的时间格式，格式为：yyyy-MM-dd HH:mm:ss
	 * @datetime 2019年8月20日上午11:58:59
	 * @return Date
	 */
	public static String getFormatDate(){
		
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	/**
	 * 
	 * Ttile: com.wechat.comm.WeChatUtil.conversionStringPermissions
	 * Description: 将参数转化为指定格式并返回，用于shiro账号权限的添加
	 * 				初始对象格式：[{},{}...]
	 * 				转换后对象格式：["","",""...]
	 * @param list Record对象集合
	 * @datetime 2019年8月20日下午5:20:06
	 * @return Set<String> 转换后的对象
	 */
	public static Set<String> conversionStringPermissions(List<Record> list){
		Set<String> set = new HashSet<>();
		for(Record r : list){
			set.add(r.getStr("permission_name"));
		}
		return set;
	}
}
