package 이건_그냥_코딩테스트.just.coding.edu;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	int sum = 0;
	
	String line = sc.next();
	for(int i=0; i<num; i++) {
		sum += line.charAt(i) - '0'; // 여기서 String -> char -> int로 변환이 된다.
	}
	System.out.println(sum);
	}
}
