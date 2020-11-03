package 이건_그냥_코딩테스트.just.coding.edu;
// equals 학습

class Student{
	String name;
	Student(String name){
		this.name = name; // 자유롭게 바꿀 수 있다. name이라는 변수의 값이 같다면
	}
	public boolean equals(Object obj) {
		Student s =(Student)obj; // obj의 타입은 Object이기 때문에 형변환을 안 시키고 실행을 하면 cannot convert from Object to Student 라 뜨기 때문
		return this.name == s.name;
	}
}


class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
}


