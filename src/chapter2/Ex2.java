package chapter2;

import java.util.Calendar;

public class Ex2 {

	public static void main(String[] args) {
		//���� ��¥�� �ð� ������ ���� �ִ� �ν��Ͻ�
		Calendar calendar=Calendar.getInstance();
		
		System.out.println("�� ��: "+calendar.get(Calendar.YEAR));
		//CalendarŬ������ ���� 0���� ����.
		//0~11������ �����ϹǷ� ����Ҷ��� 1�� ���ؼ� ����ؾ��Ѵ�.
		System.out.println("�̹� ��: "+(calendar.get(Calendar.MONTH)+1));
		System.out.println("������ �̹� �� ����: "+calendar.get(Calendar.WEEK_OF_MONTH));
		
		//�̹����� ������ ��¥
		System.out.println("������ ��¥: "+calendar.get(Calendar.DAY_OF_MONTH));
		//������ ������ ��¥(1�� 1�� ����)
		System.out.println("������ ��¥: "+calendar.get(Calendar.DAY_OF_YEAR));
		//1-�Ͽ���,7-�����
		System.out.println("������ ����: "+calendar.get(Calendar.DAY_OF_WEEK));
		int dayofWeek=Calendar.DAY_OF_WEEK;
		if (dayofWeek==1) {
			System.out.println("������ ����: �Ͽ���");
		} else if(dayofWeek==2)
			System.out.println("������ ����: ������");
		} 
		
		String[] weekName= {"","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
//		System.out.println("������ ����:"+weekName[dayofWeek]);
//		
//		
//		System.out.println("��: "+calendar.get(Calendar.HOUR));
//		System.out.println("��: "+calendar.get(Calendar.MINUTE));
//		System.out.println("��: "+calendar.get(Calendar.SECOND));
//		
//		System.out.println("�� ���� ������ ��: "+calendar.getActualMaximum(Calendar.DATE));

	}

//}
