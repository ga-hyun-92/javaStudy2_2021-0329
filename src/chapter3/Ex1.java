package chapter3;

public class Ex1 {

	public static void main(String[] args) {
		//�̷��� <>���⿡ �ƹ��͵� �Ⱥ�����,,<Object>�� �ڵ����� ����
//		ClassName object1=new ClassName();
		ClassName<Object> object1=new ClassName<Object>();
		
		ClassName<String> object2=new ClassName<String>();
		
		//��<>�ȿ� ���� ����.
		ClassName<Integer> object3=new ClassName<>();
		ClassName<Double> object4=new ClassName<>();
		
		//������ ��� Ŭ������ �ν��Ͻ��� ����µ� �ĺ����� ���ڿ��� ����� �� �ֵ��� �����ϼ���.
//		Person<String> p1=new Person<String>();
//		Person<String> p2=new Person<>();
//		
//		p1.add("a", "b");
//		p1.setID("id");
		
		//������ ��� Ŭ������ �ν��Ͻ��� ����µ� �ĺ����� ������ ����� �� �ֵ��� �����ϼ���.
		//<> ���׸� �ڸ����� �⺻������ Ÿ��(���� ���, int)�� �� �� ����
		//���׸� Ÿ�� �ڸ����� Ŭ������ �� ���� �ִ�.
		//�⺻ ������ Ÿ���� Ŭ������ �����ξ���.
		//����, �Ǽ�, ���ڸ� ���׸� Ÿ�� �ڸ��� ������
		//�⺻ ������ Ÿ���� Ŭ������ ������ Ŭ������ ����ؾ��Ѵ� ->���� Ŭ����
//		Person<Integer> p3=new Person<Integer>(); //���׸��� Ÿ���� IntegerŬ������ �ν��Ͻ��� �����Ҽ� �ְԵ�.
//		p3.setID(10);//������ ����ڽ��ؼ� �����Ѵ�.
//		int ID=p3.getID();//IntegerŬ������ �ν��Ͻ��� �����ڽ��ؼ� ����10�� ID�� ����
//		System.out.println(ID);
		
		Person<String,Integer> p4=new Person<>(1012345678);
		Person<String,String> p5=new Person<>("010-1234-5678");
		
//		p4.setID(1012345679);
		p5.setTel("010-1234-5679");

		System.out.println(p4.getTel());
		System.out.println(p5.getTel());
	}

}
