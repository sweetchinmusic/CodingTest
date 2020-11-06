package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Scanner;

public class ThreeIntegerMultiple {// 세 수를 더하고 0~9까지의 성분들을 찾아 갯수를 발현함.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());

		String str = Integer.toString(value);

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0' == i)) {
					count ++;
				}

			}
			System.out.println(count);
		}

//		new BetaTest().solution();
	}

//	public int solution() {}
}