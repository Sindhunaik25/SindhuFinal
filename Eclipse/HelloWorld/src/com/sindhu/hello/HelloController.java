package com.sindhu.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/hello")
public String hello()
{
return "hello";
}
@RequestMapping("/")
public String welcome()
{
return "welcome";
}
}
