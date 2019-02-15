package com.sindhu.springboot.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/sindhu")
	public String sayHi() {
		return "Hello Sindhu";
	}
}
