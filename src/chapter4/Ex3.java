package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		Passenger passenger1=new Passenger("길동", "010-1234-5671", "economy");
		Passenger passenger2=new Passenger("고영희", "010-1234-5672", "first");
		Passenger passenger3=new Passenger("유노윤호", "010-1234-5673", "economy");
		Passenger passenger4=new Passenger("석진", "010-1234-5674", "first");
		Passenger passenger5=new Passenger("경완", "010-1234-5675", "first");
		//첫번째 승객이 누락되었다. 누락된 첫번째 승객의 정보를 추가해라.
		Passenger passenger0=new Passenger("매튜", "010-7591-1534", "이코노미");
		
		List<Passenger> passengerList=new ArrayList<Passenger>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
		System.out.println("전:"+passengerList.get(0));
		
		passengerList.add(0, passenger0);
		System.out.println("후:"+passengerList.get(0));
		
		//길동 데이터 삭제
		System.out.println("삭제 전: "+passengerList);
		passengerList.remove(1);
		System.out.println("삭제 후: "+passengerList);
		
		//고영희, 유노윤호 정보 출력해보세요.
		System.out.println(passengerList.get(1));
		System.out.println(passengerList.get(2));
		
		Passenger passenger=passengerList.get(1);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		passenger=passengerList.get(2);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		//비어있나요? true/그렇지 않으면 false
		System.out.println(passengerList.isEmpty());
		
		//컬렉션 프레임워크에 들어있는 데이터의 갯수를 반환
		System.out.println(passengerList.size());
		
		//i가 0로 시작해서 4로 끝난다.
		for (int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		//향상된 for문/foreach문
		for (Passenger p : passengerList) {
			System.out.println("이름:"+p.getName());
			System.out.println("연락처:"+p.getTel());
			System.out.println("좌석:"+p.getSeat());
			System.out.println("=========== ============");
		}//end for
		
		int[] arr= {1,2,3,4,5};
		for (int i : arr) {
			System.out.println(i);
		
		}//end for

	}

}
