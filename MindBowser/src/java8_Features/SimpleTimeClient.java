package java8_Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Function;

public class SimpleTimeClient implements TimeClient {
	
	private LocalDateTime localDateTime;
	public SimpleTimeClient() {
		localDateTime= LocalDateTime.now();
	}

	@Override
	public void setTime(int hr, int min, int sec) {
		LocalDate localDate = LocalDate.from(localDateTime);
		LocalTime localTime = LocalTime.of(hr, min,sec);
		localDateTime = LocalDateTime.of(localDate,localTime);
	}

	@Override
	public void setDate(int day, int month, int year) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(localDateTime);
        localDateTime = LocalDateTime.of(dateToSet, currentTime);
		
	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hr, int min, int sec) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hr, min, sec); 
        localDateTime = LocalDateTime.of(dateToSet, timeToSet);
		
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	@Override
	public String toString() {
		
		return localDateTime.toString();
	}
	
	
	
	public static void main(String[] args) {
		SimpleTimeClient timeClient = new SimpleTimeClient();
		System.out.println(timeClient.toString());
	}
}
 interface TimeClient{
	void setTime(int hr,int min,int sec);
	void setDate(int day,int month,int year);
	void setDateAndTime(int day,int month,int year,int hr,int min,int sec);
	LocalDateTime getLocalDateTime();
}