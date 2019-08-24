package com.wechat.entity.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCmsRegion<M extends BaseCmsRegion<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setRegionAb(java.lang.String regionAb) {
		set("region_ab", regionAb);
	}
	
	public java.lang.String getRegionAb() {
		return getStr("region_ab");
	}

	public void setRegionName(java.lang.String regionName) {
		set("region_name", regionName);
	}
	
	public java.lang.String getRegionName() {
		return getStr("region_name");
	}

	public void setRegionEng(java.lang.String regionEng) {
		set("region_eng", regionEng);
	}
	
	public java.lang.String getRegionEng() {
		return getStr("region_eng");
	}

	public void setRegionCode(java.lang.String regionCode) {
		set("region_code", regionCode);
	}
	
	public java.lang.String getRegionCode() {
		return getStr("region_code");
	}

}