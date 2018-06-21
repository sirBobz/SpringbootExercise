package ke.co.statum.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.statum.model.RequestModel;
import ke.co.statum.response.Response;

@Service
public class PascalImplementationService {
	
	@Autowired
	private Response response;

	public PascalImplementationService(Response response) {
		this.response = response;
	}
	
	public Object processApiRequest(RequestModel request) {
		if (request.getIndex() != null) {
			return getRow(request);
		} else {
			return this.response.missingRequestData();
		}

	}
	
	public Object getRow(RequestModel request) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		 
		if (request.getIndex() < 0)
			return result;
	 
		result.add(1);
		for (int i = 1; i <= request.getIndex(); i++) {
			for (int j = result.size() - 2; j >= 0; j--) {
				result.set(j + 1, result.get(j) + result.get(j + 1));
			}
			result.add(1);
		}
		return result;
	}
	

}
