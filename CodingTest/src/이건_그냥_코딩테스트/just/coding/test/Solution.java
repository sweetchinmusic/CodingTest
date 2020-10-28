package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Arrays;

public class Solution {
	
	
	public int[] solution(int money) { // 돈을 넣습니다.
		
		int[] answer = new int[9]; // 제시한 금액들을 담을 배열을 만들고
		int[] sort_money = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; // 제시한 배열을 구분 해놓습니다.
		
		for (int i = 0; i < sort_money.length; i++) { // 배열만큼 반복문을 돌리면서, 맨 처음엔 전체 금액을 제일 많은 금액인 0번째로 나누고
			if (i == 0) {
				answer[i] = (money / sort_money[i]);
			} else { 
				answer[i] = (money % sort_money[i - 1]) / sort_money[i]; // 그 뒤에는 전에 나눴던 금액의 나머지를 그 다음 번째 수가 나눕니다.
			}
		}

		return answer; //그러면 답이 나오지
		
	}
	
	
}
