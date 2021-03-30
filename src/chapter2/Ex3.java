package chapter2;

import java.util.Calendar;

//유닉스 타임스탬프
//-유닉스OS가 개발된 날짜를 기준으로 현재까지 몇초가 흘렀는지 계산
//-어떤 시점을 기준으로 해서 그때부터 몇초가 흘렀는지 계산하는거!!
public class Ex3 {
	static final int DAY_IN_SECOND=24*60*60;
	static final int HOUR_IN_SECOND=60*60;
	static final int MINUTE_IN_SECOND=60;

	public static void main(String[] args) {
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		
		//Calendar는 '월'을 0부터 카운팅을 함.
		cal1.set(2021,Calendar.JANUARY,1);//Calendar.JANUARY - static 멤버변수 호출
		cal2.set(2021, Calendar.JANUARY,2);
		
		long cal1ToSecond=cal1.getTimeInMillis();
		long cal2ToSecond=cal2.getTimeInMillis();
		
		long difference=cal2ToSecond-cal1ToSecond;
		difference=difference/1000;//1월2일에서 1월1일을 뺀 하루라는 시간을 밀리초로 바꾼거->초 단위로 바꿈
		
		System.out.println(difference+"초가 흘렀습니다.");
		
		//초단위를 일 단위로 환산
		int peroid=(int)(difference/DAY_IN_SECOND);
		System.out.println(peroid+"일 경과");
		
		//초단위를 시간 단위로 환산
		int peroid2=(int)(difference/HOUR_IN_SECOND);
		System.out.println(peroid2+"시간 경과");
		
		//초단위를 분단위로 환산
		int peroid3=(int)(difference/MINUTE_IN_SECOND);
		System.out.println(peroid3+"분 경과");
		
		
		

	}

}
