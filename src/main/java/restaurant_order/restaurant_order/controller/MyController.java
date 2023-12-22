package restaurant_order.restaurant_order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/home")
	public String map() {
		return "hi this is devesh";
	}
	
}
