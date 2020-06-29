package util.core;

public class Student {
	
	String firstName;
	String LastName;
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	
}
