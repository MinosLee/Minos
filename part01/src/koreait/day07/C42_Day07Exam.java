package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
//�ۼ���: �̹�ȣ
	public static void main(String[] args) {

		/*
		 * 1. ���� ������ ���ڸ� �����Դϴ�. 
		 * 2. ������ ������ ����ϴ�. 
		 * 3. �׽�Ʈ�Ҷ��� ������ 5���� �ٿ��� �ϼ���. 
		 * 4. Ŭ���� Ȱ��ƴϰ� int �� �迭�θ� �ϼ���. 
		 * 5. ù��° �ǿ����� �迭 �ι�° �ǿ����� �迭 ����� �Է� �������� �迭 ��繮�� 10���� ����? or Ʋ�������� ����?
		 */

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("-------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-------------------------------");
		System.out.println("�����մϴ�");

		int[] exam1 = new int[5];
		int[] exam2 = new int[5];
		int[] typ = new int[5];
		int score = 0;

		for (int i = 0; i < exam1.length; i++) {
			exam1[i] = r.nextInt(89) + 11;
			exam2[i] = r.nextInt(89) + 11;

			System.out.print("\n���� " + (i + 1) + ". " + exam1[i] + "+" + exam2[i] + "= �� �Է� ->");
			typ[i] = sc.nextInt();
		}

		for (int i = 0; i < exam1.length; i++) {
			int sum = exam1[i] + exam2[i];
			if (typ[i] == sum)
				score++;
		}
		System.out.println("ä���մϴ� ���� ����" + score + "(" + score * 10 + "��)");
		System.out.println(":::::Ʋ�� ���� ���� ����:::::");

		for (int i = 0; i < exam1.length; i++) {
			int sum = exam1[i] + exam2[i];
			if (typ[i] != sum) {
				System.out.println("\n���� " + (i + 1) + ". " + exam1[i] + "+" + exam2[i] + "=" + sum);
			}

		}
		sc.close();
	}
}
