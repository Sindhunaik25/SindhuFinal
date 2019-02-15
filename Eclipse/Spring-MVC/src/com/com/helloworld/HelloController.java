package com.helloworld;

@Controller

public class HelloController {
	/*@RequestMapping(method = RequestMethod.GET)*/
	@RequestMapping("/helloworld")
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "helloworld";//view name
	}
}
