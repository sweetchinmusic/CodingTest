package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Scanner;

public class BetaTest {

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