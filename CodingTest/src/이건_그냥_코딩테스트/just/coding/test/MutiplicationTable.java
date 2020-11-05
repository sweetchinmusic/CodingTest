package 이건_그냥_코딩테스트.just.coding.test;

public class MutiplicationTable {

	public static void main(String[] args) { // 구구단

		
		// 구구단을 실행하기 위한 int i= 2;
		for(int i = 2; i < 9 ; i++) {
			// 1~9까지 곱해주기 때문에 범위 설정
			if(i != 3) {
			for(int j = 2; j < 9 ; j++) {
				
				System.out.println(i + " * " + j + " = " + i*j);
				
			}
			// 단이 끝나면 다른 한줄이 나와야함으로 추가
			System.out.println();
		} else {
			// 만약 i=3인 경우에는 건너 뛰게 한다.
			continue;
		}
	}
	}
	

}
