package agh.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	private List<Course> courses=new ArrayList(Arrays.asList(
			new Course("java","Java","Introduction to Java"),
			new Course("spring","Spring","Introduction to Spring Framework"),
			new Course("scala","Scala","Introduction to Scala")
		)); 
public List<Course> getCourses(){
	return courses;
}
public Course getCourse(String id) {
	// TODO Auto-generated method stub
	return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}
public int getListId(Course course) {
	return courses.indexOf(course);
}
public void addCourse(Course course) {
	courses.add(course);
}
public void deleteCourse(String id) {
	courses.remove(getListId(getCourse(id)));
}
public void updateCourse(String id,Course course) {
	courses.set(getListId(getCourse(id)), course);
}
}
