package hnu.mn.pojo;

public class ReturnToWeb {
	private String info;
	private String error;
	private String right;

	@Override
	public String toString() {
		return "ReturnToWeb [info=" + info + ", error=" + error + ", right=" + right + "]";
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

}
