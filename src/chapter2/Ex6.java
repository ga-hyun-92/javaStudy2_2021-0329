package chapter2;

//날짜 관련 형식화 : SimpleDateFormat
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		
		SimpleDateFormat sdf;
		
		//y:년, M:월, d:일
		//yyyy->년을 출력하는데 4자리로 출력해라
		//MM->월을 출력하는데 두자릿수 월로 출력해라
		//dd->일을 출력하는데 두자릿수 일로 출력해라
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));

		sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		
		sdf=new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println(sdf.format(date));
		
		sdf=new SimpleDateFormat("yy년 M월 d일 HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf=new SimpleDateFormat("yy년 M월 d일 H:m:s");
		System.out.println(sdf.format(date));
		
		sdf=new SimpleDateFormat("yy년 M월 d일 H:m:s.SSS");
		System.out.println(sdf.format(date));
		
		sdf=new SimpleDateFormat("yy년 M월 d일 h:m:s.SSS");
		System.out.println(sdf.format(date));
		
		sdf=new SimpleDateFormat("yy년 M월 d일 h:m:s.SSS a");//a: 오전인지 오후인지
		System.out.println(sdf.format(date));
		
	}

}
