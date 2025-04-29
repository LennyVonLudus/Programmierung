package p2;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Alice", "ANders", 34);
		System.out.println(p.getInfo());
		
		Student s = new Student("Bob", "Bücher", 22, 456789, 3);
		s.addCourse("WfKdP");
		s.addCourse("MI2");
		s.printCourseList();
		System.out.println(s.getInfo());
		
		PhDStudent phd = new PhDStudent("Charlie", "Clever");
		Systemm.out.println(phd.getInfo());
	}

}
