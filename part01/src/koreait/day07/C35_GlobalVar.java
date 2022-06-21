package koreait.day07;

public class C35_GlobalVar {
	/*
	 * [변수가 선언된 위치로 구분함] 지역변수(local variable) : 메소드, for, if, while 등등{ }에서 선언된 변수.
	 * 블록을 벗어나면 변수가 사라짐 전역변수(Global Variable) : 클래스 { }에서 선언된 변수
	 * 
	 * [전역변수를 static 여부로 구분] 클래스이름. 변수명 객체를 만들어서 사용하는 this.변수명 (이때 변수는 인스턴스 변수라고 함)
	 * 
	 * 전역변수는 클래스 또는 객체의 특성을 나타낼 때 필드field(또는 프로퍼티property)라고 부름.
	 */
	int count; // 위치를 이렇게 선언하면 전역변수가 됨.
	String message;
	static int num;
	static double point;
	static final int TEST = 9999; // static final은 상수임. 선언할때 초기화 해주지 않으면 오류뜸.

	public static void main(String[] args) { // static은 static만 접근함.
		int num = 10; // main메소드에서만 사용
		System.out.println("num=" + num);// 10
//		System.out.println("message =" + message); //static이 아닌 message는 접근 불가.
		methodB();
//		methodA();//오류 : static이 아닌 메소드

	}

	public void methodA() {
		int num = 99; // methodA에서만 사용하는 변수
		System.out.println("num=" + num);// 99
		System.out.println("message = " + message); // 전역변수로 선언된 message

	}

//***중요
	public void methodC(int count) {
		this.count = count; // this는 new로 만들어진 객체를 지칭. methodC 메소드를 실행시키는 객체
	}

	public static void methodB() {
		int num = 77; // methodB에서만 사용하는 변수
		System.out.println("num=" + num);// 99
		System.out.println("num = " + C35_GlobalVar.num); // Integer.BYTES와 같은형태
		// 전역변수로 선언된 num. 지역변수와 전역변수 이름이 같은 경우. static일 때는 클래스이름.변수명 , static이 아닐 때는
		// this.변수명을 사용
		// 지역변수는 갈색,
	}

}
