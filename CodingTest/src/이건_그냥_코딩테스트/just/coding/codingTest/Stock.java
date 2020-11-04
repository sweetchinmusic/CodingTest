package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Stack;

public class Stock {

	public static void main(String[] args) { // 아 근데 스택은 안 나올 것 같아
		// TODO Auto-generated method stub

	}

	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			int count = 0;
			int val = prices[i];
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = prices.length - 1; j >= i + 1; j--) {
				stack.add(prices[j]);
			}
			int size = stack.size();
			for (int j = 0; j < size; j++) {
				count++;
				if (val > stack.pop()) {
					break;
				}
			}
			answer[i] = count;
		}
		return answer;
	}
}
