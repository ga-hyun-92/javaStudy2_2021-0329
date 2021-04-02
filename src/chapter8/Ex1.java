package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc=null;
		
		//�Է� ��Ʈ�� - ���α׷��� �ٱ����� ������ ������ �̵�
		//ByteArray - �޸� �����͸� ��/����ϴµ� ����ϴ� Ŭ����
		ByteArrayInputStream input=new ByteArrayInputStream(inSrc);
		//��½�Ʈ�� - ���α׷��� �ȿ��� �ٱ����� 
		//���߿� ��½�Ʈ���� ��� �����Ұ��� ���Ѵ�.
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		
		//�ǹ����� �̷� �ڵ�� �����.
//		int data=0;
//		while((data=input.read()) != -1) {
//			output.write(data);//data�� ����Ǵ� �����͸� output��Ʈ���� Ÿ�� �޸𸮿� ����ȴ�.
//		}
		
		//�� �ڵ带 ������ ���� ��� Ǯ� �Ẹ��.
		while (true) {
			int data=input.read();
			if (data == -1) {
				break; //inSrc�������� �����ߴٸ�, �ݺ����� ����������.
			}
			output.write(data);
		}
		
		outSrc=output.toByteArray();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));

	}

}
