package 이건_그냥_코딩테스트.just.coding.wtc_test;

import java.util.Arrays;

public class WTC_second {

	public static void main(String[] args) {

		new WTC_second().solution2();

	}
	
	// 좌표 지점부터 일정 거리 안에 있는 부분이 모두 몇 개인지 세는 프로그램
	public int solution1(int location[][]) {
		
		
		
		return 0;
		
		
	
	}
	// 연/월/일/시/분/초 값을 주고, 시간만 정리하여 배열에 표현하는 프로그램
	public int solution2() {
		// split으로 /로 끊어서
		String a = "10/9/8/7/6/5";
		
		String[] b = a.split("/");
		
		System.out.println(Arrays.toString(b));
		int sum = 0;
		// 문자들을 숫자로 출력하기

		for(int i = 0; i<b.length;i++) {
			sum += Integer.parseInt(b[i]);
			System.out.println(sum);
		}
		return sum;
		
		
		
	}
	
	
}
