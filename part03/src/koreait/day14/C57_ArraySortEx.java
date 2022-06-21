package koreait.day14;

import java.util.Arrays;

//작성자 : 이민호
public class C57_ArraySortEx {

	// 배열에 저장된 값 정렬하기
	public static void main(String[] args) {
		// for문 안에 for문으로 비교 지정.

		int[] nums = { 34, 77, 19, 56, 45, 9 };
		int temp = 0;
		System.out.println(Arrays.toString(nums));// 배열 확인

		for (int i = 0; i <= nums.length - 2; i++) {
			for (int k = (i + 1); k <= (nums.length - 1); k++) {
				if (nums[i] > nums[k]) {
					temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
					System.out.println(Arrays.toString(nums));// 과정확인
				}

			}

		}
		System.out.println(Arrays.toString(nums));// 결과확인
	}

}
