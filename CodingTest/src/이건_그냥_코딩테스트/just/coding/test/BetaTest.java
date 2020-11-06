package 이건_그냥_코딩테스트.just.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetaTest {

	public static void main(String[] args) { 
		
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
			
			for(int i = 0; i <list.size() -1 ; i++) {
				
				if( list.get(i).equals(list.get(i + 1))) {
					cur_string.remove(i);
				}
			}
			
		}

		return str;
		
	}
	
}