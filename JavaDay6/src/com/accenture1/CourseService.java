package com.accenture1;

import java.util.Collections;
import java.util.List;

public class CourseService {
	void Printallcourses(List<Course> T) {
		T.forEach((x) -> System.out.println(x.getCourseDuration()+" "+ x.getCourseFee() 
		+" "+ x.getCourseId()+" " + x.getCourseName()));
		
		
	}

}
