package hnu.mn.szParse;

import java.util.List;

public class test4 {
	public static void main(String[] args) {
		String permissionData = "data_emp!empAge@data_emp!empMoney";
		List<MySQLData> parseMyPermission = ParsePermission.parseMyPermission(permissionData);
		System.out.println(parseMyPermission);
	}
}
