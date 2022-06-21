package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_ExamExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");

		System.out.println("�����մϴ�.");

		int[] firstValue = new int[5];
		int[] secondValue = new int[5];
		int[] userInput = new int[5];

		int score = 0;
		int[] wrongAnswer = new int[5];

		for (int i = 0; i < firstValue.length; i++) {
			firstValue[i] = r.nextInt(89) + 11;
			secondValue[i] = r.nextInt(89) + 11;

			System.out.print("\n���� " + (i + 1) + "." + firstValue[i] + "+" + secondValue[i] + "�� �Է�:");
			userInput[i] = sc.nextInt();

			if (userInput[i] != (firstValue[i] + secondValue[i])) {
				wrongAnswer[i] = 1;
			} else {
				wrongAnswer[i] = -1;
				score++;
			}
		}

		System.out.println("����:" + score);

		for (int i = 0; i < firstValue.length; i++)
			if (wrongAnswer[i] != -1)
				System.out.println(firstValue[i] + "+" + secondValue[i] + "=" + firstValue[i] + secondValue[i]);

	}
}
