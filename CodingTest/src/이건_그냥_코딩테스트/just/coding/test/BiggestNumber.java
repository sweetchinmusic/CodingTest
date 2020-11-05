package 이건_그냥_코딩테스트.just.coding.test;

public class BiggestNumber {

	public static void main(String[] args) {

		new BiggestNumber().solution1("1234", 2);
		new BiggestNumber().solution2("1234", 2);

	}

	public String solution1(String number, int k) {
		StringBuilder sb = new StringBuilder();

		int cnt = number.length() - k; // K개를 지우는 문제이지만 변환을 둬서 n 만큼 선택한다고 바꾼다.
		int left = 0;
		int right = number.length() - cnt;
		int max = -1;
		int idx = 0;

		while (cnt > 0) {
			max = -1;
			for (int j = left; j <= right; ++j) {
				System.out.println("part 1---------");
				System.out.println("left : " + left);
				int num = number.charAt(j) - '0'; // 지금 문자로 인식된 숫자를 출력하기 때문에 49가 나옴. 하지만 문자 '0'를 빼기하면 숫자 그대로 나오겠지? 이거
													// 알아두자.
				System.out.println("num : " + num);
				if (num > max) { // 들어간 수가 0 이상이어야 하지
					idx = j;
					max = num;
				}
			}
			sb.append(number.charAt(idx));
			left = idx + 1;
			System.out.println("part 2------------");
			System.out.println("left : " + left);
			right = number.length() - --cnt; // 왜냐하면 이미 하나 집어넣었으니깐 증가해야지
			System.out.println("right : " + right);
		}
		System.out.println(sb);
		return sb.toString();

	}

	public String solution2(String number, int k) {
		int idx = 0;
		char max;
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0) == '0')
			return "0";
		for (int i = 0; i < number.length() - k; i++) {
			max = '0';
			for (int j = idx; j <= k + i; j++) {
				if (max < number.charAt(j)) {
					max = number.charAt(j);
					idx = j + 1;
				}
			}
			answer.append(max);
		}
		return answer.toString();
	}
}
