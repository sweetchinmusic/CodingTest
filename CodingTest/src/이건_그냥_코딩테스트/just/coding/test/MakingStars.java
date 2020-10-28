package 이건_그냥_코딩테스트.just.coding.test;

import java.util.*;

public class MakingStars {
	static Scanner sc = new Scanner(System.in); // 난 메인 말고 다른 이름으로 두 개 넣고 싶은데

	public static void main(String[] args) throws Exception {
		System.out.print("1번 정방향 별찍기 2번 역방향 별찍기 : ");
		int a = sc.nextInt();
		if (a == 1) {
			new MakingStars().starForward();
		} else if (a == 2) {
			new MakingStars().starReverse();
		}
	}

	public String starForward() {
		System.out.println("정방향");
		System.out.print("숫자를 입력해주세요 : ");
		int t = sc.nextInt(); // 2를 입력 했다
		for (int i = 0; i < t; i++) { // 2까지 돌릴 껀데 자, 첫번쨰는 , 두번째는?
			for (int j = 0; j <= i; j++) {// 첫번째는 하나 쓰고 끝이지, 두 번 찍혀야지
				System.out.print("*");
			}
			System.out.println("");
		}
		return null;
	}

	public String starReverse() {
		System.out.println("역방향");
		System.out.print("숫자를 입력해주세요 : ");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			for (int j = i + 1; j < t; j++) { // 만약에 j = t + 1 로 하면 그냥 정방향이 된다. 이것도 잘 생각해보시고~
				System.out.print("a");
			}
			for (int k = t - i; k <= t; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return null;

	}

}
