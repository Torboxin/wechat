package com.wechat.entity.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTbVpnip<M extends BaseTbVpnip<M>> extends Model<M> implements IBean {

	public void setLoginIp(java.lang.String LoginIp) {
		set("LoginIp", LoginIp);
	}
	
	public java.lang.String getLoginIp() {
		return getStr("LoginIp");
	}

	public void setIpCity(java.lang.String IpCity) {
		set("IpCity", IpCity);
	}
	
	public java.lang.String getIpCity() {
		return getStr("IpCity");
	}

	public void setUpdate(java.util.Date update) {
		set("update", update);
	}
	
	public java.util.Date getUpdate() {
		return get("update");
	}

}