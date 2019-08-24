package com.wechat.entity.model;

import com.jfinal.plugin.activerecord.Model;

public class Navigation extends Model<Navigation> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final Navigation NAVIGATION = new Navigation().dao();
	
}
