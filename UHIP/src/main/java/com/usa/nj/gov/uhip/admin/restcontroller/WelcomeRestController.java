package com.usa.nj.gov.uhip.admin.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usa.nj.gov.uhip.admin.util.UhipAppProperties;

@RestController
public class WelcomeRestController {
	private static final Logger logger11 = LoggerFactory.getLogger(WelcomeRestController.class);
	@Autowired
	private UhipAppProperties uhipAppProps;

	@GetMapping("/test")
	public String get() {
		logger11.debug(" *** get() started***");
		logger11.info(" Appln properties:: ");
		logger11.debug(" *** get() ended***");
		
		return "welcome";
		
		
	}
}
