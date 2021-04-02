package chapter7;

public class Ex2 {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyThread1());
		//싱글쓰레드에서 2개의 작업을 소요하는데 걸린시간=439초
		thread.start();

	}

}
