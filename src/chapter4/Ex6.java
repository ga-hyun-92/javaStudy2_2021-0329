package chapter4;
//Set 데이터 중복 불가
//HashSet
//Hash Code라는 값을 기준으로 데이터 분류
//중복 검사 시 Hash Code사용해서 중복 검사
public class Ex6 {
	public static void main(String[] args) {
		Passenger p1=new Passenger("홍길동","010-7591-8524","이코노미");
		Passenger p2=new Passenger("홍길동","010-7591-8524","이코노미");
		
		//두 인스턴스의 이름이 같다.
		boolean nameSame=p1.getName().equals(p2.getName());
		
		//두 인스턴스의 연락처가 같다.
		boolean telSame=p1.getTel().equals(p2.getTel());
		
		//두 인스턴스의 좌석등급이 같다.
		boolean seatSame=p1.getSeat().equals(p2.getSeat());
		
		//이름과 연락처와 좌석등급이 같다면 true
		boolean same= nameSame&&telSame&&seatSame;
		
		//그렇지 않으면 false
		if(same) {
			System.out.println("p1과 p2가 같습니다.");
		} else {
			System.out.println("p1과 p2가 다릅니다.");
		}
		
		//내가 작성한 코드
		System.out.println(p1.equals(p2));
		
		//hashCode는 인스턴스의 메모리 주소를 hash화 해서 내가 원하는 결과를 얻으려면 새롭게 오버라이딩 해줘야함.
		boolean same2=p1.hashCode()==p2.hashCode();
		System.out.println(same2);
			
	}

}
