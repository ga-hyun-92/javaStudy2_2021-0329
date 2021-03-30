package chapter1;
//예외처리 예제 
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		System.out.print("숫자를 입력하세요(0이상 4미만):");
		try {
			
			int index=scanf.nextInt();
			
			if (index<0 || index>=4) {
				throw new WrongIndexException("인덱스는 0이상 4미만으로만 가능합니다.");
			}
			
			throw new MyException("MyException발생");
			
		} catch (MyException e) {
			System.out.println(e.getMessage());
			
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally  코드 실행");
			scanf.close();
		}

	}

}
