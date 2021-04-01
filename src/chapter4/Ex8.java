package chapter4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex8 {

	public static void main(String[] args) {
		//예제
		Scanner scanf=new Scanner(System.in);
		Set<String> hashSet=new HashSet<String>();
				
		while (true) {
			System.out.print("노래 가사를 입력하세요.(종료 : -1) : ");
					
			String lyrics=scanf.next();
			if(lyrics.equals("-1")) break;
					
			boolean isAdd=hashSet.add(lyrics);
			if (isAdd) {
						
			} else {
				System.out.println("이미 입력된 가사입니다.=> "+lyrics);
			}
					
			System.out.println();
		}//end while
				
		scanf.close();		

	}

}
