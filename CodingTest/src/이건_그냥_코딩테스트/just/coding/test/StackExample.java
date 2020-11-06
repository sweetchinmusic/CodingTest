package 이건_그냥_코딩테스트.just.coding.test;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.add("김철수");
		stk.add("이영희");
		stk.add("박영수"); // Stack에 값 추가(나중에 넣은게 먼저 나옴)
		
		// Stack에 특정 값 들었나 확인
		System.out.println("Stack 안에 이영희 들었는지 확인 : " +  stk.contains("이영희"));
		// Stack에서 다음에 나올 값 확인
		System.out.println("Stack pop 시 값 : " + stk.peek());
		// Stack의 i번째 인덱스에 뭐가 들었나 확인
		System.out.println("0번째 인덱스 확인 : " + stk.elementAt(0));
		// Stack에서 특정 값이 어느 인덱스에 들었나 확인
		System.out.println("특정 값의 인덱스 확인 : " + stk.indexOf("이영희"));
		// Stack의 i번째 인덱스 삭제
		stk.remove(2);
		// Stack의 특정 인덱스 값 변경
		stk.set(1, "박영희");
		// Stack의 크기 설정 
		// (설정 이전에 크기보다 Stack의 크기가 작으면 나머지는 null 처리)
		stk.setSize(5);
		
		System.out.println("###For 문 시작###");
		for(int i = 0; i<stk.size();) {
			System.out.println(stk.pop()); // Stack의 값 빼내기
		}
		
		stk.clear(); // Stack 비우기
		System.out.println(stk.empty()); // Stack 비었나 확인
		
	}

}