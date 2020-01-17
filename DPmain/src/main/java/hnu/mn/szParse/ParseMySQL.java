package hnu.mn.szParse;

public class ParseMySQL {
	public static MySQLData parseMySQL(String mySQL) {
		// 做SQL的解析
		// select s(a) from b
		MySQLData mySQLData = new MySQLData();
		// String lowMySQL = mySQL.toLowerCase();

		String[] spString = mySQL.split("\\s+");
		mySQLData.setDataTable(spString[3]);

		// 下面是分割
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

		mySQLData.setDataCol(colString);
		mySQLData.setDataQuery(queryString);

		return mySQLData;
	}
}
