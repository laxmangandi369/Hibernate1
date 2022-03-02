package java8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Rohan");
		str.add("Mukul");
		str.add("Praveen");
		str.add("Manish");
		str.add("anita");
		convert(str);
		
	}
	public static void convert(List<String> list)
	{
		
		for(String str:list)
		{
			System.out.print(str.toUpperCase()+",");
		}
//		System.out.println(Arrays.asList(list));
	}
	
}
