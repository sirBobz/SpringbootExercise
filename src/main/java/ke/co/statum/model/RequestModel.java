package ke.co.statum.model;

import java.io.Serializable;

public class RequestModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String string;
	private Long index;

	public RequestModel(Long index) {
		this.index = index;
	}

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
	public Long getIndex() {
		return index;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "RequestModel [string=" + string + ", index=" + index + "]";
	}


}
