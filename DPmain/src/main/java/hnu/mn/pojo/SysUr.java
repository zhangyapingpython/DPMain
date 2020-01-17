package hnu.mn.pojo;

public class SysUr {
	private int urID;
	private int userID;
	private int roleID;

	@Override
	public String toString() {
		return "SysUr [urID=" + urID + ", userID=" + userID + ", roleID=" + roleID + "]";
	}

	public int getUrID() {
		return urID;
	}

	public void setUrID(int urID) {
		this.urID = urID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

}
