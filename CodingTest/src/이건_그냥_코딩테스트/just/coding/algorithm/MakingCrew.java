package 이건_그냥_코딩테스트.just.coding.algorithm;

import java.util.Scanner;

public class MakingCrew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String team;
		
		switch(num % 5) {
		case 1:
		team = "1조";
		break;
		case 2:
		team = "2조";
		break;
		case 3:
		team = "3조";
		break;
		case 4:
		team = "4조";
		break;
		default:
		team = "다시";
		}
		System.out.println(team);
		
	} // 다시라고 말하고 다시 선택할 수 있게 했으면 좋겠다.

}
