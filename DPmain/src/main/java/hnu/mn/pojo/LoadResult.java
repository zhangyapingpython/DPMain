package hnu.mn.pojo;

public class LoadResult {
	// 权限+用户
	private String query;
	// 查询结果 （汇总查询）
	private String result;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "LoadResult [query=" + query + ", result=" + result + "]";
	}

}
