package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Scanner;

public class BetaTest {

	public static void main(String[] args) {

		new BetaTest().solution();
	}

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

	public void solution() {
		for (int i = 0; i < a; i++) {
			for (int j = 1; j < a - i; j++) {
		//for (int j = a ; j > i + 1 ; j++)
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}