package p2;

import java.util.ArrayList;

public class Student extends Person {
	int matNr = 0;
	int semester = 0;
	ArrayList<String> courses = new ArrayList<>();
	
	public Student(String firstName, String lastName, int age, int matNr, int semester) {
		super(firstName, lastName, age);
		this.matNr = matNr;
		this.semester = semester;
	}
	public void addCourses(String course) {
		courses.add(course);
	}
	public void printCourseList() {
		for(String course: courses) {
			System.out.println(course);
		}
	}
	@Override
	public String getInfo() {
		return super.getInfo() + ", " + matNr + ", " + semester;
	}
}
