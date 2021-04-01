package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex11 {

	public static void main(String[] args) {
		Map<String, Integer> classOneKor=new HashMap<String, Integer>();
		
		classOneKor.put("홍길동", 95);
		classOneKor.put("김철수", 18);
		classOneKor.put("고영희", 86);
		classOneKor.put("유노윤호", 36);
		classOneKor.put("황광희", 69);
		
		System.out.println("초기상태: "+classOneKor);
		// put 메서드를 사용할 때 이미 존재하는 키에 데이터를 저장하면
		// 해당 키에 들어있던 데이터가 덮었씌워진다.
		classOneKor.put("홍길동", 73);
		System.out.println("key=홍길동,value=73추가: "+classOneKor);
		
		Map<String, String> hashMap=new HashMap<String, String>();
		
		hashMap.put("홍길동", "이코노미");
		hashMap.put("유노윤호", "퍼스트");
		hashMap.put("고영희", "비즈니스");
		hashMap.put("김철수", "퍼스트");
		hashMap.put("황광희", "이코노미");
		
		System.out.println(hashMap);
		
	
		hashMap.put("유노윤호", "이코노미");
		System.out.println("key=유노윤호, value=이코노미 로 변경: "+hashMap);
	}

}
