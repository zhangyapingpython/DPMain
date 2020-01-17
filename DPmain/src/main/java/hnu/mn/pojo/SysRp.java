package hnu.mn.pojo;

public class SysRp {
	private int rpID;
	private int roleID;
	private int permissionID;

	@Override
	public String toString() {
		return "SysRp [rpID=" + rpID + ", roleID=" + roleID + ", permissionID=" + permissionID + "]";
	}

	public int getRpID() {
		return rpID;
	}

	public void setRpID(int rpID) {
		this.rpID = rpID;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public int getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

}
