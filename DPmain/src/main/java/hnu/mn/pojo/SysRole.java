package hnu.mn.pojo;

import java.util.List;

public class SysRole {
	private int roleID;
	private String roleName;

	// 角色所拥有的权限可能不止一个
	private List<SysPermission> sysPermission;

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<SysPermission> getSysPermission() {
		return sysPermission;
	}

	public void setSysPermission(List<SysPermission> sysPermission) {
		this.sysPermission = sysPermission;
	}

	@Override
	public String toString() {
		return "SysRole [roleID=" + roleID + ", roleName=" + roleName + ", sysPermission=" + sysPermission + "]";
	}

}
