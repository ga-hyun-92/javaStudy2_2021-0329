package chapter5;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Ex2 {

	public static void main(String[] args) {
		String birth="Jan";//jan�̶�� �ϸ� ���ܰ� �߻�-> ����ó�����ֱ�
		
		//�Ű������� ����� �̸��� �����ؼ�
		//�Ű������� ���޹��� �̸��� ���� �ִ� ����� ã���� ����
		try {
			BirthMonth birthMonth= BirthMonth.valueOf(birth);
			System.out.println(birthMonth);
			System.out.println(birthMonth.getKorMonth());
		} catch (IllegalArgumentException e) {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		//BirthMonth Enum����ؼ� ���
		BirthMonth[] birthMonthArr=BirthMonth.values();
		for (BirthMonth birthMonth : birthMonthArr) {
			System.out.println(birthMonth+"="+birthMonth.getKorMonth());
		}
		
		//����
		Scanner scanf=new Scanner(System.in);
		System.out.print("�� �Է�: ");
		String month=scanf.next();
		
//		BirthMonth[] birthMonthArr=BirthMonth.values();
//		for (BirthMonth birthMonth : birthMonthArr) {
//			//n��° ����� ���� �ִ� �������� xx�� ���ڿ��� ����
//			String korMonth=birthMonth.getKorMonth();
//			
//			if (month.equals(korMonth)) {
//				System.out.println(birthMonth+"�� "+korMonth+"�Դϴ�.");
//				
//			}
//		}
		
		BirthMonth birthMonth=BirthMonth.getBirthMonth(month);
		System.out.println(birthMonth);

	}

}
