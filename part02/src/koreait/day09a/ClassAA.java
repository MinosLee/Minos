package koreait.day09a;

public class ClassAA extends ClassA { // super클래스는 ClassA

	// ClassAA의 인스턴스 메소드
	// name 의 필드상속받은것으로 여기서 선언안함.
	void test() {
		setName("나연");
		System.out.println("*name= " + name);
	}

}

//파일을 별도로 만들어 테스트도 가능. 같은 파일 내에서 실행하고싶다면 public은 같은 파일 내에 하나만 존재해야 함.
