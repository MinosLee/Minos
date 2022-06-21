package koreait.day03;

//작성자: 이민호
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1;
		System.out.println("숫자 1 입력:");
		n1 = sc.nextInt();

		int n2;
		System.out.println("숫자 2 입력:");
		n2 = sc.nextInt();

		int n3;
		System.out.println("숫자 3 입력:");
		n3 = sc.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(n1 + "값이 높습니다");
			} else
				System.out.println(n3 + "값이 높습니다");
		}

		else {
			if (n2 > n3) {
				System.out.println(n2 + "값이 높습니다");
			} else
				System.out.println(n3 + "값이 높습니다");

		}
		sc.close();

	}
}