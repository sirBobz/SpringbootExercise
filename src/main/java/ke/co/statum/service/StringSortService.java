package ke.co.statum.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.statum.model.RequestModel;
import ke.co.statum.response.Response;

@Service
public class StringSortService {

	@Autowired
	private Response response;

	public StringSortService(Response response) {
		this.response = response;
	}

	public Object processApiRequest(RequestModel request) {
		if (request.getString() != null && !request.getString().isEmpty()) {
			return reverseString(request);
		} else {
			return this.response.missingRequestData();
		}

	}
	
	/**  
	* Algorithm:  
	* 1. create temporary array  
	* 2. copy all character from original array excluding special character  
	* 3. reverse the temporary array  
	* 4. start copying temporary array into original if element is an alphabetic character  
	* @param input  
	* @return  
	*/ 
	public Object reverseString(RequestModel request) {

		char[] inputArr = request.getString().toCharArray();
		char[] tempArr = new char[request.getString().length()];
		int i = 0;
		int j = 0;
		for (char ch : inputArr) {
			if (Character.isAlphabetic(ch)) {
				tempArr[i] = ch;
				i++;
			}
		}
		i--;
		while (j < i) {
			char temp = tempArr[i];
			tempArr[i] = tempArr[j];
			tempArr[j] = temp;
			j++;
			i--;
		}
		for (i = 0, j = 0; i < request.getString().length(); i++) {
			if (Character.isAlphabetic(inputArr[i])) {
				inputArr[i] = tempArr[j++];
			}
		}
		return inputArr;
	}

	public Object validateRequest(RequestModel request) {
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
