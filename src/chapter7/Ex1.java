package chapter7;

public class Ex1 {

	public static void main(String[] args) {
		//MyThread�� ������ȭ ���Ѽ� thread�� �����Ѵ�.
		Thread thread=new Thread(new MyThread());
		
		//MyThread�� �̸��� "Thread-0"�� ��µ�.
		thread.start();
		
		//������� ��ȸ���̶� �ٽ� ���� �Ұ���. �׷��Ƿ� �Ʒ� �ڵ�� ������ ���� �߻���Ŵ
//		thread.start();
		
		//�׷��ٸ� 2�� �����Ű����??
		//�ٽ� �� �ϳ��� ������ ���� start �Ѵ�.
		thread=new Thread(new MyThread());
		thread.start();

	}
}
