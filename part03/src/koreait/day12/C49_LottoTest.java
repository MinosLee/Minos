package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random(); // random생성

		for (int i = 0; i < 45; i++) { // 인덱스는 0~44
			numbers.add(i + 1); // 범위는 1~45
		}

		System.out.println("numbers 배열 초기값 -------------------------------");
		System.out.println(numbers); // 범위 1~45 가시화
		System.out.println("------------------------------------------------");

		ArrayList<Integer> lotto = new ArrayList<>();
		int k; // 인덱스 넘버

		for (int cnt = 0; cnt < 6; cnt++) {// 6개의 번호를 뽑을 것
			k = r.nextInt(45 - cnt); // cnt 0,1,2,3,4,5에 대해 난수의 bound값은 45,44,43,42,41,40 중복방지(확률적인 범위 줄이기)
			// k의 난수범위는 bound 제외.
			System.out.println("k=" + k + ",number=" + numbers.get(k)); // 인덱스넘버k와 실제 넘버 number[k] 가시화

			lotto.add(numbers.get(k)); // lotto의 0~5까지의 배열요소는 numbers[k]로 함.

			numbers.remove(k);
			System.out.println("남은 공");
			System.out.println(numbers); // 배열 가시화

		}
		System.out.println("최종 선택 숫자: ");
		System.out.println(lotto); // 뽑힌 번호 가시화

//		Arrays.sort(lotto); //lotto 배열값의 크기 순서대로 위치변경
//		System.out.println(lotto);// 정렬된 번호 가시화

	}
//배열은 저장된 값의 위치 변경(삽입/삭제) 메소드가 없음. 배열의 크기는 정적임.
	// 이런 부분을 ArrayList가 해결하고 웹프로그래밍을 할 때 ArrayList가 필수임.

}
