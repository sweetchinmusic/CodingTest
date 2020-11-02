package 이건_그냥_코딩테스트.just.coding.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RealTestVersion {

	public static void main(String[] args) {

//	ArrayList<Integer> arrr = new ArrayList<Integer>();
//	
//	arrr.add(3);
//	// 아 원래는 뭘 생각했냐면 -1 없으면 갯수 안 셀줄 알았는데 integer가 안 셀리가 없지 암.
//	

		Map<String, String> map = new HashMap<String, String>();
		map.put("no", "1");
		map.put("id", "hello");
		map.put("pass", "1234");
		// Iterator 인터페이스를 사용할 수 없는 컬렉션인 Map에서 Iterator 인터페이스를 사용하기 위해서는 // 써야하는 이유가 뭘까?
		// Map에 entrySet(), keySet() 메소드를 사용하여 Set 객체를 반환받은 후 Iterator 인터페이스를 사용하시면 됩니다.
		Iterator<String> iter = map.keySet().iterator(); // 은 key 값만 필요할 경우 사용합니다.
		System.out.println(iter);

		while (iter.hasNext()) {
			String keys = (String) iter.next();
			System.out.println("[key]:" + keys + ", [value]:" + map.get(keys));
		}

		// 방법 02 : keySet()
		for (String keys : map.keySet()) {
			String value = map.get(keys);
			System.out.println("[key]:" + keys + ", [value]:" + value);
		}
	}

}
