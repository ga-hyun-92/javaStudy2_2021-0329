package chapter4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex8 {

	public static void main(String[] args) {
		//����
		Scanner scanf=new Scanner(System.in);
		Set<String> hashSet=new HashSet<String>();
				
		while (true) {
			System.out.print("�뷡 ���縦 �Է��ϼ���.(���� : -1) : ");
					
			String lyrics=scanf.next();
			if(lyrics.equals("-1")) break;
					
			boolean isAdd=hashSet.add(lyrics);
			if (isAdd) {
						
			} else {
				System.out.println("�̹� �Էµ� �����Դϴ�.=> "+lyrics);
			}
					
			System.out.println();
		}//end while
				
		scanf.close();		

	}

}
