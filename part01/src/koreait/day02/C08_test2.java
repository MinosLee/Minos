package koreait.day02;

public class C08_test2 {
//작성자 : 이민호
	public static void main(String[] args) {

		System.out.println("\n[[사각형 도형의 넓이 구하기]]\n");

		int width = 23;
		int heigth = 19;
		int box_area = width * heigth;

		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + heigth + "㎝");
		System.out.println("넓이를 구했습니다 : " + box_area + "㎠");

		System.out.println("\n[[원 도형의 넓이와 둘레 구하기]]\n");
		double radius = 23.230;
		final double pi = 3.14;
		double round = 2 + pi * radius;
		double circle_area = pi * radius * radius;

		System.out.printf("반지름 : %.3f ㎝ \n", radius);
		System.out.printf("둘레를 구했습니다 : %.3f ㎝ \n", round);
		System.out.printf("넓이를 구했습니다 : %.3f ㎠ \n", circle_area);

		// final test
		// 변수 선언 앞에 final 키워드를 붙이면 값을 변경하지 못함.

		final int test = 123; // test를 변경하지 못하게 함. 값을 변경 못하는 상수임.
		System.out.println("test=" + test);
	}

}
