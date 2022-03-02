package java8_Features;

import java.util.ArrayList;
import java.util.List;

public class StudentToString {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		Student s = new Student("rohan","11/01/1997","8668530410");
		Student s1=new Student("tanya","26/sep/2003","799517263");
		Student s2= new Student("anand","12/11/1997","8263541451");
		student.add(s);
		student.add(s1);
		student.add(s2);
		System.out.println(toStudentString(student));
	}
	public static List<String> toStudentString(List<Student> students)
	{
		List<String> name = new ArrayList<>();
		for(Student sname:students)
		{
			name.add(sname.getName());
		}
		return name;
	}
}
