package 이건_그냥_코딩테스트.just.coding.edu;

import java.util.Arrays;

public class Test { // 배열 숫자를 문자열로 집어 넣는 방법

	public static void main(String[] args) {
		new Test().solution(new int[] {6, 10, 2});
	}
	public String solution(int[] numbers) {
	        String answer = "";
	       Arrays.sort(numbers); // 정렬을 하고
	       String temp = ""; // 옮길 곳을 만든 다음
	       for(int i = 0; i< numbers.length;i++) {
	    	  answer += numbers[i] + "";// 순차적으로 넣는다 
	    	   
	       }
	        System.out.println(answer);
	        return answer;
	    }
	}
