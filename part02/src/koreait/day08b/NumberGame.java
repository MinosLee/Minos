package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random r = new Random(); // 랜덤난수
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int[] triallst = new int[max];

		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너 휴먼은 맞춰보세요. (101~299)");
		int numComputer = r.nextInt(199) + 101; // 컴퓨터 101~299의 숫자 랜덤 난수 발생
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
		} else {
			System.out.println("딩동댕~ 맞추셨습니다 성공까지 시도횟수 :" + (i + 1));
		}
		sc.close();
	}

}
