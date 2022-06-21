package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {

		// 비교
		for (int i = 0; i < 5; i++)
			System.out.println("Hello(" + (i + 1) + ")");

		// while문 형식 -반드시 중괄호 필요함. 조건식과 증감식이 모두 필요하기 때문
		// loop counter 변수는 while문 밖에서 선언해야 함.
		int j = 0;
		while (j < 5) {// 조건식
			System.out.println("Hello(" + (j + 1) + ")");

			j++;// 증감식
		}

		// 예시: for 문은 1부터 100까지 더하는 연속적인 값을 대상으로 할 때 적합함.
		// while문은 아직 정해지지 않은 값을 대상으로 할 때 적합함.
		// 반복문과 함께 사용하는 명령문- break, continue(continue뒤에 있는 명렁을 실행하지 않고 반복명령 처음으로 돌아감.
		int k = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 숫자를 모두 더하는 계산기(종료 :-1");
		while (k != -1) { // k가 -1이 아닌 동안 실행
			System.out.println("정수 입력>>>");
			k = sc.nextInt();
			sum += k; // sum=sum+k

		}
		System.out.println("sum=" + sum);

		sum = 0;
		k = 0;
		System.out.println("\n\n 입력한 정수를 모두 더하는 계산기입니다.[ver.2.0](종료:-1)");
		do {
			sum += k;
			System.out.print("정수입력>>>");
			k = sc.nextInt();
		} while (k != -1);
		System.out.println("sum=" + sum);

		sum = 0;
		System.out.println("\n\n 입력한 정수를 모두 더하는 계산기입니다.[ver.2.1](종료:-1)");
		while (true) {
			if (k == -1)
				break; // 항상 참일 때 , 탈출(종료) 조건과 break문 사용.

			sum += k;

		}
		System.out.println("sum=" + sum);

		sum = 0;
		System.out.println("\n\n 입력한 정수를 모두 더하는 계산기입니다.[ver.2.2](종료:-1)");
		boolean isState = true;
		while (isState) {
			System.out.print("정수입력 >>>");
			k = sc.nextInt();
			if (k == -1)
				isState = false;
			else
				sum += k;
		}
		System.out.println("sum=" + sum);

		// continue연습 : 입력된 값이 10의 배수이면 sum 에 더하지 않고 다시 입력받기
		sum = 0;
		while (true) {
			System.out.print("정수입력 >>>");
			k = sc.nextInt();
			if (k == -1)
				break;
			if (k % 10 == 0)
				continue; // 아래 명령어들은 실행하지 않고 다시 처음으로
			sum += k;
		}
		System.out.println("sum=" + sum);

		sc.close();

	}

}
