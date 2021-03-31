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
	
	
}
