package java8_Features;

import java.util.Set;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class LambdaExpression {
	

	public static String pro(String str, Processor p) {
		return p.process(str);
	}
	
	
	public static void main(String[] args) {
		System.out.println(pro("hello world",str->{return str.toUpperCase();}));
		Car car = new Car("BMW");
		car.turnAlarmon();
	}
	
	interface Processor {
	default String processinterface(String str) {
		return "okay";
	}
		String process(String str);
	}
}
interface Vehicle{
	String getBrand();
	String speedUp();
	default String turnAlarmon()
	{
		return "turning the alarm on";
	}
	default String turnOff()
	{
		return "turning the alarm off";
	}
	 static void turnRight()
	{
		 System.out.println("static interface methods");
	}
}
class Car implements Vehicle
{
	private String name;
	

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "getting the turbos on";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}