package chapter5;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		//values�޼���: enum�ȿ� ���ǵ� ��� ������� �迭�� ������ �� �ִ�.
		//Gender�ȿ� values�� �����Ϸ��� �ڵ����� �����Ѵ�.
		Gender[] genderArr=Gender.values();
		for (int i = 0; i < genderArr.length; i++) {
			Gender gender=genderArr[i];
			System.out.println(gender);
//			System.out.println(genderArr[i]);
		}
		
		for (Gender gender : genderArr) {
			System.out.println(gender);
		}
		
		//BirthMonth Enum�� ��� ����� ����ϼ���.
		BirthMonth[] birthMonth=BirthMonth.values();
		for (int i = 0; i < birthMonth.length; i++) {
			System.out.println(birthMonth[i]);
		}
		
		for (BirthMonth birthMonth2 : birthMonth) {
			System.out.println(birthMonth2);
		}
	}

}
