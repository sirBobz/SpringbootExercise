package ke.co.statum.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import antlr.collections.Stack;
import ke.co.statum.model.RequestModel;

@Service
public class ValidParentheses {

	

	public Object processApiRequest(RequestModel request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object isValidString() {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}

}
