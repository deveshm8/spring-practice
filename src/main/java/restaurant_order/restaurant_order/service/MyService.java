package restaurant_order.restaurant_order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import restaurant_order.restaurant_order.entity.Course;

@Service
public class MyService implements IMyService {
	
	public List <Course> list;
	
	public MyService(){
		list = new ArrayList<>();
		list.add(new Course(1, "your monday", "devesh"));
		list.add(new Course(2, "your chicken", "tushar"));
	}
	public List<Course> getCources() {
		// TODO Auto-generated method stub
		return list;
	}
	
	public Course getCourse(long id) {
		// TODO Auto-generated method stub
		
		Course c = null;
		for(Course i:list) {
			if(i.getId() == id) {
				c = i;
				break;
			}
		}
		return c;
	}
	
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public int updateCourse(long id1, Course course) {
		// TODO Auto-generated method stub
		for(Course c:list) {
			if(c.getId() == id1) {
				c.setAuthor(course.getAuthor());
				c.setName(course.getName());
				return 1;
			}
		}
		return -1;
	}
	
	

}
