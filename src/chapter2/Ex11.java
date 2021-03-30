package chapter2;
import java.time.Duration;
//Period
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex11 {

	public static void main(String[] args) {
		
		LocalTime time1=LocalTime.of(0, 0,0);
		LocalTime time2=LocalTime.of(9, 12, 34);
		
		Duration duration=Duration.between(time1, time2);
		System.out.println(duration);//PT9H12M34S : 9�ð� 12�� 34�� ���̳���.
		
		LocalDate date1=LocalDate.of(2020, 1, 19);
		LocalDate date2=LocalDate.now();
		
		Period period=Period.between(date1, date2);
		System.out.println(period);//P1Y2M11D : 1�� 2���� 11���� ������.
		
		period=Period.between(date2, date1);
		System.out.println(period);//P-1Y-2M-11D : -�� ǥ�õ�, 1�� 2���� 11�� '��'�̴�.

	}

}
