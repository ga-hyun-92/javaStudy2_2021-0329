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
		
		//iterator���� index�� �ƴ�, ��ҵ��� �����ϴ� �����Ͱ� �ִ�.
		//�����Ͱ� ����Ű�� �����͸� ����Ҽ� �ִ�. �����Ϳ������� �տ��� �ڷθ� �̵�
		Iterator<Integer> it=list.iterator();
		//hasNext�� ����ؼ� �����͸� �̵����Ѽ� �����Ͱ� ����Ű�� ��ġ�� �����͸� �����´�.
		it.hasNext();
		
		while (it.hasNext()) {
			int num1=it.next();
			Integer num2 = (Integer) it.next();
			System.out.println(num2);
		}

	}

}
