package 이건_그냥_코딩테스트.just.coding.realTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public long[] solution(String s, String op) {
		long[] answer = new long[s.length()-1];
		
		for (int i = 0; i < s.length()-1 ; i++) {
			
			String a = s.substring(0, i+1);
			String b = s.substring(i+1,s.length());
			int aa = Integer.parseInt(a);
			int bb = Integer.parseInt(b);
			if (op == "+") {
				answer[i]=sum(aa,bb);
			} else if (op == "*") {
				answer[i]=mul(aa,bb);
			} else if (op == "-") {
				answer[i]=min(aa,bb);
			}
		}
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