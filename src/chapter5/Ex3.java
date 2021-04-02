package chapter5;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		System.out.println("남성일 경우 1");
		System.out.println("여성일 경우 2");
		System.out.print("성별 입력: ");
		
		int genderValue=scanf.nextInt();
//		Gender gender=Gender.getGedner(genderValue);
		
//		switch (gender) {
//		case MALE:
//			System.out.println("남성을 위한 쿠폰 지급");
//			break;
//		case FEMALE:
//			System.out.println("여성을 위한 쿠폰 지급");
//			break;
//		default:
//			break;
//		}
		
		try {
			Gender gender=Gender.getGedner(genderValue);
			if (gender==Gender.MALE) {
				System.out.println("남성입니다.");
				
			} else {
				System.out.println("여성입니다.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(genderValue+"은(는) 존재하지 않는 성별입니다.");
		}
	}

}
