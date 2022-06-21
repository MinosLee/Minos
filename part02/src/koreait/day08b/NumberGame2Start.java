package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Start {

	public static void main(String[] args) {
		Random r = new Random(); // 랜덤난수
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10]; // 최대 10개 기록 저장
		int k = 0; // history배열의 인덱스 변수

		System.out.println("숫자 맞추기 게임 시작합니다.");
		System.out.print("게임을 시작하려면 너 휴먼의 이름을 쓰시오 >>>");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;

		do {
			GameValue temp = new GameValue(gamer);

			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			System.out.println(String.format("너 휴먼은 맞춰보세요. (범위 %d~%d)", rmin, rmax));
			int numComputer = GameValue.makeNumber(rmin, rmax); // 컴퓨터 101~299의 숫자 랜덤 난수 발생
			int numHuman;
			int i = 0; // 10회의 도전기회

			do { // while문의 조건이 거짓이 될 때 까지 실행
				System.out.println("생각한 숫자 입력(기회 : " + (max - i) + ") -> ");
				numHuman = sc.nextInt(); // 숫자 입력
				if (numComputer > numHuman) { // 컴퓨터숫자가 사람숫자보다 클 경우
					triallst[i] = numHuman; // 입력숫자 triallst 배열 안에 저장
					i++;
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (numComputer < numHuman) {
					triallst[i] = numHuman;
					i++;
					System.out.println("아닙니다. 더 작은 값입니다.");
				}
				if (i == max)
					break; // 도전기회 10회가 되면 빠져나감.
			} while (numComputer != numHuman);

			if (i == max) {
				System.out.println(" 너 휴먼 입력내용 :" + Arrays.toString(triallst));
				System.out.println(" 주어진 기회를 다 쓰셨습니다. 게임을 다시시작하세요! 답은[" + numComputer + "]입니다");
				temp.setCount(max);
			} else {
				System.out.println("딩동댕~ 맞추셨습니다 성공까지 시도횟수 :" + (i + 1));
				temp.setCount(i + 1);
				temp.setSuccess(true);
			}

			// 위의 게임결과를 history배열에 저장

			history[k] = temp;
			k++; // 다음인덱스값의 역할과 카운트역할을 동시에함. 게임 한 횟수

			System.out.println("게임을 계속하시겠습니까? 계속하려면 0입력 >>>");
		} while (sc.nextInt() == 0);

		System.out.println(":::::게임스코어:::::");
		// for 반복으로 history 배열에 저장된 값 출력
		for (int j = 0; j < k; j++)
			history[j].print();// history[j]의 타입은 GameValue

		System.out.println(":::::The End:::::");

		sc.close();
	}

}
