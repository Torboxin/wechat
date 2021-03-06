package com.wechat.entity.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRolePermission<M extends BaseRolePermission<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
	}
	
	public java.lang.Integer getRoleId() {
		return getInt("role_id");
	}

	public void setPermissionId(java.lang.Integer permissionId) {
		set("permission_id", permissionId);
	}
	
	public java.lang.Integer getPermissionId() {
		return getInt("permission_id");
	}

}
