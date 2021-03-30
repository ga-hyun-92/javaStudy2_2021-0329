package chapter1;
//�޼��� �ȿ� ����ó�� �ֱ�

public class Ex2_2 {
	
	static double div(int val1,int val2) {
		
		try {
			double result=val1/val2;
			return result;
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("ArithmeticException���� �߻�");
			return 0;
		}
		
	}
	
	static int readArrayElement(int index) throws ArrayIndexOutOfBoundsException{
		//WrongIndexException ���ܴ� �޼��� ���ο��� ó���� �ϰ�
		//ArrayIndexOutOfBoundsException ���ܴ� �޼��带 ȣ���� �ʿ��� ó���ϵ��� �ϼ���.
		try {
			int array[] = {9,8,7};
			
			if (index<0) {
					throw new WrongIndexException("�ε����� 0�Ǵ� ���� ������ ����");
			} 
			
			return array[index];
			
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
			
		}
		 return 0;
	}
	
	static void makeException(boolean turn) throws MyException {//ȣ���� �ʿ��� ���ܹ߻��ǵ��� �Ѵ�.
		System.out.println("makeException����");
			
		if (turn) {
			throw new MyException("���� ���� ���� �߻�");
		}
		
//		System.out.println("makeException����");
	}
	
	public static void main(String[] args) {
		
		double result1=div(10,0);
		System.out.println(result1);
		
		
		//readArrayElement�� ���ܸ� �����µ� ó��(try-catch)���� �ʾ������� ������ ������ �߻����� ����
		//Runtime Exception-uncheck Exception  �������Ҷ� ó�� �����൵ ��.
		try {
			int result2=readArrayElement(-1);
			System.out.println("�����: "+result2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException �߻�");
			System.out.println(e.getMessage());
		}

		try {
			//makeException�� ���ܸ� �����µ� ó������ �ʾҴ���, ������ ������ �߻��ϰ� ����.
			//check Exception  �������Ҷ� ó���������.
			makeException(true);
			
		} catch (MyException e) {
			System.out.println("makeException�޼��尡 ���ܸ� ����");
			System.out.println(e.getMessage());
		}
	}

}
