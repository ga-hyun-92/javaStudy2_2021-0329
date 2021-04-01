package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		Set<Passenger> passengerList=new HashSet<Passenger>();
		Passenger p1=new Passenger("홍길동","010-7591-8524","이코노미");
		Passenger p2=new Passenger("홍길동","010-7591-8524","이코노미");
		
		passengerList.add(p1);
		System.out.println(p1.equals(p2));
		//add를 하면은 기존에 들어있는 데이터들의equals 메서드를 호출하는데
		//매개변수는 추가하려는 데이터의 해시값으로 전달 
		
		passengerList.add(p2);
		
		System.out.println(passengerList);
		
		//remove값이 true이면 삭제함
		passengerList.remove(p1);
		//equals메서드 참고
		System.out.println("p1과 일치하는 요소 삭제:"+passengerList);
		
		//iterator사용해서 하나하나의 요소에 접근가능함.
		Iterator<Passenger> iterator=passengerList.iterator();
		

	}

}
