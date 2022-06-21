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

		System.out.println("시작합니다.");

		int[] firstValue = new int[5];
		int[] secondValue = new int[5];
		int[] userInput = new int[5];

		int score = 0;
		int[] wrongAnswer = new int[5];

		for (int i = 0; i < firstValue.length; i++) {
			firstValue[i] = r.nextInt(89) + 11;
			secondValue[i] = r.nextInt(89) + 11;

			System.out.print("\n문제 " + (i + 1) + "." + firstValue[i] + "+" + secondValue[i] + "답 입력:");
			userInput[i] = sc.nextInt();

			if (userInput[i] != (firstValue[i] + secondValue[i])) {
				wrongAnswer[i] = 1;
			} else {
				wrongAnswer[i] = -1;
				score++;
			}
		}

		System.out.println("점수:" + score);

		for (int i = 0; i < firstValue.length; i++)
			if (wrongAnswer[i] != -1)
				System.out.println(firstValue[i] + "+" + secondValue[i] + "=" + firstValue[i] + secondValue[i]);

	}
}
