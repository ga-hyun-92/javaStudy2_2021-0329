package chapter1;
//메서드 안에 예외처리 넣기

public class Ex2_2 {
	
	static double div(int val1,int val2) {
		
		try {
			double result=val1/val2;
			return result;
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("ArithmeticException예외 발생");
			return 0;
		}
		
	}
	
	static int readArrayElement(int index) throws ArrayIndexOutOfBoundsException{
		//WrongIndexException 예외는 메서드 내부에서 처리를 하고
		//ArrayIndexOutOfBoundsException 예외는 메서드를 호출한 쪽에서 처리하도록 하세요.
		try {
			int array[] = {9,8,7};
			
			if (index<0) {
					throw new WrongIndexException("인덱스는 0또는 양의 정수만 가능");
			} 
			
			return array[index];
			
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
			
		}
		 return 0;
	}
	
	static void makeException(boolean turn) throws MyException {//호출한 쪽에서 예외발생되도록 한다.
		System.out.println("makeException실행");
			
		if (turn) {
			throw new MyException("내가 만든 예외 발생");
		}
		
//		System.out.println("makeException종료");
	}
	
	public static void main(String[] args) {
		
		double result1=div(10,0);
		System.out.println(result1);
		
		
		//readArrayElement가 예외를 던지는데 처리(try-catch)하지 않았음에도 컴파일 오류가 발생하지 않음
		//Runtime Exception-uncheck Exception  컴파일할때 처리 안해줘도 됨.
		try {
			int result2=readArrayElement(-1);
			System.out.println("결과값: "+result2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
			System.out.println(e.getMessage());
		}

		try {
			//makeException이 예외를 던지는데 처리하지 않았더니, 컴파일 오류가 발생하고 있음.
			//check Exception  컴파일할때 처리해줘야함.
			makeException(true);
			
		} catch (MyException e) {
			System.out.println("makeException메서드가 예외를 던짐");
			System.out.println(e.getMessage());
		}
	}

}
