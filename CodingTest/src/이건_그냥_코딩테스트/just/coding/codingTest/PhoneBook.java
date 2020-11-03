package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;

public class PhoneBook {
	public static void main(String[] args) {
//		new PhoneBook().solution2();
	}

	class Solution {
		public boolean solution1(String[] phone_book) {
			boolean answer = true;

			for (int i = 0; i < phone_book.length; i++) {
				for (int j = 0; j < phone_book.length; j++) {
					if (i == j)
						continue;
					if (phone_book[j].indexOf(phone_book[i]) == 0) {// 접두어라면
						return false;
					}
				}
			}

			return answer;
		}

		public boolean solution2(String[] phoneBook) {
			for (int i = 0; i < phoneBook.length - 1; i++) { // 왜 하나를 뺏냐면 밑에 반복문에서 i가 2를 넘기면 j가 3이 될 수도 있어서
				for (int j = i + 1; j < phoneBook.length; j++) { // 같은 배열에서 서로 다른 인덱스를 구하고 싶을 땐 이렇게
					if (phoneBook[i].startsWith(phoneBook[j])) {
						return false;
					}
					if (phoneBook[j].startsWith(phoneBook[i])) {
						return false;
					}
				}
			}
			return true;

		}

		public boolean solution(String[] phoneBook) {
			Arrays.sort(phoneBook);
			boolean result = true;
			for (int i = 0; i < phoneBook.length - 1; i++) {
				if (phoneBook[i + 1].startsWith(phoneBook[i])) {
					result = false;
					break;
				}
			}
			return result;
		}

	}
}
