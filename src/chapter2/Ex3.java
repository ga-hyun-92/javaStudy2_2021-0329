package chapter2;

import java.util.Calendar;

//���н� Ÿ�ӽ�����
//-���н�OS�� ���ߵ� ��¥�� �������� ������� ���ʰ� �귶���� ���
//-� ������ �������� �ؼ� �׶����� ���ʰ� �귶���� ����ϴ°�!!
public class Ex3 {
	static final int DAY_IN_SECOND=24*60*60;
	static final int HOUR_IN_SECOND=60*60;
	static final int MINUTE_IN_SECOND=60;

	public static void main(String[] args) {
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		
		//Calendar�� '��'�� 0���� ī������ ��.
		cal1.set(2021,Calendar.JANUARY,1);//Calendar.JANUARY - static ������� ȣ��
		cal2.set(2021, Calendar.JANUARY,2);
		
		long cal1ToSecond=cal1.getTimeInMillis();
		long cal2ToSecond=cal2.getTimeInMillis();
		
		long difference=cal2ToSecond-cal1ToSecond;
		difference=difference/1000;//1��2�Ͽ��� 1��1���� �� �Ϸ��� �ð��� �и��ʷ� �ٲ۰�->�� ������ �ٲ�
		
		System.out.println(difference+"�ʰ� �귶���ϴ�.");
		
		//�ʴ����� �� ������ ȯ��
		int peroid=(int)(difference/DAY_IN_SECOND);
		System.out.println(peroid+"�� ���");
		
		//�ʴ����� �ð� ������ ȯ��
		int peroid2=(int)(difference/HOUR_IN_SECOND);
		System.out.println(peroid2+"�ð� ���");
		
		//�ʴ����� �д����� ȯ��
		int peroid3=(int)(difference/MINUTE_IN_SECOND);
		System.out.println(peroid3+"�� ���");
		
		
		

	}

}
