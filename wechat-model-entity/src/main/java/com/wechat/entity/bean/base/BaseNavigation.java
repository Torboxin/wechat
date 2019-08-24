package com.wechat.entity.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseNavigation<M extends BaseNavigation<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setNavName(java.lang.String navName) {
		set("nav_name", navName);
	}
	
	public java.lang.String getNavName() {
		return getStr("nav_name");
	}

	public void setNavUrl(java.lang.String navUrl) {
		set("nav_url", navUrl);
	}
	
	public java.lang.String getNavUrl() {
		return getStr("nav_url");
	}

	public void setNavFatherId(java.lang.Integer navFatherId) {
		set("nav_father_id", navFatherId);
	}
	
	public java.lang.Integer getNavFatherId() {
		return getInt("nav_father_id");
	}

	public void setNavTypeCode(java.lang.Integer navTypeCode) {
		set("nav_type_code", navTypeCode);
	}
	
	public java.lang.Integer getNavTypeCode() {
		return getInt("nav_type_code");
	}

	public void setNavIcoCode(java.lang.String navIcoCode) {
		set("nav_ico_code", navIcoCode);
	}
	
	public java.lang.String getNavIcoCode() {
		return getStr("nav_ico_code");
	}

	public void setNavOrderCode(java.lang.Long navOrderCode) {
		set("nav_order_code", navOrderCode);
	}
	
	public java.lang.Long getNavOrderCode() {
		return getLong("nav_order_code");
	}

	public void setNavPermission(java.lang.String navPermission) {
		set("nav_permission", navPermission);
	}
	
	public java.lang.String getNavPermission() {
		return getStr("nav_permission");
	}

}
