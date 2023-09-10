package day5;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;
import java.util.Calendar;
public class DayMain {
	public static void main(String[] args) {
		// disTime();
		// disDate();
		// disDateTime();
		// compareDate();
		// test();
		disPlay4();
		// disPlay5();
	}

	public static void disTime() {
		LocalTime myTime = LocalTime.now();
		System.out.println("Time: " + myTime);
	}

	public static void disDate() {
		LocalDate myDate = LocalDate.now();
		System.out.println("Year - Month - Day: " + myDate);
	}

	public static void disDateTime() {
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Befor: " + myDateTime);
		DateTimeFormatter formatDayTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String affterDateTime = myDateTime.format(formatDayTime);
		System.out.println("Affter: " + affterDateTime);
	}

	public static void compareDate() {
		String dateStr1 = "2023-09-08";
		String dateStr2 = "2023-09-09";
		// thiet lap dinh dang
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		// chuyen doi string to localDate
		LocalDate strLocalDate1 = LocalDate.parse(dateStr1);
		LocalDate strLocalDate2 = LocalDate.parse(dateStr2);
		// hien thi chuoi
		System.out.println("String to LocalDate: " + myFormatObj.format(strLocalDate1));
		System.out.println("String to LocalDate: " + myFormatObj.format(strLocalDate2));
		System.out.println("Date1 compare with Date2 : " + strLocalDate1.equals(strLocalDate2));

	}

	public static void disPlay4() {
		LocalDate Date1 = LocalDate.of(2009, 12, 31);
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("LocalDate 1: " + myFormatObj1.format(Date1));

		DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("LocalDate 2: " + myFormatObj2.format(Date1));

		LocalTime time = LocalTime.of(23, 59, 59);
		DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
		String str = myFormatObj3.format(Date1) + " " + time;
		System.out.println("LocalDate 4: " + str);
	}

	public static void disPlay5() {
		LocalTime time1 = LocalTime.of(10, 43, 12);
		System.out.println(time1);
		LocalTime time2 = time1.minusHours(8);
		LocalTime time3 = time2.minusMinutes(34);
		System.out.println(time3);
	}
}