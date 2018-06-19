package ke.co.statum.service;

import org.springframework.stereotype.Service;

@Service
public class RequestService {

	private String string;

	public RequestService() {

	}

	public RequestService(String string) {
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
