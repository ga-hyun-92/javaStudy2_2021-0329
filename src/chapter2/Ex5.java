package chapter2;
//형식화 : DecimalFormat

import java.text.DecimalFormat;

public class Ex5 {

	public static void main(String[] args) {
		int balance=1278455091;
		
		//패턴: #(샵)-십진수,.(점)-소수점구분자, ,(콤마)-콤마 문자 그 자체 
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println(df.format(balance));//지정한 형식으로 balance 값 출력
		String data=df.format(balance);
		System.out.println(data);
		
		
		double avg=87.53710297;
		
		df=new DecimalFormat("#.##");//소수점 둘째자리까지만
		String data2=df.format(avg);
		System.out.println(data2);
	}

}
