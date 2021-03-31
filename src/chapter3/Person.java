package chapter3;
//Generics : 타입의 동적 할당
//클래스에 Generics정의 - 제네릭 타입
//메서드에 Generics정의

//T 대신에 아래와 같은 문자들도 가능한데, 일반적으로 다음과 같은 의미를 가진다.
//E-Element
//K-Key
//T-Type
//V-Value
//N-Number
public class Person<T1,T2> {
	//눈 개수
	private int eye;
	//코 개수
	private int nose;
	//입 개수
	private int mouth;
	//식별값
	private T1 id;
	
	private T2 tel;
	
	
	public Person(T2 tel) {
		this.tel= tel;
	}
	
	//생성자에 제너릭 타입의 변수를 넣을수 있음
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
