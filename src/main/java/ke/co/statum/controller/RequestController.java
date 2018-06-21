/**
 * Rest controller
 * @PostMapping FOR API endpoint
 */
package ke.co.statum.controller;

import javax.validation.Valid;

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

@RestController
@RequestMapping("/api")
public class RequestController {

	
	private StringSortService apiRequestValidation;
	private PascalImplementationService pascalImplementationService;

	@Autowired
	public RequestController(StringSortService apiRequestValidation, PascalImplementationService pascalImplementationService) {
		this.apiRequestValidation = apiRequestValidation;
		this.pascalImplementationService = pascalImplementationService;
	}
	

	private final Logger logger = LogManager.getLogger(RequestController.class);

	/**
	 * Given a string, that contains special character together 
	 * with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a 
	 * way that special characters are not affected.
	 * 
	 */
	@PostMapping(path = "/v1/string-sort", consumes = "application/json")
	public Object receiveStringSortApiRequest(@RequestBody final RequestModel request) {

		logger.info("Request Received " + request.toString());

		return this.apiRequestValidation.processApiRequest(request);

	}
	
	
	/**
	 * Given an index k, 
	 * return the kth row of the Pascal's triangle
	 */
	@PostMapping(path = "/v1/pascal-sort", consumes = "application/json")
	public Object receivePascalApiRequest(@RequestBody final RequestModel request) {

		logger.info("Request Received " + request.toString());

		return this.pascalImplementationService.processApiRequest(request);

	}

}
