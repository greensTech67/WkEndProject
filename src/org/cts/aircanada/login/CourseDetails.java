package org.cts.aircanada.login;

public class CourseDetails {
	
	private void javaCourse() {
		System.out.println("Java");

	}
	
	private void seleniumCourse() {
		System.out.println("Selenium");

	}
	
	private void oracleCourse() {
		System.out.println("Oracle");

	}
	
	public static void main(String[] args) {
		
		//Create an object --- ClassName obj/RefName = new ClassName();
		
		CourseDetails cou = new CourseDetails();
		
		//Call the methods -- ObjName.MethodName();
		
		cou.javaCourse();
		cou.oracleCourse();
		cou.seleniumCourse();
		
		
	}
	

}

