package com.arlo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	
	private static final String VAL = "dockerization with jenkins";

	@RequestMapping("/docker")
	public String dockerGet() {
		return VAL;
	}
}
