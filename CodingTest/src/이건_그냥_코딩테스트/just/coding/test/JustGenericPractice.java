package 이건_그냥_코딩테스트.just.coding.test;
// 제네릭과 생성자를 알 수 있는 좋은 기회!
public class JustGenericPractice {
	// 제네릭 클래스의 파라미터를 T라고 작성합니다.
	static class GenericClass<T> {
		private T xyz; // T는 타입 xyz는 변수
		GenericClass(T t) { // 생성자 // 매개변수 포함
			this.xyz = t;
		}

		T getXyz() {		// xyz를 반환합니다.
			return xyz;
		}
	}

	public static void main(String[] args) {
		// 다음과 같이 파라미터에 String을 넘길 수 있고 Integer를 넘길 수도 있습니다.
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> i = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(i.getXyz());
	}

}
