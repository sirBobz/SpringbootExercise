package ke.co.statum.model;

public class RequestModel {

	private String string;

	public RequestModel() {

	}

	public RequestModel(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "RequestService [string=" + string + "]";
	}
}
