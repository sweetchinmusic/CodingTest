package 이건_그냥_코딩테스트.just.coding.wtc_test;


public class ThreeSixNine {
	
	public static void main(String[] args) {
	new ThreeSixNine().solution(15);
	}
	
	public int solution(int number) {
		
		return count(number); // 솔루션에선 넘버를 매개변수로 받으니깐 그 솔루션의 결과값인 count도 넘버로 받겠지
	}
	
	private int count(int number) {
		int result = 0;
		
		for( int cnt = 1; cnt <= number; cnt ++) {
			
			String str = String.valueOf(cnt); //int를 String으로 변환
			System.out.println("str : " + str);
			for(int i = 0; i < str.length(); i++) { //근데 2자리 이상은 2번 작동
				char chk = str.charAt(i); // 그때 짤라먹는거
				System.out.println("chk : " + chk);
				if(chk == '3' || chk == '6' || chk == '9') { // 그것들 중 369가 있는지 // 추가 설명. charAt으로 짤라먹었기 때문에 ''문자로 해야함.
					
					result = result + 1; // 있네?
					
				}
			}
		}
		System.out.println(result);
//		System.out.println(String.format("%01d",01));
		return result;
	}
}
