package chapter3;

public class Ex1 {

	public static void main(String[] args) {
		//이렇게 <>여기에 아무것도 안붙으면,,<Object>가 자동으로 붙음
//		ClassName object1=new ClassName();
		ClassName<Object> object1=new ClassName<Object>();
		
		ClassName<String> object2=new ClassName<String>();
		
		//뒤<>안에 생략 가능.
		ClassName<Integer> object3=new ClassName<>();
		ClassName<Double> object4=new ClassName<>();
		
		//선언한 사람 클래스의 인스턴스를 만드는데 식별값을 문자열로 사용할 수 있도록 생성하세요.
//		Person<String> p1=new Person<String>();
//		Person<String> p2=new Person<>();
//		
//		p1.add("a", "b");
//		p1.setID("id");
		
		//선언한 사람 클래스의 인스턴스를 만드는데 식별값을 정수로 사용할 수 있도록 생성하세요.
		//<> 지네릭 자리에는 기본데이터 타입(예를 들어, int)은 들어갈 수 없음
		//제네릭 타입 자리에는 클래스만 올 수가 있다.
		//기본 데이터 타입을 클래스로 만들어두었다.
		//정수, 실수, 문자를 제네릭 타입 자리에 쓰려면
		//기본 데이터 타입을 클래스로 만들어둔 클래스를 사용해야한다 ->래퍼 클래스
//		Person<Integer> p3=new Person<Integer>(); //제네릭스 타입은 Integer클래스의 인스턴스를 저장할수 있게됨.
//		p3.setID(10);//정수를 오토박싱해서 저장한다.
//		int ID=p3.getID();//Integer클래스의 인스턴스를 오토언박싱해서 정수10을 ID에 저장
//		System.out.println(ID);
		
		Person<String,Integer> p4=new Person<>(1012345678);
		Person<String,String> p5=new Person<>("010-1234-5678");
		
//		p4.setID(1012345679);
		p5.setTel("010-1234-5679");

		System.out.println(p4.getTel());
		System.out.println(p5.getTel());
	}

}
