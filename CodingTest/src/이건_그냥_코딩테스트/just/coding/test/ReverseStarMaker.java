package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Scanner;

public class ReverseStarMaker {

	public static void main(String[] args) {

		new ReverseStarMaker().solution();
	}

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();

	public void solution() {
		for (int i = 0; i < a; i++) {
			for (int j = 1; a > j + i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}