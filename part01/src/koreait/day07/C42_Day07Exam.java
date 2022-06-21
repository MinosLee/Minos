package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
//작성자: 이민호
	public static void main(String[] args) {

		/*
		 * 1. 덧셈 문제는 두자리 덧셈입니다. 
		 * 2. 문제는 난수로 만듭니다. 
		 * 3. 테스트할때는 문제를 5개로 줄여서 하세요. 
		 * 4. 클래스 활용아니고 int 형 배열로만 하세요. 
		 * 5. 첫번째 피연산자 배열 두번째 피연산자 배열 사용자 입력 정답저장 배열 모든문제 10개를 저장? or 틀린문제만 저장?
		 */

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("-------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------------");
		System.out.println("시작합니다");

		int[] exam1 = new int[5];
		int[] exam2 = new int[5];
		int[] typ = new int[5];
		int score = 0;

		for (int i = 0; i < exam1.length; i++) {
			exam1[i] = r.nextInt(89) + 11;
			exam2[i] = r.nextInt(89) + 11;

			System.out.print("\n문제 " + (i + 1) + ". " + exam1[i] + "+" + exam2[i] + "= 답 입력 ->");
			typ[i] = sc.nextInt();
		}

		for (int i = 0; i < exam1.length; i++) {
			int sum = exam1[i] + exam2[i];
			if (typ[i] == sum)
				score++;
		}
		System.out.println("채점합니다 맞은 갯수" + score + "(" + score * 10 + "점)");
		System.out.println(":::::틀린 문제 정답 보기:::::");

		for (int i = 0; i < exam1.length; i++) {
			int sum = exam1[i] + exam2[i];
			if (typ[i] != sum) {
				System.out.println("\n문제 " + (i + 1) + ". " + exam1[i] + "+" + exam2[i] + "=" + sum);
			}

		}
		sc.close();
	}
}
