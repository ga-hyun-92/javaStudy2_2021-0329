package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		Passenger passenger1=new Passenger("�浿", "010-1234-5671", "economy");
		Passenger passenger2=new Passenger("����", "010-1234-5672", "first");
		Passenger passenger3=new Passenger("������ȣ", "010-1234-5673", "economy");
		Passenger passenger4=new Passenger("����", "010-1234-5674", "first");
		Passenger passenger5=new Passenger("���", "010-1234-5675", "first");
		//ù��° �°��� �����Ǿ���. ������ ù��° �°��� ������ �߰��ض�.
		Passenger passenger0=new Passenger("��Ʃ", "010-7591-1534", "���ڳ��");
		
		List<Passenger> passengerList=new ArrayList<Passenger>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
		System.out.println("��:"+passengerList.get(0));
		
		passengerList.add(0, passenger0);
		System.out.println("��:"+passengerList.get(0));
		
		//�浿 ������ ����
		System.out.println("���� ��: "+passengerList);
		passengerList.remove(1);
		System.out.println("���� ��: "+passengerList);
		
		//����, ������ȣ ���� ����غ�����.
		System.out.println(passengerList.get(1));
		System.out.println(passengerList.get(2));
		
		Passenger passenger=passengerList.get(1);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		passenger=passengerList.get(2);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		//����ֳ���? true/�׷��� ������ false
		System.out.println(passengerList.isEmpty());
		
		//�÷��� �����ӿ�ũ�� ����ִ� �������� ������ ��ȯ
		System.out.println(passengerList.size());
		
		//i�� 0�� �����ؼ� 4�� ������.
		for (int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		//���� for��/foreach��
		for (Passenger p : passengerList) {
			System.out.println("�̸�:"+p.getName());
			System.out.println("����ó:"+p.getTel());
			System.out.println("�¼�:"+p.getSeat());
			System.out.println("=========== ============");
		}//end for
		
		int[] arr= {1,2,3,4,5};
		for (int i : arr) {
			System.out.println(i);
		
		}//end for

	}

}
