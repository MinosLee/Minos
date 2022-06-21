package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		// if(조건식) { .. } else if(조건식) {...} else if(조건식) {...} else if(조건식) {...} ~else

		/*
		 * 마켓컬리 이벤트 오늘 구입한 금액이 10만원 이상이면 적립금을 구매 금액의 10%를 줌. 10만원보단 적지만 7만원 이상이면 9% 4만원
		 * 이상이면 7%줌 그 이하는 3%
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int money; // 적립금: %적용하면 결과값은 실수가 될 것-> 정수로 바꿔서 저장할 것
		int pay;// 구매금액
		double rate; // 적립율

		System.out.print("구매금액은 >>>");
		pay = sc.nextInt();

		if (pay >= 100000)
			rate = 0.1;
		else if (pay >= 70000)
			rate = 0.09;
		else if (pay >= 40000)
			rate = 0.07;
		else
			rate = 0.03;

		money = (int) (pay * rate);

		System.out.printf("고객님! 오늘 구매하신 금액의 적립금 %d 입니다\n ", money);
		System.out.printf("이벤트기간 적립율 %d %% 적용되었습니다 ", (int) (rate * 100));

		sc.close();
	}

}
