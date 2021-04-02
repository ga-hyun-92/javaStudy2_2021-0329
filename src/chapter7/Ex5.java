package chapter7;

import javax.swing.JOptionPane;
//번갈아가면서 실행되는 쓰레드
public class Ex5 {

	public static void main(String[] args) {
		Thread thread =new Thread(new MyThread4());
		
		thread.start();
		String input=JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은"+input+"입니다.");

	}

}
