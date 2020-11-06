package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Scanner;

public class DesimalCounting { // 소수는 1과 자기 자신 외 다른 수로 나눌 수 없다.

	public static int getCount(int n) { // 입력받은 숫자까지의 소수를 계산하는 메소드
		int total = 0;
		int num = 2;

		while (num <= n) {
			for (int i = 2; i <= num; i++) {
				System.out.println("i순서 : " + i);
				System.out.println("num순서 : " + num);
				if (num % i == 0 && i != num) { // 입력받은 숫자 이외에 다른 숫자로 나누어 떨어질 경우 ( 소수가 아님 ) break // 근데 for문 한바퀴를 다 돌았는데
					// 왜 i ++는 안된 상태에서 내려가서 break로 나간다음에 i++가 되지? // 아 break로 아예 나가서 다시 2로 시작하는거구나
					System.out.println("i소수가 아님 : "+i);
					System.out.println("num 소수가 아님 : " + num);

					break;
				}
				if (num % i == 0 && i == num) { // for문의 i가 증가해 본인과 같아져 나누어 떨어질 경우 ( 소수 )
					System.out.println("i소수임 : " + i);
					System.out.println("num 소수임 : " + num);

					total++; // 소수의 갯수를 count하는 total 증가
					System.out.println(total);
					System.out.println("---------------------------");
				}
			}
			num++;
			System.out.println("num:"+num);
		}
		return total;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = getCount(n);
		System.out.println("소수 갯수는 : " + result);
	}
}
