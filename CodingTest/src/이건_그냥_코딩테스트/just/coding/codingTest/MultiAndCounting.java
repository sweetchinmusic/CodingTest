package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Scanner;

public class MultiAndCounting { // 세 수를 합한 후 갯수를 센다. 숫자를 세는 방법은 '0' 문자를 자르는데 아스키코드

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		

		String str = Integer.toString(value);
		System.out.println(str);
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0' == i)) {
					count++;
				}

			}
			System.out.println(count);
		}
	}
}