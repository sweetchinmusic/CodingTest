package 이건_그냥_코딩테스트.just.coding.algorithm;
public class Maxium {

	static int max4(int a, int b, int c, int d) {

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4(3, 2, 1, 2) = " + max4(3, 2, 1, 2));
		System.out.println("max4(3, 2, 2, 2) = " + max4(3, 2, 2, 2));
		System.out.println("max4(3, 1, 2, 3) = " + max4(3, 1, 2, 3));
		System.out.println("max4(3, 2, 3, 3) = " + max4(3, 2, 3, 3));
	}
}
