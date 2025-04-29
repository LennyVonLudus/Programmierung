package p2;

public class Person {
	String firstName = "";
	String lastName  = "";
	int age = 0;
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	String getInfo() {
		return firstName + ", " + lastName + ", " +age;
	}
}
