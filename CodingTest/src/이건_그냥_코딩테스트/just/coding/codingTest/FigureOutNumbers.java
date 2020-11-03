package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;
import java.util.List;

public class FigureOutNumbers {

	public static void main(String[] args) {
		String[] a = { "119", "97674223", "1195524421" };
		new FigureOutNumbers().solution(new String[] {"119", "97674223", "1195524421"}); // new String[] {""}로 되는구나 문자열 입력하기
		//매개변수 넣기
	}

	public boolean solution(String[] phone_book) {
		boolean answer = false;

		for (int i = 0; i < phone_book.length; i++) { // 배열 하나 씩 돌릴 것임.
			String[] array = phone_book[i].split("");
			
			List<String> list = Arrays.asList(phone_book);

			// 짤라놓고 여기서 또 for문을 돌릴꺼야
			
			for (int j = 0; j < phone_book[i].length(); j++) {
				int count = 0;
				int k = 0;
//				if (phone_book[i][k].equals(phone_book[i + 1][j])) { // 심지어 이거 오른쪽 폰북은 3이라서 배열에 맞지도 않음. array는 갯수 제한이 //심지어 j번째가 서로 같을리도 없네 아이고
																		// 있다하지 않나?
					count++; // 이 카운트 스텍이 쌓이면

					if (count == phone_book[i].length()) {
						answer = true;
						break;
					}
				}
			}
	

		return answer;
	}
}
