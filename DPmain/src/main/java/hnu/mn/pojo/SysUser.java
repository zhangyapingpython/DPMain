package hnu.mn.pojo;

public class SysUser {
	private int userID;
	private String userAccount;
	private String userPassword;
	private String userPhone;
	private String userEmail;
	// 1代表锁定
	// private char locked;
	// 用户拥有的角色，默认一个
	private SysRole sysRole;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	@Override
	public String toString() {
		return "SysUser [userID=" + userID + ", userAccount=" + userAccount + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", sysRole=" + sysRole + "]";
	}

}
