package chapter1;

//������ ���� Ŭ������ ����
//MyException�� ArrayIndexOutofBoundsException��� ���� ������ ���ܰ� �ȴ�.
public class MyException extends Exception{

	//����ȭ
	private static final long serialVersionUID = -2103221287283272330L;
	
	//msg-> ���ܰ� �� �߻��ߴ��� ������.
	public MyException(String msg) {
		super(msg);
	}
	
}
