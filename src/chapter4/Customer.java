package chapter4;

public class Customer {
	private String tel;
	private String payMethod;
	
	public Customer(String tel,String payMethod) {
		this.tel=tel;
		this.payMethod=payMethod;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	
	
}
