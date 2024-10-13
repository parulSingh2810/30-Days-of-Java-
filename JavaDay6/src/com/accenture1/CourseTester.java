package com.accenture1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.PrintService;

public class CourseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course(1,"CO",20,7890);
		Course c2 = new Course(3,"DBMS",20,781290);
		Course c3 = new Course(2,"Compiler Design",20,7892310);
		ArrayList<Course> l = new ArrayList<>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		CourseService cs = new CourseService();
		
		 
		cs.Printallcourses(l);
		System.out.println("---------------------------");
		
		Collections.sort(l);
		
		cs.Printallcourses(l);
		Collections.sort(l, new FeeComparator());
		System.out.println("---------------------------");
		cs.Printallcourses(l);
		


		
		
		
		
		
		
		

	}

}
