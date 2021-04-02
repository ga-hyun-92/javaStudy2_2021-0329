package chapter7;
//쓰레드 클래스로 만들고 싶다면, Runnable인터페이스를 구현하면 된다.
//클래스를 정의->틀
//쓰레드를 정의->쓰레드의 틀을 만들었다.
public class MyThread implements Runnable{

	@Override
	public void run() {
		//쓰레드가 수행해야될 작업 
		//현재 동작하는 쓰레드의 이름 출력+start!출력
//		System.out.println(Thread.currentThread().getName()+"start!");
		
		//예외 발생하는 코드는 try-catch문으로 핸들링
		try {
			int result=10/0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("예외 발생!");
		}
		
	}

}
