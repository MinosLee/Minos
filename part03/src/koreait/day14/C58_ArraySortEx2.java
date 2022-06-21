package koreait.day14;

import java.util.Arrays;

//작성자 : 이민호
public class C58_ArraySortEx2 {

	// 배열에 저장된 값 정렬하기
	public static void main(String[] args) {
		// for문 안에 for문으로 비교 지정.

		String[] names = { "제니", "다현", "나연", "신비", "은하", "모모" };
		String temp;
		System.out.println(Arrays.toString(names));// 배열 확인

		for (int i = 0; i <= names.length - 2; i++) {
			for (int k = (i + 1); k <= (names.length - 1); k++) {
				if (names[i].compareTo(names[k]) > 0) {
					temp = names[k];
					names[k] = names[i];
					names[i] = temp;
					System.out.println(Arrays.toString(names));// 과정확인
				}

			}

		}
		System.out.println(Arrays.toString(names));// 결과확인
	}

}
