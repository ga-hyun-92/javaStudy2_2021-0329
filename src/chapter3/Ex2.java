package chapter3;
//Wrapper Class
//���׸� Ÿ�� �ڸ����� Ŭ������ �� ���� �ִ�.
//�⺻ ������ Ÿ���� Ŭ������ �����ξ���.
//����, �Ǽ�, ���ڸ� ���׸� Ÿ�� �ڸ��� ������
//�⺻ ������ Ÿ���� Ŭ������ ������ Ŭ������ ����ؾ��Ѵ� ->���� Ŭ����
public class Ex2 {

	public static void main(String[] args) {
		Byte byteValue=Byte.valueOf((byte)10);//byteŬ������ �ν��Ͻ��� ������ִ� �޼���
		System.out.println(byteValue.byteValue());

		Short shortValue=Short.valueOf((short)10);//�׳�10�� ���� intŸ���� 10�� �������.int�� short���� ũ�Ƿ� ���ļ� �ٿ�ĳ�����ؾ���
		System.out.println(shortValue.shortValue());
		
		Integer integerValue=Integer.valueOf(10);
		System.out.println(integerValue.intValue());
		
		Long longValue=Long.valueOf(10);
		System.out.println(longValue.longValue());
		
		Float floatValue=Float.valueOf((float)3.14);//3.14�� doubleŸ���̹Ƿ� floatŸ������ ����ȯ
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
