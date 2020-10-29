package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 엄마가 하는 말의 글자를 반대로 배열하는 청개구리가 있다.
 * A B C D E F...
 * Z Y X W V U...
 * 제한사항
 * word는 길이가 1 이상 1,000 이하인 문자열입니다.
 * 알파벳 외의 문자는 변환하지 않습니다.
 * 알파벳 대문자는 알파벳 대문자로, 알파벳 소문자는 알파벳 소문자로 변환합니다.
 * 입출력 예
 * word       result
 * I love you R olev blf
 * 공백은 알파벳 외의 문자이므로 변환하지 않습니다.
 * 
 */
public class TreeFrog {

	public static void main(String[] args) {
		
		System.out.println(new TreeFrog().solution("I love you"));
	}
	
	public String solution(String word) {
		String result = "";
		
		String[] array_word; // 문자를 배열에
		String[] change_word = {"Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};
		// 일단 모두 대문자로 통일해서 해쉬맵에 저장해둡시다.
		Map<String,String> alpha = new HashMap<>();
		
		char[] alpabat = new char[26];
		
		for (int i = 0; i < alpabat.length; i++) {//알파벳 for문
			alpha.put(Character.toString((char) ('A' + i)), change_word[i]); //'A' = 65 i =0 , i만 1씩 증가하면서 'Z'까지 도달.
		}
		System.out.println("1. "+alpha);
		
		array_word = word.split("");
		System.out.println("2. "+word);
		System.out.println("2.5 " + Arrays.toString(array_word));
		for (String c_word : array_word) { // 배열에 한 칸씩 띄어쓰기까지 존재.
			boolean is_upp = Character.isUpperCase(c_word.charAt(0));// 이거 굳이 charAt을 써야하는 이유가 뭐야 !! 문자 하나 나올텐데 문자가 아닌가봐 에러뜨더라
			// 이거 boolean이라서 char 써야되는데 c_word가 String이라 변환해줘야함
			//isUpperCase(c_word) Error : 형식의 isUpperCase(char) 메서드는 인수(String)에 해당되지 않음
			System.out.println("3. "+is_upp);
			System.out.println("3.5 " + c_word);
			String temp_result = alpha.get(c_word.toUpperCase()); // 얘는 뭐야 다 대문자로 넣겠다는 말인가? 맞음 ㅇㅇ 애초에 is_upp으로 T/F 구분해뒀기 때문에
			
			System.out.println("4. " +temp_result);
			if (temp_result == null) {
				temp_result = " ";
			} else if (!is_upp) {
				temp_result = temp_result.toLowerCase();
			}
			result = result.concat(temp_result);
		}
		return result;
		
	
	}

}
