package haagahelia.modelandview2.domain;

public class Student {
	public String firstName;
	public String lastName;
	
	public Student(String studentFirstName, String studentLastName) {
		firstName = studentFirstName;
		lastName = studentLastName;
	}

	
	public String getName() {
		return firstName + " " + lastName;
	}


	private String getFirstName() {
		return firstName;
	}


	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	private String getLastName() {
		return lastName;
	}


	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
