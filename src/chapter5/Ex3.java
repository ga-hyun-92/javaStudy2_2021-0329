package chapter5;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		System.out.println("������ ��� 1");
		System.out.println("������ ��� 2");
		System.out.print("���� �Է�: ");
		
		int genderValue=scanf.nextInt();
//		Gender gender=Gender.getGedner(genderValue);
		
//		switch (gender) {
//		case MALE:
//			System.out.println("������ ���� ���� ����");
//			break;
//		case FEMALE:
//			System.out.println("������ ���� ���� ����");
//			break;
//		default:
//			break;
//		}
		
		try {
			Gender gender=Gender.getGedner(genderValue);
			if (gender==Gender.MALE) {
				System.out.println("�����Դϴ�.");
				
			} else {
				System.out.println("�����Դϴ�.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(genderValue+"��(��) �������� �ʴ� �����Դϴ�.");
		}
	}

}
