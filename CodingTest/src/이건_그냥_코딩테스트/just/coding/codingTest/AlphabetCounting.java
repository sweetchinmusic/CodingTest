package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;

public class AlphabetCounting {

	public static void main(String[] args) {
		new AlphabetCounting().solution("Pyy");

	}

	boolean solution(String s) {
		boolean answer = true;

		String[] array_word = s.split(""); // 받아온 것을 짤라 담습니다.
		String p = Character.toString((char) ('P')); // String으로 변환
		String y = Character.toString((char) ('Y'));
		System.out.println(Arrays.toString(array_word)); // 경로에 에러가 나길래 이렇게 수정함
		int pp = 0; // 노 카운트
		int yy = 0;
		for (String c_word : array_word) { // 이 변수로 배열 안에 있는 것들을 하나씩 대입

			String temp_result = (c_word.toUpperCase()); // 해당 변수에 대입한 값을 대문자로 변환
			System.out.println(temp_result);
			if (temp_result.equals(p)) { // String P랑 비교하려고 대문자로 변환시켰음 ㅋㅋ // String은 == 가 안되기 때문에 equals로 해야함
				pp++; // 맞으면  ++
			} else if (temp_result.equals(y)) {
				yy++;
			}
		}

		System.out.println(pp);
		System.out.println(yy);

		if (pp == yy) {
			answer = true; // 갯수가 맞아? 그럼 true
		} else {
			answer = false;
		}
		System.out.println(answer);
		return answer;
	}

}
