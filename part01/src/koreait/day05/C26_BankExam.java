package koreait.day05;

import java.util.Scanner;

/*
 * GUI graphic User Interface (사용자 명령을 아이콘, 메뉴방식으로 처리)
 * CLI command Line Interface (사용자명령을 텍스트로만 처리)
 */

public class C26_BankExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sel;
		int balance = 0;

		while (run) {
			int money;
			System.out.println("--------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 확인 | 4. 종료 ");
			System.out.println("--------------------------");
			System.out.print("메뉴 선택 >>>");
			sel = sc.nextInt();

			switch (sel) {
			case 1: // 예금처리(예금금액입력-> 잔액에 더하기
				System.out.print("예금액 >");
				money = sc.nextInt();
				balance += money;
				System.out.println("고객님의 잔액은" + balance + "원 입니다");
				break;

			case 2: // 출금 처리(출금 금액 입력 -> 잔액보다 많지 않을 때 처리(잔액에서 처리))
				System.out.println("출금액 >");
				money = sc.nextInt();

				if (money > balance)
					System.out.println("잔액이 부족합니다");

				else {
					balance -= money;
					System.out.println("고객님의 잔액은" + balance + "원 입니다");
				}

				break;

			case 3: // 잔고 (balance) 출력
				System.out.print("현재 잔고" + balance);
				System.out.println();// 줄바꿈
				break;

			case 4: // 반복 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default: // 1 2 3 4 외 나머지 값일 때
				System.out.println("잘못된 선택입니다. 값은 1~4 만 입력하세요.");

			}

		}

	}

}
