package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;
import java.util.Scanner;

class NumberK {
	public static void main(String[] args) {
		//String[] a = { "119", "97674223", "1195524421" };
		//new FigureOutNumbers().solution(new String[] {"119", "97674223", "1195524421"}); // new String[] {""}로 되는구나 문자열 입력하기

		//[1, 5, 2, 6, 3, 7, 4]         [2, 5, 3], [4, 4, 1], [1, 7, 3]
		Scanner sc = new Scanner(System.in);
		
		new NumberK().solution();
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); 
			// copyOfRange : (배열, 시작할 인덱스 0이기 때문에 -1한다, 그리고 마지막 배열)
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}
}