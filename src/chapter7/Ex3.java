package chapter7;

public class Ex3 {

	public static void main(String[] args) {
		Thread thread1=new Thread(new MyThread2());
		Thread thread2=new Thread(new MyThread3());
		
		//��Ƽ ������-�����ư��鼭 �����Ѵ�. ������ ��µǴ� '�ҿ�ð�2 = 633' �� �ð��� �� �ҿ�ð��̴�.
		//��Ƽ������ ȯ�濡�� 2���� �۾��� ó���ϴµ� �ҿ�� �ð�=633��
		thread1.start();
		thread2.start();

		//���� ���α׷��� �оߵ� �����صθ� ������,,�׷��� ī�� � ����
	}

}
