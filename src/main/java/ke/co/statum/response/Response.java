/**
 * 
 */
package ke.co.statum.response;

import java.util.HashMap;

import org.springframework.stereotype.Service;

/**
 * @author bob
 *
 */
@Service
public class Response {

	public Object missingRequestData() {
		HashMap<String, String> response = new HashMap<String, String>();

		response.put("description", "Bad Request");
		response.put("status", "400");
		
		return response;
	}

	
	
	

	
	
}
