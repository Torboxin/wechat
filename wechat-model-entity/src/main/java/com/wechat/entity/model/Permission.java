package com.wechat.entity.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

/**
 * 
 * Project: wechat-model-entity
 * Title: com.wechat.entity.model.Permission
 * Description: 权限数据表
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class Permission extends Model<Permission> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final Permission PERMISSION_DAO = new Permission().dao();
	
	/**
	 * 
	 * Ttile: com.wechat.entity.model.Permission.findPermissionData
	 * Description: 查询指定用户的权限表数据信息
	 * @param userId 指定用户主键
	 * @datetime 2019年8月20日下午5:02:33
	 * @return List<Record>
	 */
	public static List<Record> findPermissionData(Integer userId){
		
		return Db.find("select p.permission_name from permission p join role_permission rp on rp.permission_id=p.id join user_role ur on rp.role_id=ur.role_id join user u on u.id=ur.user_id where u.id=?",userId);
	}
	
	/**
	 * 
	 * Ttile: com.wechat.entity.model.Permission.findPermissionData
	 * Description: 查询权限表数据信息
	 * @datetime 2019年8月20日下午5:04:55
	 * @return List<Record>
	 */
	public static List<Record> findPermissionData(){
		return Db.find("select * from permission");
	}
}
