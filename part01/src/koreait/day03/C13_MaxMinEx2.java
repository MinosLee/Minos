package koreait.day03;

//작성자: 이민호
import java.util.Scanner;

public class C13_MaxMinEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;
		int max;
		int min;

		System.out.print("n1>>> ");
		n1 = sc.nextInt();

		System.out.print("n2>>> ");
		n2 = sc.nextInt();

		System.out.print("n3>>> ");
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n", n1, n2, n3);

		if (n1 > n2) {
			max = n1;
			min = n2;
		}

		else {
			max = n2;
			min = n1;
		}

		if (max < n3)
			max = n3;
		if (min > n3)
			min = n3;

		System.out.println("max=" + max + " , min=" + min);

		sc.close();
	}
}