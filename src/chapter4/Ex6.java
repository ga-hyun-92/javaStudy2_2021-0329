package chapter4;
//Set ������ �ߺ� �Ұ�
//HashSet
//Hash Code��� ���� �������� ������ �з�
//�ߺ� �˻� �� Hash Code����ؼ� �ߺ� �˻�
public class Ex6 {
	public static void main(String[] args) {
		Passenger p1=new Passenger("ȫ�浿","010-7591-8524","���ڳ��");
		Passenger p2=new Passenger("ȫ�浿","010-7591-8524","���ڳ��");
		
		//�� �ν��Ͻ��� �̸��� ����.
		boolean nameSame=p1.getName().equals(p2.getName());
		
		//�� �ν��Ͻ��� ����ó�� ����.
		boolean telSame=p1.getTel().equals(p2.getTel());
		
		//�� �ν��Ͻ��� �¼������ ����.
		boolean seatSame=p1.getSeat().equals(p2.getSeat());
		
		//�̸��� ����ó�� �¼������ ���ٸ� true
		boolean same= nameSame&&telSame&&seatSame;
		
		//�׷��� ������ false
		if(same) {
			System.out.println("p1�� p2�� �����ϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ��ϴ�.");
		}
		
		//���� �ۼ��� �ڵ�
		System.out.println(p1.equals(p2));
		
		//hashCode�� �ν��Ͻ��� �޸� �ּҸ� hashȭ �ؼ� ���� ���ϴ� ����� �������� ���Ӱ� �������̵� �������.
		boolean same2=p1.hashCode()==p2.hashCode();
		System.out.println(same2);
			
	}

}
