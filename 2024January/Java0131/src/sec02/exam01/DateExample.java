package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(now));
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		LocalTime date2 = LocalTime.now();
		System.out.println(date2);
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
	}
}
