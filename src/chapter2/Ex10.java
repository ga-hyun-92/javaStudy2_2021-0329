package chapter2;
///ZonedDateTime
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Ex10 {

	public static void main(String[] args) {
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		//시간대의 차이->offset
		ZoneOffset krOffset=zdt.getOffset();
		System.out.println(krOffset);//세계 표준시간에 비해서 우리나라 시간이 얼마나 차이나는지
		
		ZoneId nyId=ZoneId.of("America/New_York");
		zdt=ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(zdt);
		ZoneOffset nyOffset=zdt.getOffset();
		System.out.println(nyOffset);
		
		//현재 시스템의 날짜와 시간을 갖는 객체
//		LocalDateTime dateTime=LocalDateTime.now();
//		//한국의 시간대라는 정보를 갖고 있음.
//		//Asia/Seoul->서울
//		//Asia/Japan->일본
//		//타임존,시간대,zone id 키워드 검색해보면 자세히 나와있음
//		ZoneId zoneId=ZoneId.of("America/New_York");
//
//		//dateTime 객체가 갖고 있는 날짜와 시간을 Asia/Seoul의 날짜와 시간이라고 표시 지정
//		//2021-03-30 16:49:12뉴욕의 시간이다.
//		ZonedDateTime zdt=dateTime.atZone(zoneId);
//		
//		System.out.println(dateTime);
//		System.out.println(zdt);
	}

}
