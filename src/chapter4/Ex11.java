package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		Map<String, Integer> classOneKor=new HashMap<String, Integer>();
		
		classOneKor.put("ȫ�浿", 95);
		classOneKor.put("��ö��", 18);
		classOneKor.put("����", 86);
		classOneKor.put("������ȣ", 36);
		classOneKor.put("Ȳ����", 69);
		
		System.out.println("�ʱ����: "+classOneKor);
		// put �޼��带 ����� �� �̹� �����ϴ� Ű�� �����͸� �����ϸ�
		// �ش� Ű�� ����ִ� �����Ͱ� ������������.
		classOneKor.put("ȫ�浿", 73);
		System.out.println("key=ȫ�浿,value=73�߰�: "+classOneKor);
		
		//remove�޼��� ���
		classOneKor.remove("ȫ�浿");
		
		System.out.println("key=ȫ�浿 ����: "+classOneKor);
		
		//get�޼��� ���
		System.out.println("key=Ȳ����, value="+classOneKor.get("Ȳ����"));
		
		Map<String, String> hashMap=new HashMap<String, String>();
		
		hashMap.put("ȫ�浿", "���ڳ��");
		hashMap.put("������ȣ", "�۽�Ʈ");
		hashMap.put("����", "����Ͻ�");
		hashMap.put("��ö��", "�۽�Ʈ");
		hashMap.put("Ȳ����", "���ڳ��");
		
		System.out.println(hashMap);
		
	
		hashMap.put("������ȣ", "���ڳ��");
		System.out.println("key=������ȣ, value=���ڳ�� �� ����: "+hashMap);
		
		//remove�޼��� ���
		hashMap.remove("Ȳ����");
		System.out.println("key=Ȳ���� ����:"+hashMap);
		
		//��� �°��� �¼������ ����ϼ���. get�޼��� ���
		System.out.println("key=ȫ�浿, value="+hashMap.get("ȫ�浿"));
		System.out.println("key=����, value="+hashMap.get("����"));
		System.out.println("key=������ȣ, value="+hashMap.get("������ȣ"));
		System.out.println("key=��ö��, value="+hashMap.get("��ö��"));
		
		//google�˻�: java 8 api document ����
		//HashSet - keySet
		Set<String> keySet=hashMap.keySet();
		Iterator<String> iterator=keySet.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key+"="+hashMap.get(key));
		}
	}

}
