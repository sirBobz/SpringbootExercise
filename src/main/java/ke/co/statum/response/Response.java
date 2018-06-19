/**
 * 
 */
package ke.co.statum.response;

import java.util.HashMap;

/**
 * @author bob
 *
 */
public class Response {

	public Object missingRequestData() {
		HashMap<String, String> response = new HashMap<String, String>();

		response.put("status", "400");
		response.put("description", "Data on Request Body");

		return response;
	}

}
