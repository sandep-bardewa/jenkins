package com.arlo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	
	private static final String VAL = "dockerization started";

	@RequestMapping("/docker")
	public String dockerGet() {
		return VAL;
	}
}
