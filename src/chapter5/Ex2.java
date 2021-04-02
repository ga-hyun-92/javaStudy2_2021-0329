package chapter5;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Ex2 {

	public static void main(String[] args) {
		String birth="Jan";//jan이라고 하면 예외가 발생-> 예외처리해주기
		
		//매개변수로 상수의 이름을 전달해서
		//매개변수로 전달받은 이름을 갖고 있는 상수를 찾을수 있음
		try {
			BirthMonth birthMonth= BirthMonth.valueOf(birth);
			System.out.println(birthMonth);
			System.out.println(birthMonth.getKorMonth());
		} catch (IllegalArgumentException e) {
			System.out.println("존재하지 않는 상수입니다.");
		}
		
		//BirthMonth Enum사용해서 출력
		BirthMonth[] birthMonthArr=BirthMonth.values();
		for (BirthMonth birthMonth : birthMonthArr) {
			System.out.println(birthMonth+"="+birthMonth.getKorMonth());
		}
		
		//예제
		Scanner scanf=new Scanner(System.in);
		System.out.print("월 입력: ");
		String month=scanf.next();
		
//		BirthMonth[] birthMonthArr=BirthMonth.values();
//		for (BirthMonth birthMonth : birthMonthArr) {
//			//n번째 상수가 갖고 있는 데이터인 xx월 문자열을 저장
//			String korMonth=birthMonth.getKorMonth();
//			
//			if (month.equals(korMonth)) {
//				System.out.println(birthMonth+"은 "+korMonth+"입니다.");
//				
//			}
//		}
		
		BirthMonth birthMonth=BirthMonth.getBirthMonth(month);
		System.out.println(birthMonth);

	}

}
