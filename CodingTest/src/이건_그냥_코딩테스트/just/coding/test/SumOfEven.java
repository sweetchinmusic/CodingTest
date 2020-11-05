package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 짝수의 합 따로 교육에 넣지 않겠어

		int a = sc.nextInt();
		int sum = 0;
//		for(int i=1; i<a+1; i++) {
//			if(i%2==1) {
//				continue;
//			} else {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//
		int i = 1;
		while (i < a + 1){
			if (i % 2 == 1) {
				// 왜 do while 문은 continue를 삭제해야 잘 작동이 될까? 심지어 while문이어도 되네
			} else {
				sum += i;
			}
			i++;
		} 
		System.out.println(sum);
	}

}
