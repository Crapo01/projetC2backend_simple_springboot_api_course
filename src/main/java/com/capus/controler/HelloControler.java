package com.capus.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//A convenience annotation that is itself annotated with @Controller and @ResponseBody. 

@RestController
public class HelloControler {
/*	
	@PostMapping
	@DeleteMapping
	@PutMapping
*/
	@GetMapping("/hello")
	public String hello() {
		return "hello world!";

}
}
