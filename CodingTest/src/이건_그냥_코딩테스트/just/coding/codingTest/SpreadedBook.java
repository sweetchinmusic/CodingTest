package 이건_그냥_코딩테스트.just.coding.codingTest;

public class SpreadedBook {

	static class Solution {
		public int solution(int[] pobi, int[] crong) {

			boolean page = validation(pobi, crong);
			if (!page) {
				return -1;
				// System.out.println("-1");
			}

			// 포비 점수내기
			int pobi_sum_score = sum(pobi);
			int pobi_mul_score = mul(pobi);

			int pobi_max_score = maxScore(pobi_sum_score, pobi_mul_score);

			// 크롱 점수내기
			int crong_sum_score = sum(crong);
			int crong_mul_score = mul(crong);

			int crong_max_score = maxScore(crong_sum_score, crong_mul_score);

			// 점수 리턴
			if (pobi_max_score > crong_max_score) {
				return 1;
				// System.out.println("1");

			} else if (pobi_max_score < crong_max_score) {
				return 2;
			} else if (pobi_max_score == crong_max_score) {
				return 0;
				// System.out.println("0");

			} else {
				return -1;
				// System.out.println("-1");

			}

		}

		static private int sum(int[] value) {

			int val_1 = 0;
			int val_2 = 0;

			String[] array1 = String.valueOf(value[0]).split("");
			for (String val : array1) {
				val_1 = val_1 + Integer.valueOf(val);
			}

			String[] array2 = String.valueOf(value[1]).split("");
			for (String val : array2) {
				val_2 = val_2 + Integer.valueOf(val);
			}

			return maxScore(val_1, val_2);
		}

		/*
		 * 곱하기
		 * 
		 * @param value
		 * 
		 * @return
		 */
		static private int mul(int[] value) {

			int val_1 = 0;
			int val_2 = 0;

			String[] array1 = String.valueOf(value[0]).split("");
			for (String val : array1) {
				val_1 = val_1 * Integer.valueOf(val);
			}

			String[] array2 = String.valueOf(value[1]).split("");
			for (String val : array2) {
				val_2 = val_2 * Integer.valueOf(val);
			}

			return maxScore(val_1, val_2);
		}

		/*
		 * 최고점수 출력
		 * 
		 * @param a
		 * 
		 * @param b
		 * 
		 * @return
		 */

		static private int maxScore(int a, int b) {

			if (a > b) {
				return a;
			} else {
				return b;
			}
		}

		static private boolean validation(int[] pobi, int[] crong) {
			
			boolean result = true;
			
			if(1 != Math.abs(pobi[0] - pobi[1])) {
				return false;				
			} else if (1 != Math.abs(crong[0] - crong[1])) {
				return false;
			} else {
				return result;
			}
		}
	}
}
