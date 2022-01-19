package agh.demo.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	@RequestMapping(method = RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	@RequestMapping(method = RequestMethod.PUT, value="/courses/{id}")
	public void updateCourse(@PathVariable String id,@RequestBody Course course) {
		courseService.updateCourse(id,course);
	}
}
