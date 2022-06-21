package koreait.day12;

import java.util.ArrayList;

import java.util.Scanner;

import koreait.day12.MathProblem;

//작성자 이민호
public class C48_MathhList {
//C43_ 예제 리스트로 바꾸기.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 5;
		// MathProblem[] problems = new MathProblem[];
		ArrayList<MathProblem> problems = new ArrayList<>();

		int ans;
		int cnt = 0;

		System.out.println("-------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------------");
		System.out.println("시작합니다");

		for (int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			problems.add(temp);
			temp.makeProb();

			// System.out.print("\n문제 " + (i + 1) + ". " + temp.getN1() + "+" + temp.getN2()
			// + "= 답 입력 ->");
			System.out.print("문제 " + (i + 1) + ". " + temp.problem() + " 답 입력 ->");

			ans = sc.nextInt();

			if (ans == temp.showAnswer()) { // 맞은 갯수 카운트
				cnt++;
				temp.setCorrect(true);
			}

		}
		System.out.println("채점합니다 맞은 갯수" + (cnt) + "(" + (cnt * 100 / size) + "점)");
		System.out.println(":::::틀린 문제 정답 보기:::::");
		// problem 배열을 활용하고 isCorrect필드를 설정

		for (int i = 0; i < problems.size(); i++)
			if (!problems.get(i).isCorrect())
				System.out.println("문제 " + (i + 1) + ". " + problems.get(i).problem() + problems.get(i).showAnswer());

//		for(MathProblem temp : problems)
//		if(!temp.isCorrect())
//			System.out.println(temp.problem() + temp.showAnswer());

		sc.close();

	}

}
