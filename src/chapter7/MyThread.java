package chapter7;
//������ Ŭ������ ����� �ʹٸ�, Runnable�������̽��� �����ϸ� �ȴ�.
//Ŭ������ ����->Ʋ
//�����带 ����->�������� Ʋ�� �������.
public class MyThread implements Runnable{

	@Override
	public void run() {
		//�����尡 �����ؾߵ� �۾� 
		//���� �����ϴ� �������� �̸� ���+start!���
//		System.out.println(Thread.currentThread().getName()+"start!");
		
		//���� �߻��ϴ� �ڵ�� try-catch������ �ڵ鸵
		try {
			int result=10/0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("���� �߻�!");
		}
		
	}

}
