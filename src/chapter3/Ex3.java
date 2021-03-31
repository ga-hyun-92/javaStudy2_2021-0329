package chapter3;

public class Ex3 {

	public static void main(String[] args) {
		Integer intValue=Integer.valueOf(10);
		System.out.println(intValue.intValue());
		
		//Integer타입의 객체가 기본데이터 타입인 10을 저장할수 있다 
		//-> 오토박싱 :Integer.valueOf(10) 이렇게 자동 변환
		Integer intValue1=10;
		System.out.println(intValue1);//오토언박싱 ->원래는 이렇게: System.out.println(intValue.intValue());
		//오토언박싱
		int num1=intValue1;//intValue.intValue()이렇게 자동 호출되어서 언박싱 되어서 정수10을 저장함.
		
		Double doubleValue=3.14;
		System.out.println(doubleValue);
		
		Character charValue='a';
		System.out.println(charValue);
		
		String str="안녕하세요";//String은 기본데이터타입이 아닌데, 기본데이터타입처럼 저장할수 있다->오토박싱
		System.out.println(str);
		String str1=new String("안녕하세요");//원래 이렇게 써야함.
		
	
		
	}

}
