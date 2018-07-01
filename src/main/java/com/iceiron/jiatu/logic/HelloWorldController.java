package com.iceiron.jiatu.logic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "hello 李承暄!";
	}
}