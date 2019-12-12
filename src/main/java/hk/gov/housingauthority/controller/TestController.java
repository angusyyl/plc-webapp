package hk.gov.housingauthority.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v1")
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "Hello Test";
	}
}