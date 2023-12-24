package restaurant_order.restaurant_order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    
    @GetMapping("/api/courses/{id}")
    public Course getCourse(@PathVariable String id) {
    	return this.IServiceObj.getCourse(Long.parseLong(id));
    }
    
    @PostMapping("/api/courses")
    public Course addCourse(@RequestBody Course course ) {
    	return this.IServiceObj.addCourse(course);
    }
    
    @PutMapping("/api/courses/{id}")
    public int updateCourse(@PathVariable String id, @RequestBody Course course) {
    	
    	return this.IServiceObj.updateCourse(Long.parseLong(id), course);
    }
    
    @DeleteMapping("/api/courses/{id}")
    public int deleteCourse(@PathVariable String id){
    	
    	return this.IServiceObj.deleteCourse
    	
    }
}
