package chapter7;

import javax.swing.JOptionPane;
//�����ư��鼭 ����Ǵ� ������
public class Ex5 {

	public static void main(String[] args) {
		Thread thread =new Thread(new MyThread4());
		
		thread.start();
		String input=JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����"+input+"�Դϴ�.");

	}

}
