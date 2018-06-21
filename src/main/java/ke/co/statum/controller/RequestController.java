/**
 * Rest controller
 * @PostMapping FOR API endpoint
 * by Bob
 */
package ke.co.statum.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ke.co.statum.model.RequestModel;
import ke.co.statum.service.PascalImplementationService;
import ke.co.statum.service.StringSortService;
import ke.co.statum.service.ValidParentheses;

@RestController
@RequestMapping("/api")
public class RequestController {

	private StringSortService apiRequestValidation;
	private PascalImplementationService pascalImplementationService;
	private ValidParentheses validParentheses;

	@Autowired
	public RequestController(StringSortService apiRequestValidation,
			PascalImplementationService pascalImplementationService, ValidParentheses validParentheses) {
		this.apiRequestValidation = apiRequestValidation;
		this.pascalImplementationService = pascalImplementationService;
		this.validParentheses = validParentheses;
	}

	private final Logger logger = LogManager.getLogger(RequestController.class);

	/**
	 * Given a string, that contains special character together with alphabets (‘a’
	 * to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters
	 * are not affected.
	 * 
	 */
	@PostMapping(path = "/v1/string-sort", consumes = "application/json")
	public Object receiveStringSortApiRequest(@RequestBody final RequestModel request) {

		logger.info("Request Received " + request.toString());

		return this.apiRequestValidation.processApiRequest(request);

	}

	/**
	 * Given an index k, return the kth row of the Pascal's triangle
	 */
	@PostMapping(path = "/v1/pascal-sort", consumes = "application/json")
	public Object receivePascalApiRequest(@RequestBody final RequestModel request) {

		logger.info("Request Received " + request.toString());

		return this.pascalImplementationService.processApiRequest(request);

	}

	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid. The brackets must close in the
	 * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 */
	@PostMapping(path = "/v1/isvalid-string", consumes = "application/json")
	public Object receiveIsValidParenthesesApiRequest(@RequestBody final RequestModel request) {

		logger.info("Request Received " + request.toString());

		return this.validParentheses.processApiRequest(request);

	}

}
