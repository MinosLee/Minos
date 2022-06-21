package koreait.day07;

public class C36_C35Test {
//C35 클래스를 1)객체로 만들어서  2) static인 것들을 테스트
	// 참고 : main메소드를 갖는 클래스를 객체로 만들어 사용하지 않는 것이 일반적임.

	public static void main(String[] args) {

		// test1, 2는 참조형 변수
		C35_GlobalVar test1 = new C35_GlobalVar(); // C35클래스타입의 객체를 생성
		C35_GlobalVar test2 = new C35_GlobalVar(); // C35클래스타입의 객체를 생성

//		C35클래스에서 static이 아닌 인스턴스 변수에는 객체마다 다른 값을 저장함 - 객체 각각 다른 특성을 나타냄.
		test1.count = 10;
		test2.count = 20;
		test1.message = "hi test1";
		test2.message = "hello test2";

		test1.methodA(); // 인스턴스 메소드
		test2.methodA();

		test1.methodC(123); // C35의 메소드C의 this.count에서 this는 test1을 의미하게 됨.
		test2.methodC(999);

		System.out.println("test1.count= " + test1.count);
		System.out.println("test2.count= " + test2.count);

		// static요소 테스트 : static변수 또는 static메소드는 클래스 이름으로 접근

		C35_GlobalVar.num = 101;
		System.out.println("static num= " + C35_GlobalVar.num);
		System.out.println("static num= " + test1.num); // static으로 접근하라는 오류가 뜸
		System.out.println("static num= " + test2.num);

		// static이 저장되는 메모리영역(메소드영역)과 객체가 저장되는 메모리영역(힙영역)은 다름.

		// 상수 TEST확인
		System.out.println("TEST=" + C35_GlobalVar.TEST);
		// C35_GlobalVar.TEST=100; //final값은 변경불가

		C35_GlobalVar test3 = new C35_GlobalVar();
		// 전역변수의 기본초기값- 0, 0.0, 참조타입은 null
		// 참고 : 지역변수의 기본초기값? = 배열일땐 0, 0.0, 참조타입은 null, 그 외 나머지는 오류
		System.out.println("test3.count=" + test3.count); // 0
		System.out.println("test3.message=" + test3.message); // null
		System.out.println("C35_GlobalVar.point=" + C35_GlobalVar.point);// 0.0

	}

}
