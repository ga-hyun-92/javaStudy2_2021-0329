package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set<Passenger> passengerList=new HashSet<Passenger>();
		Passenger p1=new Passenger("ȫ�浿","010-1473-3698","���ڳ��");
		Passenger p2=new Passenger("��ö��","010-1598-7894","�۽�Ʈ");
		Passenger p3=new Passenger("����","010-4569-3698","����Ͻ�");
		Passenger p4=new Passenger("������ȣ","010-2568-3698","�۽�Ʈ");
		Passenger p5=new Passenger("Ȳ����","010-7418-3698","���ڳ��");

		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		//Iterator�� ����ؼ� ��� �°��� ������ ����ϼ���.
		Iterator<Passenger> iterator=passengerList.iterator();
		while (iterator.hasNext()) {
			Passenger p = (Passenger) iterator.next();
			System.out.println("================");
			System.out.println("�̸�:"+p.getName());
			System.out.println("����ó:"+p.getTel());
			System.out.println("�¼����:"+p.getSeat());
			
		}
	}

}
