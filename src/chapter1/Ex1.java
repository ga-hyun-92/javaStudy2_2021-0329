package chapter1;

import java.util.Scanner;

public class Ex1 {
	
	static String text="abx";
	
	public static void main(String[] args) {
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int val1=10;
		int val2=1;
		int[] val3=new int[3];
		
		try {
//			System.out.println(val1/--val2);
			int index=scanf.nextInt();
			
			System.out.println(val3[index]);
			
			//���� �޼����� �м��ϰ�
			//�ΰ��� ��Ÿ���� catch������ ó���ϼ���.
			//1.������ catch������ ����ó��
			//2. |�� ���ܵ��� ��� �ϳ��� catch������ ����ó��
			char c=Ex1.text.charAt(0);
			
			//throw->���ܸ� �ǵ������� �߻���Ű�� Ű����
			throw new MyException("�ǵ������� �߻���Ų ����");
			
//			System.out.println("try�� ��");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//catch(ó���� ���ܸ�,������ ���ܸ�)
			System.out.println("�迭�� ������ ������ϴ�.");
			System.out.println("�迭�� ������ ��Ҹ� ����մϴ�.");
			//����Ϸ��� �迭�� ������ ��� ���
			System.out.println("���������:"+val3[val3.length-1]);//val3 ������ try�� �ۿ� �����������.
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException �߻�");
		} catch (ArithmeticException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		} catch (MyException e) {
			System.out.println("���� ���� ���� �߻�");
			System.out.println("���� ���� ���� �޼���: "+e.getMessage());
		}finally {
			System.out.println("finally  �ڵ� ����");
			scanf.close();//�� ó���������.
		}

		int result=val1+val2;
		System.out.println(result);
	}

}
