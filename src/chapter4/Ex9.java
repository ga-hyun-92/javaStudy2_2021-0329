package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		Set<Passenger> passengerList=new HashSet<Passenger>();
		Passenger p1=new Passenger("ȫ�浿","010-7591-8524","���ڳ��");
		Passenger p2=new Passenger("ȫ�浿","010-7591-8524","���ڳ��");
		
		passengerList.add(p1);
		System.out.println(p1.equals(p2));
		//add�� �ϸ��� ������ ����ִ� �����͵���equals �޼��带 ȣ���ϴµ�
		//�Ű������� �߰��Ϸ��� �������� �ؽð����� ���� 
		
		passengerList.add(p2);
		
		System.out.println(passengerList);
		
		//remove���� true�̸� ������
		passengerList.remove(p1);
		//equals�޼��� ����
		System.out.println("p1�� ��ġ�ϴ� ��� ����:"+passengerList);
		
		//iterator����ؼ� �ϳ��ϳ��� ��ҿ� ���ٰ�����.
		Iterator<Passenger> iterator=passengerList.iterator();
		

	}

}
