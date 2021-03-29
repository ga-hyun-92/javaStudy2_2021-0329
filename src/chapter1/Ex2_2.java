package chapter1;

public class Ex2_2 {
	
	static double div(int val1,int val2) {
		return val1/val2;
	}
	
	static int readArrayElement(int index) {
		int array[] = {9,8,7};
		return array[index];
	}
	
	static void makeException() {
		System.out.println("makeException실행");
		
		throw new MyException("내가 만든 예외 발생");
		
//		System.out.println("makeException종료");
	}
	
	public static void main(String[] args) {
		
		double result1=div(10,0);
		System.out.println(result1);
		
		int result2=readArrayElement(3);
		System.out.println(result2);

	}

}
