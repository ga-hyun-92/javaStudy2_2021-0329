package chapter7;

public class Ex2 {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyThread1());
		//�̱۾����忡�� 2���� �۾��� �ҿ��ϴµ� �ɸ��ð�=439��
		thread.start();

	}

}
