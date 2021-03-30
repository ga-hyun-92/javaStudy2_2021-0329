package chapter2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex12 {
	public static String toString(LocalDate date) {
		String year=date.getYear()+"��";
		String month=date.getMonthValue()+"��";
		String day=date.getDayOfMonth()+"��";
		
		return year+month+day;
	}
	
	public static void main(String[] args) {
		//�ð����� Ȱ��
		LocalTime time1=LocalTime.of(0, 0,0);
		LocalTime time2=LocalTime.of(9, 12,34);
		
		//Duration: �� ���� ���̸� �� �� ����
		Duration duration=Duration.between(time1, time2);
		//�� ���� ����
		long second=duration.get(ChronoUnit.SECONDS);
		//������ ���� ���� / �и���(1/1000),����ũ����(1/1,000,000),������(1,000,000,000)
		long nano=duration.get(ChronoUnit.NANOS);
		
		System.out.println(second);//33154�� ���̳�.
		System.out.println(nano);
		
		//���� ����ϴ� ��.
		long hour=second/(60*60);
		System.out.println(hour+"�ð�");
		
		long minute=(second-(hour*3600))/60;
		System.out.println(minute+"��");
		
		second=second-(hour*3600)-(minute*60);
		System.out.println(second+"��");
		
		System.out.println(hour+"�ð� "+minute+"�� "+second+"�� ����");
		
		//0��0��0�� ������ ���� �ִ� ��ü ����
		LocalTime time=LocalTime.of(0, 0,0);
		//�� ��ü�� �� ���� ���̸�ŭ �ʸ� ����
		time=time.plusSeconds(second);
		
		System.out.println(time.getHour()+"�ð� "+time.getMinute()+"�� "+time.getSecond()+"�� ����");
		
		
//		LocalDate date1=LocalDate.of(2020, 1, 19);
//		LocalDate date2=LocalDate.now();
//		
//		//1�� 2���� 11��
//		Period period=Period.between(date1, date2);
//		//1��
//		long year=period.get(ChronoUnit.YEARS);//'��'�� �󸶳� ���̳����� �˷����
//		//2����
//		long month=period.get(ChronoUnit.MONTHS);
//		//11��
//		long day=period.get(ChronoUnit.DAYS);
//		
//		String date1String=toString(date1);
//		String date2String=toString(date2);
//		String periodString=year+"�� "+month+"�� "+day+"�� ���̰����ϴ�.";
//		System.out.println(date1String+"�� "+date2String+"�� "+periodString);
//		
//		
//		//period�� �������� ��ȯ-��¥�� ���̸� �������� ���� �ִ� ����
//		long monthPeriod=(year*12)+month;
//		System.out.println(date1String+"�� "+date2String+"�� "+monthPeriod+"���� ���̰� ���ϴ�.");
//		
//		//period�� �ϼ��� ��ȯ-��¥�� ���̸� �ϴ����� ���� �ִ� ����
//		long dayPeriod=(year*365)+(month*30)+day;
//		System.out.println(date1String+"�� "+date2String+"�� "+dayPeriod+"�� ���̰� ���ϴ�.");
	

	}

}
