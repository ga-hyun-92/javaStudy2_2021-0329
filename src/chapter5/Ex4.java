package chapter5;
//annotation ; �ּ�
//@Deprecated ; ������� �������� �Ѵ�.

public class Ex4 {
	@Deprecated
	public static final int oldValue=10;
	
	@Deprecated
	public static void oldMethod(){
		System.out.println("old");
	}
	
	public static final int newValue=11;
	
	public static void  newMethod() {
		System.out.println("new");
	}
	
	public static void main(String[] args) {
		System.out.println(Ex4.oldValue);
		Ex4.oldMethod();
		
		System.out.println(Ex4.newValue);
		Ex4.newMethod();;

	}

}
