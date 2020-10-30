/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만틈 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다."z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * 
 * ex)
 * s="a B z" n=4 result= "e F d"
 */
package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers1 {

	public static void main(String[] args) {
		System.out.println("answer : "+new Programmers1().solution("z  v", 1));
	}

	public String solution(String s, int n) {
		String answer = "";
		String[] array_word;// 입력한 문자를 여기다가 정립할꺼
		String[] change_word;

		Map<String, String> alpha = new HashMap<>();
		char[] alpabat = new char[26];

		for (int i = 0; i < alpabat.length; i++) {
			int a = ('A' + i);
			int b = a + n;
			if (b <= 90) {
				alpha.put(Character.toString((char) (a)), Character.toString((char) (b)));
			} else {
				alpha.put(Character.toString((char) (a)), Character.toString((char) (b-26)));

			}
		}
		System.out.println(alpha);
		array_word = s.split("");
		System.out.println("array_word : "+ Arrays.toString(array_word));

		for (String c_word : array_word) {
			boolean is_upp = Character.isUpperCase(c_word.charAt(0));
			System.out.println("is_upp : "+is_upp);
			String temp_result = alpha.get(c_word.toUpperCase());
			System.out.println("temp_result : "+temp_result);
			if (temp_result == null) {
				temp_result = " ";
				
			} else if (!is_upp) {
				temp_result = temp_result.toLowerCase();
			}
			answer = answer.concat(temp_result);

		}

		return answer;

	}

}
