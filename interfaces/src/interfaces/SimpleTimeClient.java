package interfaces;

import java.time.*;
import java.lang.*;
import java.util.*;

public class SimpleTimeClient implements TimeClient{
	private LocalDateTime dateAndTime;
	
	public SimpleTimeClient() {
		dateAndTime = LocalDateTime.now();
	}
	
	public void setTime(int hour, int minute, int second) {
		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}
	
	public void setDate(int day, int month, int year) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime currentTime = LocalTime.from(dateAndTime);
		dateAndTime = LocalTime.of(dateToSet, currentTime);
	}
	
	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}
	
	public String toString() {
		return dateAndTime.toString();
	}
	


}
