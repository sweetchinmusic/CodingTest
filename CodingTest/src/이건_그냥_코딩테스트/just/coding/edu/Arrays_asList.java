package 이건_그냥_코딩테스트.just.coding.edu;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_asList {
	public static void main(String[] args) {
		new Arrays_asList().method1();
//		new Arrays_asList().method2();
	}

	public void method1() {
		String[] strs = { "alpha", "beta", "charlie" };
		System.out.println(Arrays.toString(strs)); // [alpha, beta, charlie]
		List<String> lst = Arrays.asList(strs); // new ArrayList<String>(); 대신에 사용
		
		System.out.println(lst); // [alpha, beta, charlie]
		//lst.add("ttt"); // error : asList()로 List를 생성하면 사실 List가 아니기 때문에 원소를 새롭게 추가할 수 없음 얘도 기본 배열을 갖게됨.
		// Exception in thread "main" java.lang.UnsupportedOperationException
		// Changes in array or list write thru
		strs[0] += "88"; // 그래서 str에다가 추가를 한 다음에
		lst.set(2, lst.get(2) + "99"); // 2번째 인덱스 원소에 charlie99 넣음
		System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie99]
		System.out.println(lst); // [alpha88, beta, charlie99]
		// asList()를 사용해서 new 객체를 만드는게 아니라 원본 배열의 주소값을 불러옴
		// 그래서 수정하면 원본 것도 바뀐다네요...So 추가/삭제 불가
		// Initialize a list using an array
		List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
		System.out.println(lstInt); // [22, 44, 11, 33]
	}

	public void method2() { // 하지만 얘는 ArrayList를 새로 생성하는 것 위에 안되는 게 가능하다.
		String[] strs = { "alpha", "beta", "charlie" };
		System.out.println(Arrays.toString(strs)); // [alpha, beta, charlie]
		List<String> lst = new ArrayList<String>(Arrays.asList(strs));
		System.out.println(lst); // [alpha, beta, charlie]
		lst.add("ttt"); // 이제는 에러가 나지 않고 데이터를 추가 시킬 수 있다.
		
		// Changes in array or list write thru
		strs[0] += "88";
		lst.set(2, lst.get(2) + "99"); // 2번째 인덱스 원소에 charlie99 넣음
		System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie]
		System.out.println(lst); // [alpha, beta, charlie99, ttt]
		
		//이제는 원본 배열과 lst 객체에 담겨있는 배열 데이터는 별개의 주소값이라고 보면 된다.
		// Initialize a list using an array
		List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
		System.out.println(lstInt); // [22, 44, 11, 33]
	}
}