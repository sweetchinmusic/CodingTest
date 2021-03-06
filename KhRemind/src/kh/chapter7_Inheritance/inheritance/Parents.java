package kh.chapter7_Inheritance.inheritance;
/*
 * 상속
 * 
 * ** OOP(객체 지향 언어)의 3대 특징 중 하나로,
 * 	  기존의 구현된 클래스를 조상(super, 부모)과 후손(sub, 자식)
 * 	  나누어 클래스를 재사용하는 기술을 말한다.
 * 	  
 * ** 두 클래스 이상일 때 서로 관계가 있거나
 *	    공통되는 요소를 가질 경우 이를 상하 관계로 나누어
 *	    한 쪽이 다른 한 쪽을 참조함으로써 소스 코드의 중복을 줄일 수 있다.
 *	   
 * ** 일반적으로 자식 클래스는 부모의 모든 멤버 (필드 ) 변수와 메소드를 상속 받는다.
 * ** 단, 부모 클래스의 생성자와 초기화 블럭은 상속받지 않는다.
 * 잘못받은 경우에도 다 받아옴
 * ** 자식 클래스는 부모보다 필드 변수의 갯수가 적을 수 없다.
 * 
 * [사용방법]
 * [public] class (자식)클래스명 extends 부모클래스명 { . . . }
 * 
 * ** Why? **
 * 여러 클래스간 공통 부분을 상위의 클래스로 통합함으로써
 * 하위 클래스들을 한 번에 관리할 수 있다.
 * 
 * 만약 부모로부터 확장된 기능을 가지는 자식이 있을 경우
 * 자식을 각각 생성하여 class 내용을 구현하지 않고
 * 부모로부터 해당 내용을 모두 이어 받아 코드의 재사용성(개발 속도) 효율을
 * 증가시킬 수 있다.
 * 
 * 따라서, 부모 클래스의 변화는 자식에게 영향을 주지만,
 * 자식 클래스의 변화는 부모 클래스에게 영향을 주지 않는다.
 * 
 * 
 */
public class Parents {
	// 1. 필드 변수
	private int num1;
	private String str1;
	
	// 2. 생성자
	// 일반적으로 생성자는 개발자가 따로
	// 작성하지 않았을 때 기본 생성자를
	// 만들어 주지만, 상속관계에 있어서는
	// 자동으로 만들어 주지 않는다.
	public Parents() {
		num1 = 100;
		str1 = "상속 테스트 ";
	}
	
	 public void printStr() {
		 System.out.println(str1);
	 }
	 public int getNum1() {
		 return num1;
	 }
	 
	 public void setNum1(int num1) {
		 this.num1 = num1;
	 }
	
	
	
	
	
	
	
}
