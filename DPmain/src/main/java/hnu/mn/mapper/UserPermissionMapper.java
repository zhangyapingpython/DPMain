package hnu.mn.mapper;

import java.util.List;

import hnu.mn.pojo.SysPermission;
import hnu.mn.pojo.SysRole;
import hnu.mn.pojo.SysUser;

public interface UserPermissionMapper {
	// 根据User查找Role
	SysRole selRoleByUser(SysUser sysUser);

	// 根据Role查找Permission
	List<SysPermission> selPermissionsByRole(SysRole sysRole);
}
