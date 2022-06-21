package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {

	// 익명 클래스 anonymous. 이름없는 클래스.

	public static void main(String[] args) {

		// 마름모꼴
		AShape sha = new AShape() {
			// 추상메소드 재정의
			// 익명 내부(Inner) 클래스 정의. 1회용 클래스 정의(추상메소드 재정의 필수)
			@Override
			public double getArea() {

				return width + height;
			}
		};

		AShape sha2 = new AShape(20, 13) {

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + height;
			}
		};

		System.out.println("sha 넓이 =" + sha.getArea());
		System.out.println("sha 넓이 =" + sha2.getArea());

		// 추상클래스 아닐 때도 메소드 재정의해서 쓰면 익명클래스처럼 쓸 수 있나?
		// 가능. 단 추상메소드 재정의를 하면 익명클래스를 많이 씀

		Animal snake = new Animal() {
			int length;

			@Override
			public void act() {
				setName("아나콘다");
				setColor("녹색");
				length = 30;
				System.out.println("act :기어다니기.");
				super.act();
			}

			@Override
			public String toString() {
				return "length= " + length;
			}
		};
		snake.act();
		System.out.println(snake);
	}

}
