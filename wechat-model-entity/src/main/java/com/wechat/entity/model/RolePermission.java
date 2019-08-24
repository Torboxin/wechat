package com.wechat.entity.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * Project: wechat-model-entity
 * Title: com.wechat.entity.model.RolePermission
 * Description: 角色权限对应表
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class RolePermission extends Model<RolePermission> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final RolePermission ROLE_PERMISSION_DAO = new RolePermission().dao();
}
