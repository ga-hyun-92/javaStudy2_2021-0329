package chapter3;

public class Ex3 {

	public static void main(String[] args) {
		Integer intValue=Integer.valueOf(10);
		System.out.println(intValue.intValue());
		
		//IntegerŸ���� ��ü�� �⺻������ Ÿ���� 10�� �����Ҽ� �ִ� 
		//-> ����ڽ� :Integer.valueOf(10) �̷��� �ڵ� ��ȯ
		Integer intValue1=10;
		System.out.println(intValue1);//�����ڽ� ->������ �̷���: System.out.println(intValue.intValue());
		//�����ڽ�
		int num1=intValue1;//intValue.intValue()�̷��� �ڵ� ȣ��Ǿ ��ڽ� �Ǿ ����10�� ������.
		
		Double doubleValue=3.14;
		System.out.println(doubleValue);
		
		Character charValue='a';
		System.out.println(charValue);
		
		String str="�ȳ��ϼ���";//String�� �⺻������Ÿ���� �ƴѵ�, �⺻������Ÿ��ó�� �����Ҽ� �ִ�->����ڽ�
		System.out.println(str);
		String str1=new String("�ȳ��ϼ���");//���� �̷��� �����.
		
	
		
	}

}
