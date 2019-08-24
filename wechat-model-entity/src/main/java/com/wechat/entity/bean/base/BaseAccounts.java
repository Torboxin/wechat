package com.wechat.entity.bean.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAccounts<M extends BaseAccounts<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setWechatId(java.lang.String wechatId) {
		set("wechat_id", wechatId);
	}
	
	public java.lang.String getWechatId() {
		return getStr("wechat_id");
	}

	public void setWechatAccount(java.lang.String wechatAccount) {
		set("wechat_account", wechatAccount);
	}
	
	public java.lang.String getWechatAccount() {
		return getStr("wechat_account");
	}

	public void setWechatPhone(java.lang.String wechatPhone) {
		set("wechat_phone", wechatPhone);
	}
	
	public java.lang.String getWechatPhone() {
		return getStr("wechat_phone");
	}

	public void setWechatPwd(java.lang.String wechatPwd) {
		set("wechat_pwd", wechatPwd);
	}
	
	public java.lang.String getWechatPwd() {
		return getStr("wechat_pwd");
	}

	public void setWechatNickname(java.lang.String wechatNickname) {
		set("wechat_nickname", wechatNickname);
	}
	
	public java.lang.String getWechatNickname() {
		return getStr("wechat_nickname");
	}

	public void setWechatHeadimg(java.lang.String wechatHeadimg) {
		set("wechat_headimg", wechatHeadimg);
	}
	
	public java.lang.String getWechatHeadimg() {
		return getStr("wechat_headimg");
	}

	public void setWechatSetHeadimg(java.lang.Integer wechatSetHeadimg) {
		set("wechat_set_headimg", wechatSetHeadimg);
	}
	
	public java.lang.Integer getWechatSetHeadimg() {
		return getInt("wechat_set_headimg");
	}

	public void setToUser(java.lang.Integer toUser) {
		set("to_user", toUser);
	}
	
	public java.lang.Integer getToUser() {
		return getInt("to_user");
	}

	public void setToUserTime(java.util.Date toUserTime) {
		set("to_user_time", toUserTime);
	}
	
	public java.util.Date getToUserTime() {
		return get("to_user_time");
	}

	public void setIsLogin(java.lang.Integer isLogin) {
		set("is_login", isLogin);
	}
	
	public java.lang.Integer getIsLogin() {
		return getInt("is_login");
	}

	public void setLoginTime(java.util.Date loginTime) {
		set("login_time", loginTime);
	}
	
	public java.util.Date getLoginTime() {
		return get("login_time");
	}

	public void setLoginState(java.lang.Integer loginState) {
		set("login_state", loginState);
	}
	
	public java.lang.Integer getLoginState() {
		return getInt("login_state");
	}

	public void setDataTypeCode(java.lang.Integer dataTypeCode) {
		set("data_type_code", dataTypeCode);
	}
	
	public java.lang.Integer getDataTypeCode() {
		return getInt("data_type_code");
	}

	public void setSynchronizeState(java.lang.Integer synchronizeState) {
		set("synchronize_state", synchronizeState);
	}
	
	public java.lang.Integer getSynchronizeState() {
		return getInt("synchronize_state");
	}

	public void setProxyPoolId(java.lang.Integer proxyPoolId) {
		set("proxy_pool_id", proxyPoolId);
	}
	
	public java.lang.Integer getProxyPoolId() {
		return getInt("proxy_pool_id");
	}

	public void setProxyLoseEfficacyTime(java.util.Date proxyLoseEfficacyTime) {
		set("proxy_lose_efficacy_time", proxyLoseEfficacyTime);
	}
	
	public java.util.Date getProxyLoseEfficacyTime() {
		return get("proxy_lose_efficacy_time");
	}

	public void setAccountStateId(java.lang.Integer accountStateId) {
		set("account_state_id", accountStateId);
	}
	
	public java.lang.Integer getAccountStateId() {
		return getInt("account_state_id");
	}

	public void setDataRemark(java.lang.String dataRemark) {
		set("data_remark", dataRemark);
	}
	
	public java.lang.String getDataRemark() {
		return getStr("data_remark");
	}

}