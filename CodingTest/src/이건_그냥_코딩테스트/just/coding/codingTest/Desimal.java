package 이건_그냥_코딩테스트.just.coding.codingTest;

public class Desimal {

	public static void main(String[] args) {
		new Desimal().solution(10);
	}

	public int solution(int n) {
		int count = 0;
		for(int i=1; i< n; i++) {
			if(n%i==0) {
				System.out.println(i);
				continue;
			}
			System.out.println(i);
			System.out.println("소수다!");
			count++;
		}
		System.out.println(count);
		
		int answer = 0;
		return answer;
	}

}
