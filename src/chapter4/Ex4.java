package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			intList.add(i);
		}
		
		System.out.println(intList.get(2));
		
		Integer el1=intList.get(5);
 		System.out.println(el1);//오토언박싱
		
		int el2=intList.get(5);
		System.out.println(el2);

		float el3=intList.get(5);
		System.out.println(el3);
		
//		String el4=intList.get(5);//컴파일 오류
		String el4=intList.get(5).toString();//정수를 문자열로
		
	}

}
