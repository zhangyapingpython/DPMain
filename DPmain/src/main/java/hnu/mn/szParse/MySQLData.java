package hnu.mn.szParse;

public class MySQLData {
	// sql语句的表 权限表
	private String dataTable;
	// sql语句的字段 权限字段
	private String dataCol;
	// sql语句的查询函数
	private String dataQuery;

	@Override
	public String toString() {
		return "MySQLData [dataTable=" + dataTable + ", dataCol=" + dataCol + ", dataQuery=" + dataQuery + "]";
	}

	public String getDataTable() {
		return dataTable;
	}

	public void setDataTable(String dataTable) {
		this.dataTable = dataTable;
	}

	public String getDataCol() {
		return dataCol;
	}

	public void setDataCol(String dataCol) {
		this.dataCol = dataCol;
	}

	public String getDataQuery() {
		return dataQuery;
	}

	public void setDataQuery(String dataQuery) {
		this.dataQuery = dataQuery;
	}

	public MySQLData(String dataTable, String dataCol, String dataQuery) {
		super();
		this.dataTable = dataTable;
		this.dataCol = dataCol;
		this.dataQuery = dataQuery;
	}

	public MySQLData(String dataTable, String dataCol) {
		super();
		this.dataTable = dataTable;
		this.dataCol = dataCol;
	}

	public MySQLData() {
		super();
	}

}
