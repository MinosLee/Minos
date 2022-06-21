package koreait.day05;

import java.util.Scanner;

//작성자 : 이민호
public class C28_IntArrayEx {
	/*
	 * 1. int 배열 크기 5 선언. 이름은 nums
	 * 2. 배열요소의 값은 사용자 입력으로 저장
	 * 3. 입력된 값의 합계, 평균을 구함-> 합계는 2번에서 입력받는 for 문 안에서 수식작성
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듦 ㄴ maxOfArray, minOfArray : 인자는 int배열, 반환값형식은 int
	 */

	// max, min 변수를 배열의 0번 요소값으로 초기화.
	// 배열요소 1번부터 마지막요소까지 max, min과 순서대로 비교해서
	// max가 그 값보다 작으면(min이 그 값보다 크면 ) max(min) 값을 배열요소값으로 변경합니다.
	// -> 비교가 끝나면 최종 max min이 결정됩니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int[] nums = new int[5];
		int ex = nums.length;

		for (int i = 0; i < ex; i++) {
			System.out.print("배열요소 값을 입력하세요 ");
			nums[i] = sc.nextInt();

			sum += nums[i];
			System.out.println("합계는= " + sum);
		}

		System.out.println("평균값은 =" + (float) (sum / ex));

		int max = maxOfArray(nums);

		System.out.println("최대값은 " + max + "입니다");

		int min = minOfArray(nums);
		System.out.println("최대값은 " + min + "입니다");

		sc.close();
	}

	public static int maxOfArray(int[] array) {

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) // 비교값이 max보다 큼.
				max = array[i];
		}
		return max;
	}

	public static int minOfArray(int[] array) {
		int min = array[0];

		for (int i = 1; i < array.length; i++)
			if (min > array[i])
				min = array[i];

		return min;
	}

}
