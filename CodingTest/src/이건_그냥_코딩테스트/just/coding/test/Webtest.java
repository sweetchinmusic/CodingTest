package 이건_그냥_코딩테스트.just.coding.test;

public class Webtest {
	static int sval = 123;
	int ival = 321;
	public static void main(String[] args) { // 아마 코테 할 때 중요한 건 아닐겁니다. 테스형도 모르겠다고 하시네요
		System.out.println(sval); // 123
		// 이와 같이 인스턴스 없이 바로 변수에 접근해서 사용 가능
//		System.out.println(ival); // error // 얘는 static이 아니라 인스턴스 없으면 안 됨
		Webtest ex1 = new Webtest();
		Webtest ex2 = new Webtest();
		System.out.println(ex1.sval); // 123 // static int sval 잘 가져오는데?
		ex2.sval = 321; // 테스형! 선언이 왜 이래~ 여기 sval=321이 위로 올라가서 sval을 초기화 시킨건가?
		System.out.println(ex1.sval); // 321 // 왜 ex2.sval에 값이 대입되냐 이게 제일 이해 안 됨.
		
		ex1.ival = 456;
		System.out.println(ex2.sval); // 321 잘 받아오네
		System.out.println(ex1.ival); // 456
		System.out.println(ex2.ival); // 321
		// 공간이 공유되지 않음을 알 수 있음.
		
		
		
/*
 * why? 클래스 변수의 sval은 모든 인스턴스에서 하나의 저장공간을 공유하기 때문에
 * 다른 인스턴스에서 변경하면 다른 인스턴스도 변경된 값을 가진다.
 */
	}
}
