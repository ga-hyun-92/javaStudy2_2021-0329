package chapter2;
//����ȭ : DecimalFormat

import java.text.DecimalFormat;

public class Ex5 {

	public static void main(String[] args) {
		int balance=1278455091;
		
		//����: #(��)-������,.(��)-�Ҽ���������, ,(�޸�)-�޸� ���� �� ��ü 
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println(df.format(balance));//������ �������� balance �� ���
		String data=df.format(balance);
		System.out.println(data);
		
		
		double avg=87.53710297;
		
		df=new DecimalFormat("#.##");//�Ҽ��� ��°�ڸ�������
		String data2=df.format(avg);
		System.out.println(data2);
	}

}
