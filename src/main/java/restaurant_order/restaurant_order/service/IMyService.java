package restaurant_order.restaurant_order.service;

import java.util.List;

import restaurant_order.restaurant_order.entity.Course;


public interface IMyService {
	public List<Course> getCources();
	Course getCourse(long id);
	public Course addCourse(Course course);
	public int updateCourse(long id1, Course course);
	public int delete(long id);
}
