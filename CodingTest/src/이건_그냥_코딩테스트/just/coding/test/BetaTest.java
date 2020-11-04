package 이건_그냥_코딩테스트.just.coding.test;

import java.util.Arrays;

public class BetaTest {

	public static void main(String[] args) {
		new BetaTest().solution(new int[] {6, 10, 2});
	}
	public String solution(int[] numbers) {
	        String answer = "";
	       Arrays.sort(numbers);
	       String temp = "";
	       for(int i = 0; i< numbers.length;i++) {
	    	  answer += numbers[i] + "";
	    	   
	       }
	        
	        return answer;
	    }
	}
