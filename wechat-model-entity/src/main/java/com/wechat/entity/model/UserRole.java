package com.wechat.entity.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * Project: wechat-model-entity
 * Title: com.wechat.entity.model.UserRole
 * Description: 用户角色对应表
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class UserRole extends Model<UserRole> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final UserRole USER_ROLE_DAO = new UserRole().dao();
}
