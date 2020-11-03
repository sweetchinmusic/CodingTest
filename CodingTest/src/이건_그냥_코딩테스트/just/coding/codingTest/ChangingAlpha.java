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

public class ChangingAlpha {

	public static void main(String[] args) {
		System.out.println("answer : "+new ChangingAlpha().solution("zv",1));
	}

	public String solution(String s, int n) {
		String answer = "";
		String[] array_word;// 입력한 문자를 여기다가 정립할꺼

		Map<String, String> alpha = new HashMap<>(); // 알파에다가 원래 값과 바뀔 값을 넣습니다.
		char[] alpabat = new char[26]; //26개이므로 반복문도 26번

		for (int i = 0; i < alpabat.length; i++) {
			int a = ('A' + i); // A-Z까지 배열
			int b = a + n;// 그 배열한 것에서 한 칸씩 밀려나기
			if (b <= 90) {
				alpha.put(Character.toString((char) (a)), Character.toString((char) (b))); // 안 넘어가네?
			} else {
				alpha.put(Character.toString((char) (a)), Character.toString((char) (b-26))); // 넘어가네?

			}
		}
		System.out.println(alpha);
		array_word = s.split(""); // 자, 입력받은 걸 ""단위로 짜릅니다. 
		System.out.println("array_word : "+ Arrays.toString(array_word));

		for (String c_word : array_word) {
			boolean is_upp = Character.isUpperCase(c_word.charAt(0)); // 모든 값이 대문자인지 확인
			System.out.println("is_upp : "+is_upp);
			String temp_result = alpha.get(c_word.toUpperCase()); // 애들을 대문자로 설정해놔서 바뀌는 것도 대문자
			// isUpp를 통해서 어차피 소문자였으면 소문자로 돌아갈꺼임.
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
