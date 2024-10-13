package com.accenture.inhertance;
public class Person{
	
	private String firstname;
	private String lastname;
	private int age;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Defalt constructor
	Person(){
		firstname ="Parul";
		lastname = "Singh";
		age= 5;
	}
	
	//parameterized constructor
	Person(String firtname, String lastname, int age){
		this.firstname ="Parul";
		this.lastname = "Singh";
		this.age= 5;
	}
	void printEmployeeDetail() {
		System.out.println(getAge());
		System.out.println(getFirstname());
		System.out.println(getLastname());
	}
}

