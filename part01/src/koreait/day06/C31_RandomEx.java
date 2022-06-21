package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서를 만듦 학생인원 100명- 점수는 랜덤값으로 테스트 (0<= 난수<= 100) 90~100점은 :0명(소숫점
		 * 1자리%) 카운트변수 5개가 필요함. 80~89점은 :0명(소숫점 1자리%) ㄴ counts[5] : counts[0]은 90~100
		 * 이런식으로 저장할 것 70~79점은 :0명(소숫점 1자리%) 60~69점은 :0명(소숫점 1자리%) 60점 밑은 :0명(소숫점 1자리%)
		 */

		int[] koreans = new int[100];
		int[] counts = new int[5];

		Random r = new Random();

		for (int i = 0; i < koreans.length; i++) {
			koreans[i] = r.nextInt(101);

			if (90 <= koreans[i])
				counts[0]++;

			else if (80 <= koreans[i])
				counts[1]++;

			else if (70 <= koreans[i])
				counts[2]++;

			else if (60 <= koreans[i])
				counts[3]++;

			else
				counts[4]++;

		}

		System.out.println(Arrays.toString(koreans));

		// 점수분포 결과 출력
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
		System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60미만");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < counts.length; i++) {
			// counts 배열값 출력
			System.out.printf("%8d ", counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++)
			// counts 배열값으로 백분율 구하고 출력
			System.out.printf("%8.1f%%", (double) counts[i] / koreans.length * 100);

	}

}

//배열에서 기능이 향상(데이터 삭제, 추가)된 것이 자바 ArrayList
//배열에선 직접 데이터 추가, 삭제를 구현함.-> 메소드 정의 
