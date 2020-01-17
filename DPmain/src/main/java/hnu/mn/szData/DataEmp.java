package hnu.mn.szData;

public class DataEmp {
	// 数据表
	private int empID;
	private String empName;
	private int empAge;
	private double empMoney;

	@Override
	public String toString() {
		return "DataEmp [empID=" + empID + ", empName=" + empName + ", empAge=" + empAge + ", empMoney=" + empMoney
				+ "]";
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpMoney() {
		return empMoney;
	}

	public void setEmpMoney(double empMoney) {
		this.empMoney = empMoney;
	}

}
