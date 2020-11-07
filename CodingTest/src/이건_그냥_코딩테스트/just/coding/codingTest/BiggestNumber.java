package 이건_그냥_코딩테스트.just.coding.codingTest;

public class BiggestNumber {

	public static void main(String[] args) {

//		new BiggestNumber().solution1("4177252841", 4);
		new BiggestNumber().solution2("4177252841", 4);

	}

	public String solution1(String number, int k) { // 솔직히 이거 너무 김.
		StringBuilder sb = new StringBuilder();

		int cnt = number.length() - k; // K개를 지우는 문제이지만 변환을 둬서 n 만큼 선택한다고 바꾼다.
		int left = 0; // while 안에 for문에서 맨 처음을 시작함. 큰 값의 index에 다음 인덱스가 주 시작
		int right = number.length() - cnt; // 끝을 담당함 범위를 자리수의 값 마다 나와야할 구역에 최대를 설정하는 듯? (10 - k) cnt로 시작
		int max = -1; // 맨 처음이니깐
		int idx = 0;

		while (cnt > 0) {
			max = -1; // 값 출력할 때마다 최소값 초기화.
			for (int j = left; j <= right; ++j) {
				int num = number.charAt(j) - '0'; // 지금 문자로 인식된 숫자를 출력하기 때문에 49가 나옴. 하지만 문자 '0'를 빼기하면 숫자 그대로 나오겠지? 이거
													// 알아두자.
				if (num > max) { // 들어간 수가 0 이상이어야 하지
					idx = j; // 가장 큰 수의 인덱스가 들어갈 꺼임.
					max = num;
				}
			}
			sb.append(number.charAt(idx));
			left = idx + 1; // 가장 컸던 것의 인덱스 아닌가? 거기 다음부터 시작 (사실 끝난 지점에서 다시 출발)
			right = number.length() - --cnt; // 왜냐하면 이미 하나 집어넣었으니깐 증가해야지
		}
		return sb.toString();

	}

	public String solution2(String number, int k) {
		int idx = 0;
		char max;
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0) == '0') return "0"; // 얘가 무슨 역할을 하는데? 맨 앞이 0이면 무슨 그게 문자열이야 그냥 결과값을 0으로 보내버리는겨
		for (int i = 0; i < number.length() - k; i++) {
			max = '0';
			for (int j = idx; j <= k + i; j++) {
				if (max < number.charAt(j)) {
						max = number.charAt(j); idx = j + 1;
				}
			}
			answer.append(max);
		} 
		System.out.println(answer.toString());
		return answer.toString();
	}
}
