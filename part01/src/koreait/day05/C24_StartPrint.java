package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("[[영화감상후기]]");

		System.out.print("평점을 몇점 주시겠습니까 1~5 >>>");

		int count = sc.nextInt();
		System.out.println("방법 1");
		for (int i = 0; i < count; i++)
			System.out.print("★");

		System.out.println("\n\n방법 2");
		for (int i = 0; i < count; i++)
			System.out.print("★");
		for (int i = 0; i < 5 - count; i++)
			System.out.print("☆");

		System.out.println("\n\n방법 3");
		for (int i = 0; i < 5; i++)
			if (i < count)
				System.out.print("★");
			else
				System.out.print("☆");

		System.out.println("\n\n방법 4");
		int k; // loop counter변수가 main 메소드의 지역변수
		for (k = 0; k < count; k++) // count= 3
			System.out.print("★");

		System.out.println("k=" + k);// 위에서 k는 3으로 끝났기에 k=3
		for (; k < 5; k++) // k의 값은 3부터 시작하게 됨.k는 count부터 시작하는 효과
			System.out.print("☆");

	}

}
