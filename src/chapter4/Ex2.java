package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		
		//List에는 ArrayList,LinkedList,stack,vector 등 있다.
		//다형성으로 선언
		List<String> arrayList=new ArrayList<>();
		
		//이렇게 변화에 유연한 구조가 되도록 한 것
//		arrayList=new LinkedList<>();
		
		
		//ArrayList 특징-중간에 삽입, 삭제가 빈번한 상황에서는 부적합한 자료구조
		//              맨 뒤에서 삽입,삭제가 빈번한 상황에서는 적합한 자료구조
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");

		System.out.println("초기 상태: "+arrayList);
		
		arrayList.add(1,"B");
		System.out.println("인덱스 1위치에 B 추가:"+arrayList);
		
		arrayList.add(3,"D");
		System.out.println("인덱스 3위치에 D 추가"+arrayList);
		
		arrayList.remove(2);
		System.out.println("인덱스 2위치의 값 삭제"+arrayList);
		
		arrayList.remove(4);
		System.out.println("인덱스 4위치의 값 삭제"+arrayList);
		
		//get메서드
		System.out.println("인덱스 2위치의 값 반환:"+arrayList.get(2));
		System.out.println("인덱스 3위치의 값 반환:"+arrayList.get(3));
		
		List<Integer> intList=new ArrayList<Integer>();
		
//		for (int i = 1; i <= 10; i++) {
//			intList.add(i);
//			System.out.println(intList);
//		}
		

	}

}
