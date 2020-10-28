package 이건_그냥_코딩테스트.just.coding.test;

public class Structure {

	public static void main(String[] args) {
		
		Name name = new Name("홍길동", "임꺽정"); // 1. class name에 변수, 그리고 매개변수가 있는 생성자에 홍길동 임꺽정을 넣었다
		
		System.out.println(name.getMyName() + name.getYourName()); // 5. 여기서 호출하면 그 값을 반환한다.

	}
	
}

 class Name {
	 String myName; // 이곳에 변수 값을 입력 및 출력
	 String yourName;
	 
	 
	 public Name(String myName, String youtName) {
		 setMyName(myName); // 2. 하늘색 값 이게 setMyName에 매개변수가 되고
		 setYourName(yourName);
	 }
	 public String getMyName() { // 4. 값을 반환하는데
		 return myName;
	 }
	 public String getYourName() {
		 return yourName;
	 }
	 public void setMyName(String myName) { // 3. 매개변수를 따라 this.myName 맨 위 변수에 값을 입력하게 된다.
		 this.myName = myName;
	 }
	 public void setYourName(String yourName) {
		 this.yourName = yourName;
	 }
 }
