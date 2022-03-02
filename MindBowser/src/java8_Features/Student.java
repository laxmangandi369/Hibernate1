package java8_Features;

public class Student {
	private String name;
	private String dob;
	private String number;
	
	public Student() {
		super();
	}

	public Student(String name, String dob, String number) {
		super();
		this.name = name;
		this.dob = dob;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return name+","+dob+","+number;
	}
	
}
