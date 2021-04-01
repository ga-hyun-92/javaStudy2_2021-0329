package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		//iterator에는 index가 아닌, 요소들을 참고하는 포인터가 있다.
		//포인터가 가리키는 데이터만 사용할수 있다. 포인터에서부터 앞에서 뒤로만 이동
		Iterator<Integer> it=list.iterator();
		//hasNext를 사용해서 포인터를 이동시켜서 포인터가 가리키는 위치의 데이터를 꺼내온다.
		it.hasNext();
		
		while (it.hasNext()) {
			int num1=it.next();
			Integer num2 = (Integer) it.next();
			System.out.println(num2);
		}

	}

}
