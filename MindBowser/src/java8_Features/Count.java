package java8_Features;

import java.util.ArrayList;
import java.util.List;

public class Count {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Rohan");
		str.add("Mukul");
		str.add("Praveen");
		str.add("Manish");
		str.add("anita");
		System.out.println(count(str));
		
	}
	public static int count(List<String> s)
	{
		int count=0;
		for(String str: s)
		{
			if(str.charAt(0)=='a')
			{
				count++;
			}
		}
		return count;
	}
	
}
