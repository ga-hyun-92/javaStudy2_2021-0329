package chapter2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex8 {

	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		LocalDate date=LocalDate.now();
//		LocalDate today=LocalDate.now();
//		LocalDate yesterday=today.minusDays(1);
//		
//		System.out.println(today.isAfter(yesterday));//today가 yesterday 후 인가요??
//		System.out.println(today.isBefore(yesterday));//today가 yesterday 전 인가요??
//		
//		System.out.println(yesterday.isAfter(today));
//		System.out.println(yesterday.isBefore(today));
		
		System.out.println(date.plusYears(1));//더해진 새로운 객체가 만들어짐.Calendar에서 add와 비슷한 역할의 메서드
		System.out.println(date.minusYears(0));
		System.out.println(date.plusMonths(5));
		System.out.println(date.plusDays(21));
		
		System.out.println(time.plusHours(2));
		
		
		System.out.println("시: "+time.getHour());
		System.out.println("분: "+time.getMinute());
		System.out.println("초: "+time.getSecond());
		
		//date객체가 갖고 있는 YEAR필드의 값을 2022로 바꿔라
		//date객체가 갖고 있던 월,일 값은 그대로 유지하고 YEAR 필드의 값만 2022로 바꿔서 
		//year-2022,month-date객체가 갖고 있던 월, day-date객체가 갖고 있던 일/을 갖고 있는
		//새로운 LocalDate객체를 반환
		LocalDate newDate=date.with(ChronoField.YEAR,2022);
		System.out.println(newDate);
		
		System.out.println(date.with(ChronoField.MONTH_OF_YEAR,7));
		
		System.out.println(date.with(ChronoField.DAY_OF_MONTH,21));
		
		System.out.println(time.with(ChronoField.HOUR_OF_DAY,11));
		System.out.println(time.with(ChronoField.MINUTE_OF_HOUR,38));
		System.out.println(time.with(ChronoField.SECOND_OF_MINUTE,7));
		
		System.out.println("올해="+date.getYear());
		
		System.out.println("이번달="+date.getMonthValue());
		System.out.println("이번달="+date.getMonth());
//		
		System.out.println("오늘의 날짜"+date.getDayOfMonth());
		System.out.println("1월 1일부터 경과한 일 수="+date.getDayOfYear());
//		
		System.out.println("오늘의 요일="+date.getDayOfWeek());
//
		System.out.println("이번 달의 일 수="+date.lengthOfMonth());
		System.out.println("올해의 일 수="+date.lengthOfYear());
//		
		System.out.println("올해의 윤년 여부="+date.isLeapYear());
		
	}

}
