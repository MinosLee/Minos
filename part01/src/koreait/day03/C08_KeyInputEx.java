package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputEx {
//�ۼ��� : �̹�ȣ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n[[�簢�� ������ ���� ���ϱ�]]\n");

		int width;
		System.out.print("�ʺ� �Է��ϼ��� ->"); // �Է¸޼���
		width = sc.nextInt();

		int heigth;
		System.out.print("���̸� �Է��ϼ��� ->"); // �Է¸޼���
		heigth = sc.nextInt();

		int box_area = width * heigth;

		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + heigth + "��");
		System.out.println("���̸� ���߽��ϴ� : " + box_area + "��");

		System.out.println("\n[[�� ������ ���̿� �ѷ� ���ϱ�]]\n");

		double radius;
		System.out.print("�������� �Է��ϼ��� ->"); // �Է¸޼���
		radius = sc.nextDouble();

		final double pi = 3.14;
		double round = 2 * pi * radius;
		double circle_area = pi * radius * radius;

		System.out.printf("������ : %.3f �� \n", radius);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f �� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f �� \n", circle_area);

		sc.close(); // Ű����(ǥ���Է���ġ) �ڿ���� ����
	}

}
