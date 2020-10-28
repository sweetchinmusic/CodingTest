package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//입력 받을 숫자
		
		for(int i = 1; i<a+1; i++) {
			if(i%2==1) {
			System.out.print("수");
			} else {
			System.out.print("박");
			}
		}
	}

}
