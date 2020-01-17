package hnu.mn.szParse;

public class test2 {
	public static void main(String[] args) {
		String mySQL = "select sadasd(sdas) from sa where a=3";
		MySQLData parseMySQL = ParseMySQL.parseMySQL(mySQL);
		System.out.println(parseMySQL);
	}
}
