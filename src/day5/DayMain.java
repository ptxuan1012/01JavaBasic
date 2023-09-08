package day5;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DayMain {
	public static void main(String[] args) {
		//disTime();
		//disDate();
		disDateTime();
	}
	public static void disTime() {
		LocalTime myTime = LocalTime.now();
		System.out.println("Time: " +myTime);
	}
	public static void disDate() {
		LocalDate myDate = LocalDate.now();
		System.out.println("Year - Month - Day: " +myDate);
	}
	public static void disDateTime() {
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Befor: " + myDateTime);
		DateTimeFormatter formatDayTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String affterDateTime = myDateTime.format(formatDayTime);
		System.out.println("Affter: "+ affterDateTime);
	}

}
