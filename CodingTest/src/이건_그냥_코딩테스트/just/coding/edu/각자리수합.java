package 이건_그냥_코딩테스트.just.coding.edu;

public class 각자리수합 {
	public int solution(int n) { // 각 자리에 있는 숫자들을 더 해 총 합을 숫자로 만든다.
		int answer = 0;

		while (n != 0) {
			System.out.println(n);
			answer += n % 10; //이거 1의 자리 더할라고
			System.out.println(answer);
			System.out.println(n);
			n /= 10; // int라서 소수점은 안나오잖아
			System.out.println(n);

		}

		return answer;
	}

	public static void main(String[] args) {

		각자리수합 test = new 각자리수합();
		int answer = test.solution(789);

		System.out.println(answer);
	}
}
