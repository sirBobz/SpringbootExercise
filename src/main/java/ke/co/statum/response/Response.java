/**
 * 
 */
package ke.co.statum.response;

import java.util.HashMap;

/**
 * @author dibon
 *
 */
public class Response {

	public Object missingRequestData() {
		HashMap<String, String> response = new HashMap<String, String>();

		response.put("status", "401");
		response.put("description", "Missing Parameters on Request Body");

		return response;
	}

}
