package koreait.day08;

//이렇게 객체를 생성하는 클래스도 있음
public class MyClass3 {
//필드타입이 자기 자신인 클래스
	private static MyClass3 my = new MyClass3();

	private MyClass3() { // 생성자는private- 다른클래스에서 new 동작 X

	}

	public static MyClass3 getInstance() {
		return my;
	}

	public void test() {
		System.out.println("이렇게 객체를 생성하는 클래스는 객체를 오직 1개만 만듭니다.");
	}

	public static void staticTest() {
		System.out.println("이 메소드는 객체와 상관없는 static입니다.");
	}

}
