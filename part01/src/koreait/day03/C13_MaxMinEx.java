package koreait.day03;

//�ۼ���: �̹�ȣ
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1;
		System.out.println("���� 1 �Է�:");
		n1 = sc.nextInt();

		int n2;
		System.out.println("���� 2 �Է�:");
		n2 = sc.nextInt();

		int n3;
		System.out.println("���� 3 �Է�:");
		n3 = sc.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(n1 + "���� �����ϴ�");
			} else
				System.out.println(n3 + "���� �����ϴ�");
		}

		else {
			if (n2 > n3) {
				System.out.println(n2 + "���� �����ϴ�");
			} else
				System.out.println(n3 + "���� �����ϴ�");

		}
		sc.close();

	}
}