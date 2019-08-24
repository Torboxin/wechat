package com.wechat.entity.bean;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		// Composite Primary Key order: id,wechat_account,wechat_id,wechat_phone
		arp.addMapping("accounts", "id,wechat_account,wechat_id,wechat_phone", Accounts.class);
		arp.addMapping("cms_province", "provinceid", CmsProvince.class);
		arp.addMapping("cms_region", "id", CmsRegion.class);
		arp.addMapping("cpu_format", "id", CpuFormat.class);
		arp.addMapping("friend", "id", Friend.class);
		arp.addMapping("group_member", "id", GroupMember.class);
		arp.addMapping("navigation", "id", Navigation.class);
		arp.addMapping("permission", "id", Permission.class);
		arp.addMapping("role", "id", Role.class);
		arp.addMapping("role_permission", "id", RolePermission.class);
		arp.addMapping("state", "id", State.class);
		arp.addMapping("tb_hanrdbase", "ID", TbHanrdbase.class);
		arp.addMapping("tb_vpnip", "LoginIp", TbVpnip.class);
		arp.addMapping("tb_wifi", "id", TbWifi.class);
		// Composite Primary Key order: email,id,phone,username
		arp.addMapping("user", "email,id,phone,username", User.class);
		arp.addMapping("user_role", "id", UserRole.class);
		arp.addMapping("vx_business", "id", VxBusiness.class);
		arp.addMapping("wechat_group", "id", WechatGroup.class);
	}
}
