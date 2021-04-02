package chapter4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
	
		//Set은 get이라는 메서드가 없다.
		//그래서 iterator사용해서 출력하거나..
		Iterator<Integer> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//foreach
		//향상된 for문
		for (Integer i : set) {
			System.out.println(i);
		}
		
		
		Map<String, Customer> customer=new HashMap<>();
		
		Customer customer1=new Customer("1473-3698","현금");
		Customer customer2=new Customer("1598-7894","카드");
		Customer customer3=new Customer("4569-3698","카드");
		Customer customer4=new Customer("2586-2584","현금");
		Customer customer5=new Customer("7418-3698","현금");
		
		customer.put("홍길동",customer1);
		customer.put("김철수",customer2);
		customer.put("고영희",customer3);
		customer.put("유노윤호",customer4);
		customer.put("황광희",customer5);
		
		
		//고객 정보를 출력하세요.
		Set<String> keySet=customer.keySet();//Set은 데이터 중복 저장이 불가능하므로 키를 Set에 담아서 저장
		//while문 사용
		Iterator<String> iterator=keySet.iterator();
//		while (iterator.hasNext()) {
//			String key = (String) iterator.next();
//			System.out.println(key+", "+customer.get(key).getTel()+", "+customer.get(key).getPayMethod());
//		}
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("이름: "+key+", "+customer.get(key));
		}
		
		
		System.out.println("================");
		//foreach문 사용(1)
		for (String key : keySet) {
			System.out.println("이름: "+key+", "+customer.get(key));
		}
		
		System.out.println("================");
		//foreach문 사용(2)
		for (String key : keySet) {
			Customer c=customer.get(key);
			System.out.println(c.getTel());
			System.out.println(c.getPayMethod());
		}
		
		//고객 정보를 삭제하세요.
		//오류????
	    for (String name : keySet) {
			customer.remove(name);
		}
	    
	    customer.clear();
	    System.out.println(customer.isEmpty());
	}
}
