package SerializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) {
		try
		{
			Employee emp1=new Employee(1,"Rohan");
			FileOutputStream fos = new FileOutputStream("C:/Users/91620/Desktop/abc.txt");
			ObjectOutput oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			oos.flush();
			oos.close();
			System.out.println("writing complete");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		//Deserialization
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:/Users/91620/Desktop/abc.txt"));
			Employee emp = (Employee)in.readObject();
			System.out.println(emp.empid+" "+emp.empname);
			in.close();
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
	}
}
