package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");

		String best; // 특기과목명 저장할 변수
		int korean;
		int english;
		int science;
		int all;
		double aver;
		int total;

		System.out.print("국어->");
		korean = sc.nextInt();
		System.out.print("영어->");
		english = sc.nextInt();
		System.out.print("과학->");
		science = sc.nextInt();

		all = 3;
		total = korean + english + science;
		aver = (korean + english + science) / 3;

		System.out.println("\n>>처리되었습니다.");
		System.out.println("총점 :" + total);
		System.out.printf("평균 : %.2f , 과목 수 : %d", aver, all);

		if (korean > english) {
			best = "국어";
			if (korean < science)
				best = "과학";
		}

		else
			best = "영어";
		{

			if (english < science)
				best = "과학";
		}

		System.out.printf("이 학생의 특기과목은 . %s . 입니다.", best);

		sc.close();

	}

}
