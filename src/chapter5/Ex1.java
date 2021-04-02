package chapter5;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		//values메서드: enum안에 정의된 모든 상수들을 배열로 가져올 수 있다.
		//Gender안에 values를 컴파일러가 자동으로 생성한다.
		Gender[] genderArr=Gender.values();
		for (int i = 0; i < genderArr.length; i++) {
			Gender gender=genderArr[i];
			System.out.println(gender);
//			System.out.println(genderArr[i]);
		}
		
		for (Gender gender : genderArr) {
			System.out.println(gender);
		}
		
		//BirthMonth Enum의 모든 상수를 출력하세요.
		BirthMonth[] birthMonth=BirthMonth.values();
		for (int i = 0; i < birthMonth.length; i++) {
			System.out.println(birthMonth[i]);
		}
		
		for (BirthMonth birthMonth2 : birthMonth) {
			System.out.println(birthMonth2);
		}
	}

}
