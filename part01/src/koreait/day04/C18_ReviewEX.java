package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.println("���� �Է��ϼ���.");

		String best; // Ư������ ������ ����
		int korean;
		int english;
		int science;
		int all;
		double aver;
		int total;

		System.out.print("����->");
		korean = sc.nextInt();
		System.out.print("����->");
		english = sc.nextInt();
		System.out.print("����->");
		science = sc.nextInt();

		all = 3;
		total = korean + english + science;
		aver = (korean + english + science) / 3;

		System.out.println("\n>>ó���Ǿ����ϴ�.");
		System.out.println("���� :" + total);
		System.out.printf("��� : %.2f , ���� �� : %d", aver, all);

		if (korean > english) {
			best = "����";
			if (korean < science)
				best = "����";
		}

		else
			best = "����";
		{

			if (english < science)
				best = "����";
		}

		System.out.printf("�� �л��� Ư������� . %s . �Դϴ�.", best);

		sc.close();

	}

}
