package 이건_그냥_코딩테스트.just.coding.test;

public class Webtest {
	static int sval = 123;
	int ival = 321;
	public static void main(String[] args) {
		System.out.println(sval); // 123
		// 이와 같이 인스턴스 없이 바로 변수에 접근해서 사용 가능
//		System.out.println(ival); // error
		// 얘는 static이 아니라 인스턴스 없으면 안 됨
		Webtest ex1 = new Webtest();
		Webtest ex2 = new Webtest();
		System.out.println(ex1.sval); // 123
		ex2.sval = 321;
		System.out.println(ex1.sval); // 321
		
		ex1.ival = 456;
		
		System.out.println(ex1.ival); // 456
		System.out.println(ex2.ival); // 321
		// 공간이 공유되지 않음을 알 수 있음.
		
		
		
/*
 * why? 클래스 변수의 sval은 모든 인스턴스에서 하나의 저장공간을 공유하기 때문에
 * 다른 인스턴스에서 변경하면 다른 인스턴스도 변경된 값을 가진다.
 */
	}
}
