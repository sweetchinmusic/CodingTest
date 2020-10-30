package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;

public class Programmers2 {

	public static void main(String[] args) {
		new Programmers2().solution("Pyy");

	}

	boolean solution(String s) {
		boolean answer = true;

		String[] array_word = s.split("");
		String p = Character.toString((char) ('P'));
		String y = Character.toString((char) ('Y'));
		System.out.println(Arrays.toString(array_word));
		int pp = 0;
		int yy = 0;
		for (String c_word : array_word) {

			String temp_result = (c_word.toUpperCase());
			System.out.println(temp_result);
			if (temp_result.equals(p)) {
				pp++;
			} else if (temp_result.equals(y)) {
				yy++;
			}
		}

		System.out.println(pp);
		System.out.println(yy);

		if (pp == yy) {
			answer = true;
		} else {
			answer = false;
		}
		System.out.println(answer);
		return answer;
	}

}
