package com.wechat.entity.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCmsProvince<M extends BaseCmsProvince<M>> extends Model<M> implements IBean {

	public void setProvinceid(java.lang.Integer provinceid) {
		set("provinceid", provinceid);
	}
	
	public java.lang.Integer getProvinceid() {
		return getInt("provinceid");
	}

	public void setProvincename(java.lang.String provincename) {
		set("provincename", provincename);
	}
	
	public java.lang.String getProvincename() {
		return getStr("provincename");
	}

}