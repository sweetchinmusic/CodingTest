package 이건_그냥_코딩테스트.just.coding.wtc_test;

import java.util.Arrays;

public class FindingLocation {

	public static void main(String[] args) {

		new FindingLocation().solution(new int[][] { { 1, 4 }, { 3, 4 }, { 3, 10 } });
	}

	public int[] solution(int[][] v) {

		int[] answer = new int[2];

		if (v[0][0] == v[1][0]) {
			answer[0] = v[2][0];
		} else if (v[1][0] == v[2][0]) {
			answer[0] = v[0][0];
		} else {
			answer[0] = v[1][0];
		}
		if (v[0][1] == v[1][1]) {
			answer[1] = v[2][1];
		} else if (v[1][1] == v[2][1]) {
			answer[1] = v[0][1];
		} else {
			answer[1] = v[1][1];
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

}