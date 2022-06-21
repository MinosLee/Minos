package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputEx {
//작성자 : 이민호
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n[[사각형 도형의 넓이 구하기]]\n");

		int width;
		System.out.print("너비를 입력하세요 ->"); // 입력메세지
		width = sc.nextInt();

		int heigth;
		System.out.print("높이를 입력하세요 ->"); // 입력메세지
		heigth = sc.nextInt();

		int box_area = width * heigth;

		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + heigth + "㎝");
		System.out.println("넓이를 구했습니다 : " + box_area + "㎠");

		System.out.println("\n[[원 도형의 넓이와 둘레 구하기]]\n");

		double radius;
		System.out.print("반지름을 입력하세요 ->"); // 입력메세지
		radius = sc.nextDouble();

		final double pi = 3.14;
		double round = 2 * pi * radius;
		double circle_area = pi * radius * radius;

		System.out.printf("반지름 : %.3f ㎝ \n", radius);
		System.out.printf("둘레를 구했습니다 : %.3f ㎝ \n", round);
		System.out.printf("넓이를 구했습니다 : %.3f ㎠ \n", circle_area);

		sc.close(); // 키보드(표준입력장치) 자원사용 해제
	}

}
