package chapter7;

public class Ex1 {

	public static void main(String[] args) {
		//MyThread를 쓰레드화 시켜서 thread에 저장한다.
		Thread thread=new Thread(new MyThread());
		
		//MyThread의 이름이 "Thread-0"로 출력됨.
		thread.start();
		
		//쓰레드는 일회용이라서 다시 재사용 불가능. 그러므로 아래 코드는 컴파일 오류 발생시킴
//		thread.start();
		
		//그렇다면 2번 실행시키려면??
		//다시 또 하나의 쓰레드 만들어서 start 한다.
		thread=new Thread(new MyThread());
		thread.start();

	}
}
