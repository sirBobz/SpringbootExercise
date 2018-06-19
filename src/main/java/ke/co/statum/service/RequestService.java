package ke.co.statum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.statum.model.RequestModel;
import ke.co.statum.response.Response;

@Service
public class RequestService {
	
	@Autowired
	private Response response;

	public RequestService(Response response) {
		this.response = response;
	}

	public Object processApiRequest(RequestModel request) {
		if(request.getString() != null && !request.getString().isEmpty()) 
		  {
			return processRequest(request);
		  }
		else
		  {
			return this.response.missingRequestData();
		  }
		
		
	}

	private Object processRequest(RequestModel request) {
		
		return null;
	}



	
 
	
	
	
	
	
	
	
}
