package chapter1;
//����ó�� ���� 
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		try {
			
			int index=scanf.nextInt();
			
			if (index<0 || index>=4) {
				throw new WrongIndexException("�ε����� 0�̻� 4���Ϸθ� �����մϴ�.");
			}
			
			throw new MyException("MyException�߻�");
			
		} catch (MyException e) {
			System.out.println(e.getMessage());
			
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally  �ڵ� ����");
			scanf.close();
		}

	}

}
