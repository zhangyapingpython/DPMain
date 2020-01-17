package hnu.mn.pojo;

import java.sql.Timestamp;

public class LoadUserPermission {
	private String userAccount;
	private int roleID;
	private int permissionID;
	private double permissionBudget;
	private int permissionFrequency;
	// 第一次查询时间
	private Timestamp firstMeet;
	// 允许查询的时间，对应于权限
	private long permissionTime;
	private String permissionData;
	// 该权限是否可用 0不可 1 可
	private int availble;

	@Override
	public String toString() {
		return "LoadUserPermission [userAccount=" + userAccount + ", roleID=" + roleID + ", permissionID="
				+ permissionID + ", permissionBudget=" + permissionBudget + ", permissionFrequency="
				+ permissionFrequency + ", firstMeet=" + firstMeet + ", permissionTime=" + permissionTime
				+ ", permissionData=" + permissionData + ", availble=" + availble + "]";
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
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

	public double getPermissionBudget() {
		return permissionBudget;
	}

	public void setPermissionBudget(double permissionBudget) {
		this.permissionBudget = permissionBudget;
	}

	public int getPermissionFrequency() {
		return permissionFrequency;
	}

	public void setPermissionFrequency(int permissionFrequency) {
		this.permissionFrequency = permissionFrequency;
	}

	public Timestamp getFirstMeet() {
		return firstMeet;
	}

	public void setFirstMeet(Timestamp firstMeet) {
		this.firstMeet = firstMeet;
	}

	public long getPermissionTime() {
		return permissionTime;
	}

	public void setPermissionTime(long permissionTime) {
		this.permissionTime = permissionTime;
	}

	public String getPermissionData() {
		return permissionData;
	}

	public void setPermissionData(String permissionData) {
		this.permissionData = permissionData;
	}

	public int getAvailble() {
		return availble;
	}

	public void setAvailble(int availble) {
		this.availble = availble;
	}

}
