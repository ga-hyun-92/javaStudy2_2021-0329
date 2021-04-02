package chapter7;

public class Ex3 {

	public static void main(String[] args) {
		Thread thread1=new Thread(new MyThread2());
		Thread thread2=new Thread(new MyThread3());
		
		//멀티 쓰레드-번갈아가면서 수행한다. 마지막 출력되는 '소요시간2 = 633' 이 시간이 총 소요시간이다.
		//멀티쓰레드 환경에서 2개의 작업을 처리하는데 소요된 시간=633초
		thread1.start();
		thread2.start();

		//병렬 프로그래밍 분야도 공부해두면 좋을듯,,그래픽 카드 등에 사용됨
	}

}
