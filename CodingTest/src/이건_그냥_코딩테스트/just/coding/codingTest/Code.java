package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code {

	public static void main(String[] args) {
		new Code().solution("browoanoommnaon");
	}
	
	public String solution(String cryptogram) {
		
		
		return decode(cryptogram);
	}
	
	public String decode(String str) {
		String result = "";
		
		boolean check = true;
		
		String[] array = str.split("");
		
		List<String> list = Arrays.asList(array);
		
		while(check) {
			check = false;
			List<String> cur_string = new ArrayList<>();
			cur_string.addAll(list);
			
			
			for( int i = 0; list.size() - 1 > i; i++) {
				
				if( list.get(i).equals(list.get(i + 1))) {
					System.out.println(cur_string);
					System.out.println(list.get(i) + " " + list.get(i + 1));
					cur_string.remove(i + 1);
					cur_string.remove(i);
					list = cur_string;
					check = true;
					continue;
					
					// check = true;
				}
				
			}
			list = cur_string;
			
			System.out.println(list);
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s);
		}
		result = sb.toString();
		System.out.println(result);
		return result;
		
		
	
	}

}
