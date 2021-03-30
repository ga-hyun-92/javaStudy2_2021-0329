package chapter2;
//time패키지
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex7 {

	public static void main(String[] args) {
		// 객체의 타입에 Date단어가 들어갔으므로 날짜를 다룬다.
		LocalDate localDate=LocalDate.now();
		//객체의 타입에 Time단어가 들어갔으므로 시간을 다룬다.
		LocalTime localTime=LocalTime.now();
		//객체타입에 Date,Time단어가 모두 들어갔으므로 날짜와 시간을 다룬다.
		LocalDateTime localDateTime=LocalDateTime.now();
		//Zone->시간대, Date->날짜, Time->시간/시간대까지 갖고 있는 날짜와 시간을 다룬다.
		ZonedDateTime zoneDateTime=ZonedDateTime.now();
		
		System.out.println("========= ========");
		//2021-03-25날짜를 갖고 있는 객체 생성
		LocalDate ld=LocalDate.of(2021, 03, 25);
		//1:12:34시간을 갖고 있는 객체 
		LocalTime lt=LocalTime.of(1, 12,34);
		//2021-03-25 1:12:34 날짜와 시간을 갖고 있는 객체 
		LocalDateTime ldt=LocalDateTime.of(ld, lt);
		//날짜,시간+시간대까지 갖고 있는 객체 
		ZonedDateTime zdt=ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul")); //두번째 부분에는 어떤 객체의 시간대인지?우리나라/서울 이라고 표시해두는 것
		ZonedDateTime zdt2=ZonedDateTime.of(ldt, ZoneId.of("America/New_York"));
	}

}
