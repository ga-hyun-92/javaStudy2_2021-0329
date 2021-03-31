package chapter3;
//Wrapper Class
//제네릭 타입 자리에는 클래스만 올 수가 있다.
//기본 데이터 타입을 클래스로 만들어두었다.
//정수, 실수, 문자를 제네릭 타입 자리에 쓰려면
//기본 데이터 타입을 클래스로 만들어둔 클래스를 사용해야한다 ->래퍼 클래스
public class Ex2 {

	public static void main(String[] args) {
		Byte byteValue=Byte.valueOf((byte)10);//byte클래스의 인스턴스를 만들어주는 메서드
		System.out.println(byteValue.byteValue());

		Short shortValue=Short.valueOf((short)10);//그냥10을 쓰면 int타입의 10이 만들어짐.int는 short보다 크므로 넘쳐서 다운캐스팅해야함
		System.out.println(shortValue.shortValue());
		
		Integer integerValue=Integer.valueOf(10);
		System.out.println(integerValue.intValue());
		
		Long longValue=Long.valueOf(10);
		System.out.println(longValue.longValue());
		
		Float floatValue=Float.valueOf((float)3.14);//3.14는 double타입이므로 float타입으로 형변환
		System.out.println(floatValue.floatValue());
		
		Float floatValue2=Float.valueOf("3.14");
		System.out.println(floatValue2.floatValue());
		
		Double doubleValue=Double.valueOf(3.14);
		System.out.println(doubleValue.doubleValue());
		
		Character charValue=Character.valueOf('a');
		System.out.println(charValue.charValue());
				
		Boolean booleanValue=Boolean.valueOf("true");
		System.out.println(booleanValue.booleanValue());
		Boolean booleanValue2=Boolean.valueOf(false);
		System.out.println(booleanValue2.booleanValue());
	}

}
