package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.ArrayList;

public class Programmers3 {

	public static void main(String[] args) {
		new Programmers3().solution(23);
	}

	public static void solution(int n) {

		int i = 2; // i : 나눌 대상

		boolean isPrime = true;

		while (i <= n) {

			isPrime = true;

			for (int m = 2; m < i; m++) {

				if (i % m == 0) { // 나눠서 0이 될  거면 소수가 아니지

					isPrime = false;
					break;

				}

				continue;

			}

			ArrayList<Integer> numbers = new ArrayList<>();
			if (isPrime == true)

				numbers.add(i);
				System.out.println(i);
				System.out.println(numbers);

			i++;
		}
	}
}