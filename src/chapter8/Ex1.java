package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null;
		
		//입력 스트림 - 프로그램의 바깥에서 안으로 데이터 이동
		//ByteArray - 메모리 데이터를 입/출력하는데 사용하는 클래스
		ByteArrayInputStream input=new ByteArrayInputStream(inSrc);
		//출력스트림 - 프로그램의 안에서 바깥으로 
		//나중에 출력스트림을 어디에 지정할건지 정한다.
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		
		//실무에서 이런 코드로 사용함.
//		int data=0;
//		while((data=input.read()) != -1) {
//			output.write(data);//data에 저장되는 데이터를 output스트림을 타고 메모리에 저장된다.
//		}
		
		//위 코드를 다음과 같이 길게 풀어서 써보자.
		while (true) {
			int data=input.read();
			if (data == -1) {
				break; //inSrc마지막에 도달했다면, 반복문을 빠져나가라.
			}
			output.write(data);
		}
		
		outSrc=output.toByteArray();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));

	}

}
