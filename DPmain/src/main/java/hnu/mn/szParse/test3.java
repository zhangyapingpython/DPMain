package hnu.mn.szParse;

public class test3 {
	public static void main(String[] args) {
		String permissionString = "data_emp!empAge@data_emp!empMoney";
		String[] split = permissionString.split("@");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			String tempString = split[i];
			String[] split2 = tempString.split("!");
			for (int j = 0; j < split2.length; j++) {
				System.out.println("222  " + split2[j]);
			}
		}
	}
}
