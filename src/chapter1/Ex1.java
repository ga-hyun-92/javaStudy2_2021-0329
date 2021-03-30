package chapter1;

import java.util.Scanner;

public class Ex1 {
	
	static String text="abx";
	
	public static void main(String[] args) {
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int val1=10;
		int val2=1;
		int[] val3=new int[3];
		
		try {
//			System.out.println(val1/--val2);
			int index=scanf.nextInt();
			
			System.out.println(val3[index]);
			
			//예외 메세지를 분석하고
			//두가지 스타일의 catch문으로 처리하세요.
			//1.각각의 catch문으로 예외처리
			//2. |로 예외들을 묶어서 하나의 catch문으로 예외처리
			char c=Ex1.text.charAt(0);
			
			//throw->예외를 의도적으로 발생시키는 키워드
			throw new MyException("의도적으로 발생시킨 예외");
			
//			System.out.println("try의 끝");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//catch(처리할 예외명,붙잡을 예외명)
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println("배열의 마지막 요소를 출력합니다.");
			//사용하려는 배열의 마지막 요소 출력
			System.out.println("마지막요소:"+val3[val3.length-1]);//val3 변수를 try문 밖에 선언해줘야함.
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		} catch (MyException e) {
			System.out.println("내가 만든 예외 발생");
			System.out.println("내가 만든 예외 메세지: "+e.getMessage());
		}finally {
			System.out.println("finally  코드 실행");
			scanf.close();//꼭 처리해줘야함.
		}

		int result=val1+val2;
		System.out.println(result);
	}

}
