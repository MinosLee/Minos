package koreait.day11;

public class ClassX extends ClassAbs {
	// 추상클래스 상속받은 자식클래스는 반드시 추상메소드 재정의를 해야 함.

	private int num;

	@Override
	public void test() {
		System.out.println("ClassX의 test()");
		System.out.println("num=" + num);
	}

	public void setNum(int num) {
		this.num = num;
	}

}
