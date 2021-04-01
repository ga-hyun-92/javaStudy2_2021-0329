package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		Map<String, Customer> customer=new HashMap<>();
		
		Customer customer1=new Customer("1473-3698","Çö±Ý");
		Customer customer2=new Customer("1598-7894","Ä«µå");
		Customer customer3=new Customer("4569-3698","Ä«µå");
		Customer customer4=new Customer("2586-2584","Çö±Ý");
		Customer customer5=new Customer("7418-3698","Çö±Ý");
		
		customer.put("È«±æµ¿",customer1);
		customer.put("±èÃ¶¼ö",customer2);
		customer.put("°í¿µÈñ",customer3);
		customer.put("À¯³ëÀ±È£",customer4);
		customer.put("È²±¤Èñ",customer5);
		
		Set<String> keySet=customer.keySet();
		Iterator<String> iterator=keySet.iterator();
//		while (iterator.hasNext()) {
//			String key = (String) iterator.next();
//			System.out.println(key+", "+customer.get(key).getTel()+", "+customer.get(key).getPayMethod());
//		}
		
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("ÀÌ¸§: "+key+", "+customer.get(key));
		}
		

	}

}
