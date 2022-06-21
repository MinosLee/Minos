package koreait.day12;

import java.util.ArrayList;

import java.util.Scanner;

import koreait.day12.MathProblem;

//�ۼ��� �̹�ȣ
public class C48_MathhList {
//C43_ ���� ����Ʈ�� �ٲٱ�.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 5;
		// MathProblem[] problems = new MathProblem[];
		ArrayList<MathProblem> problems = new ArrayList<>();

		int ans;
		int cnt = 0;

		System.out.println("-------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-------------------------------");
		System.out.println("�����մϴ�");

		for (int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			problems.add(temp);
			temp.makeProb();

			// System.out.print("\n���� " + (i + 1) + ". " + temp.getN1() + "+" + temp.getN2()
			// + "= �� �Է� ->");
			System.out.print("���� " + (i + 1) + ". " + temp.problem() + " �� �Է� ->");

			ans = sc.nextInt();

			if (ans == temp.showAnswer()) { // ���� ���� ī��Ʈ
				cnt++;
				temp.setCorrect(true);
			}

		}
		System.out.println("ä���մϴ� ���� ����" + (cnt) + "(" + (cnt * 100 / size) + "��)");
		System.out.println(":::::Ʋ�� ���� ���� ����:::::");
		// problem �迭�� Ȱ���ϰ� isCorrect�ʵ带 ����

		for (int i = 0; i < problems.size(); i++)
			if (!problems.get(i).isCorrect())
				System.out.println("���� " + (i + 1) + ". " + problems.get(i).problem() + problems.get(i).showAnswer());

//		for(MathProblem temp : problems)
//		if(!temp.isCorrect())
//			System.out.println(temp.problem() + temp.showAnswer());

		sc.close();

	}

}
