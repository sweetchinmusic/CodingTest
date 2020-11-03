package 이건_그냥_코딩테스트.just.coding.edu;

public class Pita {

	public static void main(String[] args) {
		int a, b, c, n = 0;

		for (a = 1; a < 15; a++) {
			for (b = 1; b < 15; b++) {
				for (c = 1; c < 15; c++) {
					if ((a < b) && (a * a + b * b == c * c)) {
						n++;
						System.out.println("(" + n + ") a = " + a + ", b =" + b + ", c = " + c + "이면 피타고라스 정리를 만족합니다.");
					}
				}
			}
		}

	}
}
