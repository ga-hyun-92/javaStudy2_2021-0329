package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		Map<String, Customer> customer=new HashMap<>();
		
		Customer customer1=new Customer("1473-3698","����");
		Customer customer2=new Customer("1598-7894","ī��");
		Customer customer3=new Customer("4569-3698","ī��");
		Customer customer4=new Customer("2586-2584","����");
		Customer customer5=new Customer("7418-3698","����");
		
		customer.put("ȫ�浿",customer1);
		customer.put("��ö��",customer2);
		customer.put("����",customer3);
		customer.put("������ȣ",customer4);
		customer.put("Ȳ����",customer5);
		
		Set<String> keySet=customer.keySet();
		Iterator<String> iterator=keySet.iterator();
//		while (iterator.hasNext()) {
//			String key = (String) iterator.next();
//			System.out.println(key+", "+customer.get(key).getTel()+", "+customer.get(key).getPayMethod());
//		}
		
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("�̸�: "+key+", "+customer.get(key));
		}
		

	}

}
