package chapter2;

import java.util.Calendar;
import java.util.Date;

public class Ex1 {

	public static void main(String[] args) {
		//�ڹ�1 ���������� ����ߴ� ��¥�� �ð��� �ڵ鸵�ϴ� Ŭ����
		Date date=new Date();
		
		//�ڹ�1.1 �������� �߰��� ��¥�� �ð��� �ڵ鸵�ϴ� Ŭ����
		//CalendarŬ������ �߻� Ŭ������ �ν��Ͻ� ���� �Ұ�
		//��� CalendarŬ������ �ִ� static �޼�����  getInstance�� ����ؼ� 
		//CalendarŬ������ �ڽ� Ŭ���� �ν��Ͻ��� ����� ����.
		//���α׷��� �����Ǵ� �ý����� ������ ���������� Ȯ���ؼ� 
		//�ش� �ý��ۿ� �´� ��¥�� �ڵ鸵 �� �� �ִ� Ŭ������ �ν��Ͻ��� ��ȯ�ȴ�.
		//�׷�����, �ҷ�
	Calendar calendar=Calendar.getInstance();
		
	//DateŬ������ �ν��Ͻ�->CalendarŬ������ �ν��Ͻ��� ��ȯ
		// 1.CalendarŬ������ �ν��Ͻ��� �����Ѵ�.
		// 2.1���� ������  CalendarŬ������ �ν��Ͻ��� ��¥�� �ð��� 
		//   DateŬ������ �ν��Ͻ��� ���� �ִ� ��¥�� �ð����� �����Ѵ�. 
		calendar.setTime(date);
		
	//CalendarŬ������ �ν��Ͻ�->DateŬ������ �ν��Ͻ��� ��ȯ
		Date d1=new Date(calendar.getTimeInMillis());
		Date d2=calendar.getTime();
		

	}

}
