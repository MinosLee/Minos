package koreait.day09;

import java.util.Random;
import java.util.Scanner;

//c42 번을 MathProblem 클래스를 사용하는 것으로 바꾸기(연산은 덧셈)
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int size = 5;
		int max_size = MathProblem.max_size; // size 변수값이 max_size를 초과하는지 검사 추가.

		MathProblem[] problems = new MathProblem[size];
		// 모든 문제 저장

		// 배열타입은 MathProblem 객체참조형 : n1, n2, op, isCorrect
		int ans;
		int cnt = 0;

		System.out.println("-------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------------");
		System.out.println("시작합니다");

		for (int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();

			// System.out.print("\n문제 " + (i + 1) + ". " + temp.getN1() + "+" + temp.getN2()
			// + "= 답 입력 ->");
			System.out.print("문제 " + (i + 1) + ". " + temp.problem() + " 답 입력 ->");

			ans = sc.nextInt();

			if (ans == temp.showAnswer()) { // 맞은 갯수 카운트
				cnt++;
				temp.setCorrect(true);
			}
			problems[i] = temp;

		}
		System.out.println("채점합니다 맞은 갯수" + (cnt) + "(" + (cnt * 100 / size) + "점)");
		System.out.println(":::::틀린 문제 정답 보기:::::");
		// problem 배열을 활용하고 isCorrect필드를 설정

		/*
		 * for (int i = 0; i < problems.length; i++) if (!problems[i].isCorrect())
		 * System.out.println("문제 " + (i + 1) + ". " + problems[i].problem() +
		 * problems[i].showAnswer());
		 * 
		 */
		for (MathProblem temp : problems)
			if (!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());

		sc.close();

	}

}
