package chapter5;

public enum BirthMonth {
	Jan("1��"),Feb("2��"),Mar("3��"),Apr("4��"),May("5��"),
	Jun("6��"),Jul("7��"),Aug("8��"),Sep("9��"),Oct("10��"),
	Nov("11��"),Dec("12��");
	
	//�ѱ۷ε� ����� ����� �� ����.
	private final String korMonth;
	BirthMonth(String korString) {
		this.korMonth=korString;
	}
	
	public String getKorMonth() {
		return korMonth;
	}
	
	//����ڰ� xx������ �Է����� �� �ش��ϴ� ���� ����� ��ȯ�ϴ� �޼���
	public static BirthMonth getBirthMonth(String month) {
		BirthMonth[] birthMonthArr=BirthMonth.values();
		
		BirthMonth result=null;
		for (BirthMonth birthMonth : birthMonthArr) {
			//n��° ����� ���� �ִ� �������� xx�� ���ڿ��� ����
			String korMonth=birthMonth.getKorMonth();
			
			if (month.equals(korMonth)) {
//				System.out.println(birthMonth+"�� "+korMonth+"�Դϴ�.");
				result = birthMonth;
			}//end if
		}//end for
		return result;
	}
}
