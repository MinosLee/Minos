package koreait.day14;

import java.util.Arrays;

//�ۼ��� : �̹�ȣ
public class C57_ArraySortEx {

	// �迭�� ����� �� �����ϱ�
	public static void main(String[] args) {
		// for�� �ȿ� for������ �� ����.

		int[] nums = { 34, 77, 19, 56, 45, 9 };
		int temp = 0;
		System.out.println(Arrays.toString(nums));// �迭 Ȯ��

		for (int i = 0; i <= nums.length - 2; i++) {
			for (int k = (i + 1); k <= (nums.length - 1); k++) {
				if (nums[i] > nums[k]) {
					temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
					System.out.println(Arrays.toString(nums));// ����Ȯ��
				}

			}

		}
		System.out.println(Arrays.toString(nums));// ���Ȯ��
	}

}
