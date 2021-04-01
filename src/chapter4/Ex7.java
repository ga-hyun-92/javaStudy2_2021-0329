package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex7 {
	public static void main(String[] args) {
		//Set: 저장하는 데이터의 순서를 보장하지는 않음
		Set<Integer> hashSet=new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(7);
		
		System.out.println("초기상태 : "+hashSet);
		
		hashSet.add(1);//add함수가 boolean 타입
		//인스턴스로 저장하고 그 인스턴스의 해시코드가 기존 요소에 있는지 확인
		//-> 있으므로 중복되어서 초기상태 그대로 출력됨
		System.out.println("요소 1 추가 : "+hashSet);
		
		boolean isAdd=hashSet.add(7);
		if (isAdd) {
			System.out.println("요소 7을 추가: "+hashSet);
		}
		
		isAdd=hashSet.add(9);
		if (isAdd) {
			System.out.println("요소 9를 추가: "+hashSet);
		}
		
		hashSet.remove(1);
		System.out.println("요소 1을 삭제 : "+hashSet);
		
		Iterator<Integer> iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			Integer el = (Integer) iterator.next();
			System.out.println(el);
		}
	}

}
