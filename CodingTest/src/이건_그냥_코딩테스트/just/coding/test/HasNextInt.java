package 이건_그냥_코딩테스트.just.coding.test;

import java.util.ArrayList;
import java.util.Scanner;

public class HasNextInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 숫자를 입력한 만큼
		for (int i = 0; i < a; i++) { // 반복을 하고 싶은데

			int b = sc.nextInt(); // 그 동안 받은 것들
			int c = sc.nextInt(); // 근데 이렇게 하면 제한되서 계속해서 받을 수가 없지 얜 두 개고 a 제한이 없는데

			if (sc.hasNextInt()) { // 있으면 출력 하고 닫기
				System.out.println(sc.nextInt()); //
			} else {
				sc.close();
			}
		}
	}

}
