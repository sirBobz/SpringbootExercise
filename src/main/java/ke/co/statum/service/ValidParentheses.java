package ke.co.statum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Stack;
import ke.co.statum.model.RequestModel;
import ke.co.statum.response.Response;

@Service
public class ValidParentheses {

	@Autowired
	private Response response;

	public ValidParentheses(Response response) {
		this.response = response;
	}

	public Object processApiRequest(RequestModel request) {
		if (request.getString() != null && !request.getString().isEmpty()) {
			return isValidparentheses(request);
		} else {
			return this.response.missingRequestData();
		}
	}

	public Object isValidparentheses(RequestModel request) {
		char arr[] = request.getString().toCharArray();
		Stack<Character> set = new Stack();
		for (Character ch : arr) {
			if (ch == '{' || ch == '[' || ch == '(') {
				set.push(ch);
			} else if (ch == ']') {
				if (set.isEmpty() || set.peek() != '[') {
					return false;
				} 
				set.pop();
			} else if (ch == ')') {
				if (set.isEmpty() ||  set.peek() != '(') 
					return false;
				set.pop();	
			} else if (ch == '}') {
				if (set.isEmpty() ||  set.peek() != '{') 
					return false;
				set.pop();	
			}
		}
		return set.size() == 0;
	}

}
