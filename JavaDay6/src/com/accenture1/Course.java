package com.accenture1;

public class Course  implements Comparable<Course>{
	private int courseId;
	private String courseName;
	private int CourseDuration;
	private int courseFee;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return CourseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		CourseDuration = courseDuration;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public Course(int courseId, String courseName, int courseDuration, int courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		CourseDuration = courseDuration;
		this.courseFee = courseFee;
	}
	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		if(this.getCourseFee() > o.getCourseFee()) {
			return 1;
		}
		else if(this.getCourseFee() <o.getCourseFee()) {
			return -1;
			
		}
		else {
			return 0;
		}
		
	}
	
	


}
