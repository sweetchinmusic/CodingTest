package 이건_그냥_코딩테스트.just.coding.realTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol2_1 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString((new Sol2_1().solution("1234", "+"))));
	}

	public long[] solution(String s, String op) {
		long[] answer = new long[s.length()-1];
		System.out.println(Arrays.toString(answer));
		for (int i = 0; i < s.length()-1 ; i++) {
			
			String a = s.substring(0, i+1);
			String b = s.substring(i+1,s.length());
			System.out.println("a"+a);
			System.out.println("b"+b);
			int aa = Integer.parseInt(a);
			int bb = Integer.parseInt(b);
			if (op == "+") {
				answer[i]=sum(aa,bb);
				System.out.println(i);
				System.out.println("sum : "+answer[i]);
				
			} else if (op == "*") {
				answer[i]=mul(aa,bb);
				System.out.println(i);
				System.out.println("mul : "+answer[i]);
			} else if (op == "-") {
				answer[i]=min(aa,bb);
				System.out.println(i);
				System.out.println("min : "+answer[i]);
			}
		}
		System.out.println(Arrays.toString(answer));
//		answer = (long[])answer;
		System.out.println(Arrays.toString(answer));
		
		return answer;

	}
	static private int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	static private int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	static private int min(int a, int b) {
		int result = a - b;
		return result;
	}
}
