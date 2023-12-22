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

}
