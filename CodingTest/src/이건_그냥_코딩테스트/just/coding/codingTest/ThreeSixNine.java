package 이건_그냥_코딩테스트.just.coding.codingTest;


public class ThreeSixNine {
	
	public static void main(String[] args) {
	new ThreeSixNine().solution(15);
	}
	
	public int solution(int number) {
		
		return count(number);
		
	}
	
	private int count(int number) {
		int result = 0;
		
		for( int cnt = 1; cnt <= number; cnt ++) {
			
			String str = String.valueOf(cnt); //int를 String으로 변환
			System.out.println("str : " + str);
			for(int i = 0; i < str.length(); i++) { //근데 2자리 이상은 2번 작동
				char chk = str.charAt(i); // 그때 짤라먹는거
				System.out.println("chk : " + chk);
				if(chk == '3' || chk == '6' || chk == '9') { // 그것들 중 369가 있는지
					
					result = result + 1; // 있네?
					
				}
			}
		}
		System.out.println(result);
		return result;
	}
}
