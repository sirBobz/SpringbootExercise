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

	// If the current index contains one of the open brackets push the string to
	// stack.
	// If the current index contains the close bracket. Pop the element from the top
	// of stack
	// If the pop element is the correct pair of the current index, continue
	// traversing the string, else return false
	// If end of string is return check whether stack is empty. If stack is empty
	// return true else return false

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
				if (set.isEmpty() || set.peek() != '(')
					return false;
				set.pop();
			} else if (ch == '}') {
				if (set.isEmpty() || set.peek() != '{')
					return false;
				set.pop();
			}
		}
		return set.size() == 0;
	}

}
