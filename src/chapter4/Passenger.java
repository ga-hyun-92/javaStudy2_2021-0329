package chapter4;

public class Passenger {
	private String name;
	private String tel;
	private String seat;
	
	public Passenger(String name,String tel,String seat) {
		this.name=name;
		this.tel=tel;
		this.seat=seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	
	@Override
	public String toString() {
		return "�̸�="+name+", ����ó= "+tel+", �¼�="+seat;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Passenger) {
			//�Ű������� ���޹��� ��ü�� PassengerŬ���� Ÿ������ ��ȯ�� �� �ִٸ�
			Passenger target=(Passenger)obj;
			return this.hashCode()==target.hashCode();
			
			//���� �ۼ��� �ڵ�
//			boolean nameSame=target.getName().equals(this.getName());
//			boolean telSame=target.getTel().equals(this.getTel());
//			boolean seatSame=target.getSeat().equals(this.getSeat());
//			return nameSame&&telSame&&seatSame;
		} else {
			//�Ű������� ���޹��� ��ü�� Passenger Ŭ���� Ÿ������ ��ȯ�� �� ���ٸ�
			//false
			return false;
		}
		
		
	}

	@Override
	public int hashCode() {
		//String Ŭ������ �����Ǿ��ִ� HasCode�� ���������� Ȱ���ϸ�
		//���� �����ϰ� �츮���� �ʿ��� �ؽ��Լ��� ���� �� �ִ�.
		
		//String Ŭ������ hashCode�޼���
		//���ڿ��� �ؽ�ȭ��
		int hashCode=name.hashCode()+tel.hashCode()+seat.hashCode();
		
//		int hashCode=0;
//		if (name.equals("ȫ�浿")) {
//			hashCode+=1;
//		}
//		
//		if(tel.equals("010-7591-8524")) {
//			hashCode+=2;
//		}
//		
//		if (seat.equals("���ڳ��")) {
//			hashCode+=3;
//		}
		
		return hashCode;
	}
	
	
	
	
}
