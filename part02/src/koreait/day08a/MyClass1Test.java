package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {

	public static void main(String[] args) {

		// My Class1객체생성
		MyClass1 my = new MyClass1();

		// 패키지가 다른 MyClass1 클래스의 필드 중 사용할 수 있는 것은? point
		// default(package) 한정자 필드name, 메소드 setAge, getAge 사용불가
		// my.name= "momo"; //string name이 public이 아님
		my.point = 1.234;
		// my.age= 23 오류- private 한정자 필드
		// my.setAge(23); //setAge와 getAge도 public이 아님.

		// System.out.println("age = " + my.getAge()); //private 필드 값을 읽어오는 메소드 getter

		// my.setAge(-100);
		// System.out.println("age = " + my.getAge());
		System.out.println("age = " + my.point);
		// System.out.println("age = " + my.name);

		// Score 클래스 필드, 메소드의 한정자가 모두 default임.
		// new 객체생성은 되는가? 답 (O) class는 public한정자이므로 생성됨.
		Score score = new Score();

	}

	// 접근한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용함.

}
