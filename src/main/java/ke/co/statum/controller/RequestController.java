	/**
	 * Rest controller
	 * @PostMapping FOR API endpoint
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
import ke.co.statum.service.RequestService;



@RestController
@RequestMapping("/api")
public class RequestController {
	
	@Autowired
	private RequestService apiRequestValidation;

	private final Logger logger = LogManager.getLogger(RequestController.class);

	/**
	 * @PostMapping FOR API endpoint
	 */
	@PostMapping(path = "airtime/v1/paymentrequest", consumes = "application/json", produces = "application/json")
	public Object receiveApiRequest(@RequestBody RequestModel request) {

		logger.info("Request Received " + request.toString());
		return apiRequestValidation.processApiRequest(request);

	}

}
