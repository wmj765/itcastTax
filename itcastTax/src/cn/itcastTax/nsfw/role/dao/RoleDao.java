package cn.itcastTax.nsfw.role.dao;

import cn.itcastTax.core.dao.BaseDao;
import cn.itcastTax.nsfw.role.entity.Role;

public interface RoleDao extends BaseDao<Role> {

	//删除该角色对于的所有权限
	public void deleteRolePrivilegeByRoleId(String roleId);

}
