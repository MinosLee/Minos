package koreait.day09a;

/*
 * 클래스의 상속
 * -> 클래스간의 부모자식관계
 * 부모는 상위클래스(super), 자는 하위클래스 관계가 만들어짐. 상속하는 부모 클래스는 오직 1개임.
 * -> 부모의클래스 구성요소를 자식이 사용할 수 있음. 상속되는 요소는 필드, 메소드
 * -> extends 키워드를 사용하여 부모클래스 지정.
 * -> private 접근한정자는 상속안됨.
 * -> protected 는 다른 패키지의 클래스가 상속받을 수 있게 함.
 * 
 */

public class ClassA { // 부모클래스

	int ab;
	String name;
	protected String title; // protected는 디폴트 접근한정자이나 자식클래스는 예외로 허용

	void print() {
		System.out.println("ab= " + ab);
		System.out.println("name= " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
