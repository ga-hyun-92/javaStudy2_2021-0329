package chapter3;
//Generics : Ÿ���� ���� �Ҵ�
//Ŭ������ Generics���� - ���׸� Ÿ��
//�޼��忡 Generics����

//T ��ſ� �Ʒ��� ���� ���ڵ鵵 �����ѵ�, �Ϲ������� ������ ���� �ǹ̸� ������.
//E-Element
//K-Key
//T-Type
//V-Value
//N-Number
public class Person<T1,T2> {
	//�� ����
	private int eye;
	//�� ����
	private int nose;
	//�� ����
	private int mouth;
	//�ĺ���
	private T1 id;
	
	private T2 tel;
	
	
	public Person(T2 tel) {
		this.tel= tel;
	}
	
	//�����ڿ� ���ʸ� Ÿ���� ������ ������ ����
//	public Person(int eye,int nose,int mouth,T id) {
//		this.eye=eye;
//		this.nose=nose;
//		this.mouth=mouth;
//		this.id=id;
//	}
	
	public void add(T1 val1,T1 val2) {
		System.out.println(1);
	}
	
	public void setID(T1 id) {
		this.id=id;
	}
	
	public T1 getID() {
		return id;
	}
	
	public void setTel(T2 tel) {
		this.tel=tel;
	}
	
	public T2 getTel() {
		return tel;
	}
	
	
	
}
