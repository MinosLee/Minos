package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자: 이민호
	public static void main(String[] args) {
		int[] numbers = new int[45]; // 로또 번호 총 45개 =배열 45개 생성
		Random r = new Random(); // random생성

		for (int i = 0; i < 45; i++) { // 인덱스는 0~44
			numbers[i] = i + 1; // 범위는 1~45
		}

		System.out.println("numbers 배열 초기값 -------------------------------");
		System.out.println(Arrays.toString(numbers)); // 범위 1~45 가시화
		System.out.println("------------------------------------------------");

		int[] lotto = new int[6]; // lotto번호 6개 추출 예정
		int k; // 인덱스 넘버
		for (int cnt = 0; cnt < 6; cnt++) {// 6개의 번호를 뽑을 것
			k = r.nextInt(45 - cnt); // cnt 0,1,2,3,4,5에 대해 난수의 bound값은 45,44,43,42,41,40 중복방지(확률적인 범위 줄이기)
			// k의 난수범위는 bound 제외.
			System.out.println("k=" + k + ",number=" + numbers[k]); // 인덱스넘버k와 실제 넘버 number[k] 가시화

			lotto[cnt] = numbers[k]; // lotto의 0~5까지의 배열요소는 numbers[k]로 함.

			// k위치의 값을 제거(삭제)- 인덱스 k+1부터 마지막요소까지 왼쪽으로 이동
			for (int i = k; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1];// 번호 하나가 뽑힐때마다 번호를 삭제하고 그 뒷번호 배열을 하나씩 앞으로 당김

			}
			System.out.println(Arrays.toString(numbers)); // 배열 가시화

		}
		System.out.println("최종 선택 숫자: ");
		System.out.println(Arrays.toString(lotto)); // 뽑힌 번호 가시화

		Arrays.sort(lotto); // lotto 배열값의 크기 순서대로 위치변경
		System.out.println(Arrays.toString(lotto));// 정렬된 번호 가시화

	}

}
