package hnu.mn.szParse;

public class test {
	public static void main(String[] args) {
		String sqlString = "select asass(dsa) from b";
		String lowMySQL = sqlString.toLowerCase();
		String[] spString = lowMySQL.split("\\s+");
		for (int i = 0; i < spString.length; i++) {
			System.out.println(spString[i]);
		}

		String colString = "";
		String queryString = "";
		int flag = -1;
		for (int i = 0; i < spString[1].length(); i++) {
			if (spString[1].charAt(i) != '(') {
				queryString += spString[1].charAt(i);
			} else {
				flag = i;
				break;
			}
		}

		for (int i = flag + 1; i < spString[1].length() - 1; i++) {
			colString += spString[1].charAt(i);
		}
		System.out.println(colString);
		System.out.println(queryString);

	}
}
