package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;

import 이건_그냥_코딩테스트.just.coding.test.Solution;

public class BankATM {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().solution(410000)));
		// 

	}

	// 목표 최대한 지갑 내용이 가벼워여함.
	public int[] solution(int money) { // 왜 근데 매개변수가 필요한 걸까?

		int[] answer = new int[9];
		int[] sort_money = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };// 지폐종류

		for (int i = 0; i < sort_money.length; i++) { // 애들이 끝까지 나눌 수 있어야되니깐 길이 만큼 반복
			if (i == 0) { // 맨 처음 수라면 50000으로 먼저 나누게 하고
				answer[i] = (money / sort_money[i]);
			} else { // 그 다음 수 부터는 전에 나눴던 것에 나머지를 나누면 나오는 댓수가 나오게 한다.
				answer[i] = (money % sort_money[i - 1]) / sort_money[i];

			}

		}
		return answer;
	}
}
