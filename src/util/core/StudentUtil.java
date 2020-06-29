package util.core;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {

	static List<Student> studentList = new ArrayList<>();

	public static List<Student> getStudents() {

		Student s1 = new Student("Mathankumar", "M");
		Student s2 = new Student("Dhanya", "M");
		studentList.add(s1);
		studentList.add(s2);
		return studentList;
	}
}
