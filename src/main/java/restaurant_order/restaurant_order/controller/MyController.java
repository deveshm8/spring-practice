package restaurant_order.restaurant_order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant_order.restaurant_order.entity.Course;
import restaurant_order.restaurant_order.service.IMyService;

@RestController
public class MyController {
    @GetMapping("/api/home")
	public String map() {
		return "hi this is devesh";
	}
    @Autowired
	IMyService IServiceObj;
    @GetMapping("/api/courses")
    public List<Course> getCources(){
       System.out.print("inside service");
       return this.IServiceObj.getCources() ;	
    }
}
