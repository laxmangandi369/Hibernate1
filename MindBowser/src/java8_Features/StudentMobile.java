package java8_Features;

import java.util.ArrayList;
import java.util.List;

public class StudentMobile {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		Student s = new Student("rohan","11/01/1997","8668530410");
		Student s1=new Student("tanya","26/sep/2003","799517263");
		Student s2= new Student("anand","12/11/1997","8263541451");
		Student s3=new Student("prithivi","111/11/1991","3333");
		student.add(s);
		student.add(s1);
		student.add(s2);
		student.add(s3);
		mobile(student);
	}
	public static void mobile(List<Student> list)
	{
		for(Student s:list)
		{
			if(s.getNumber()=="3333")
			{
				System.out.println(s.toString());
			}
		}
		
	}
	
	
	
}
