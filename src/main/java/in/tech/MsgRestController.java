package in.tech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private static Logger logger = LoggerFactory.getLogger(MsgRestController.class);

	@GetMapping("/greet")
	public String getMsg2() {
		logger.info("getMsg2() started");
		String msg = "Good Evening";
		logger.info("getMsg2() End");
		return msg;
	}

	@GetMapping("/welcome")
	public String getMsg() {

		logger.info(" getMsg() -execution started ");

		String msg = "Welcome to MY Company";

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception " + e.getMessage());
		}

		return msg;
	}
}
