package com.wechat.entity.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * Project: wechat-model-entity
 * Title: com.wechat.entity.model.Role
 * Description: 角色数据表
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class Role extends Model<Role> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final Role ROLE_DAO = new Role().dao();
}
