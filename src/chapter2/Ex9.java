package chapter2;
//LocalDateTime
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex9 {

	public static void main(String[] args) {
		//1.
		LocalDateTime dateTime=LocalDateTime.now();
		
		//2.
		dateTime=LocalDateTime.of(2020,01,19,00,00,00);
		
		//3.
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		dateTime=LocalDateTime.of(date,time);
		
		date=dateTime.toLocalDate();
		time=dateTime.toLocalTime();

		dateTime=date.atTime(time);//날짜에 시간을 더함
		dateTime=time.atDate(date);//시간에 날짜를 더함
		
	}

}
