package chapter7;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ����"+input+"�Դϴ�.");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			//���α׷��� ��� ���� �� ����
			//�Ű������� �����ϴ� �и��� ������ �ð���ŭ ����
			//�и��� ������ 1000�� 1��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end try
		}//end for

	}

}
