package com.wechat.entity.model;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * Project: wechat-model-entity
 * Title: com.wechat.entity.model.User
 * Description: 用户数据表
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class User extends Model<User> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final User USER_DAO = new User().dao();
	
	/**
	 * 
	 * Ttile: com.wechat.entity.model.User.userLogin
	 * Description: 用户登录后修改数据库需要修改的数据
	 * @param id 主键
	 * @param loginTime 登录时间
	 * @datetime 2019年8月20日上午11:56:25
	 * @return Integer
	 */
	public static Integer userLoginUpdate(Integer id,String loginTime){
		
		return Db.update("update user set login_time=?,update_time=? where id=?",loginTime,loginTime,id);
	}
}
