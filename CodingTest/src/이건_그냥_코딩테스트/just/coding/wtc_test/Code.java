package 이건_그냥_코딩테스트.just.coding.wtc_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code {

	public static void main(String[] args) {
		new Code().solution("browoanoommnaon"); 
	} // 2. 그니깐 
	
	public String solution(String cryptogram) {
		// 해당 메소드의 매개변수에 넣고 decode에 매개변수를 넣은 값을 반환받는다.
		
		return decode(cryptogram);
	}
	
	public String decode(String str) {
		String result = ""; //문자열 다룰 때 국룰인듯?
		
		boolean check = true; // 설정
		
		String[] array = str.split(""); // 문자열 하나씩 짤.
		
		List<String> list = Arrays.asList(array); // 아 사이즈 바꿀라고 ? 이건 일반배열을 arrayList로 바꿔준다.
		
		while(check) { // 시작
			check = false; // 반복 금지
			List<String> cur_string = new ArrayList<>(); // arrayList를 생성하고
			cur_string.addAll(list); // 안에 인자로 콜렉션을 넘기면 그것의 아이템이 모두 리스트에 추가됨.
			
			
			for(int i = 0; i<list.size() - 1; i++) { // 조심해야함. 이거 마이너스 안하면 IndexOutofBoundsException 뜬다. 인덱스가 하나 더 많다는 얘기야.
				System.out.println(i);
				if( list.get(i).equals(list.get(i + 1))) { // 앞과 뒤가 같은게 있냐
					System.out.println(cur_string);
					System.out.println(list.get(i) + " " + list.get(i + 1)); // 아마 얘 때문일껄?
					cur_string.remove(i ); // List 는 remove해서 지울수가 있나벼 // ArrayList는 안되는 것 같더라고
					cur_string.remove(i);
					list = cur_string; // 솔직히 이건 읽으면서 이해를 해보자
					check = true;
					continue;
					
					// check = true;
				} // 무한 반복
				
			}
			list = cur_string; // 넣는다.
			
			System.out.println("list : "+list); // 왜 두 번 출력됐지.??
		}
		
		StringBuilder sb = new StringBuilder(); // 이건 뭔데 읽는 객체를 만들겠다는건가.
		for (String s : list) {
			sb.append(s); // 지정된 문자열을 이 인스턴스의 끝에 복사합니다.
		}
		result = sb.toString(); // 그래서 이렇게 붙이고. String으로 변환해줘야됨.
		System.out.println(result);
		return result;
		
		
	
	}

}
