package hnu.mn.pojo;

public class SysPermission {
	private int permissionID;

	private double permissionBudget;
	private int permissionFrequency;
	private int permissionTime;
	private String permissionData;

	@Override
	public String toString() {
		return "SysPermission [permissionID=" + permissionID + ", permissionBudget=" + permissionBudget
				+ ", permissionFrequency=" + permissionFrequency + ", permissionTime=" + permissionTime
				+ ", permissionData=" + permissionData + "]";
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

	public int getPermissionTime() {
		return permissionTime;
	}

	public void setPermissionTime(int permissionTime) {
		this.permissionTime = permissionTime;
	}

	public String getPermissionData() {
		return permissionData;
	}

	public void setPermissionData(String permissionData) {
		this.permissionData = permissionData;
	}

}
