package koreait.day05;

import java.util.Scanner;

//�ۼ��� : �̹�ȣ
public class C28_IntArrayEx {
	/*
	 * 1. int �迭 ũ�� 5 ����. �̸��� nums
	 * 2. �迭����� ���� ����� �Է����� ����
	 * 3. �Էµ� ���� �հ�, ����� ����-> �հ�� 2������ �Է¹޴� for �� �ȿ��� �����ۼ�
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ���� �� maxOfArray, minOfArray : ���ڴ� int�迭, ��ȯ�������� int
	 */

	// max, min ������ �迭�� 0�� ��Ұ����� �ʱ�ȭ.
	// �迭��� 1������ ��������ұ��� max, min�� ������� ���ؼ�
	// max�� �� ������ ������(min�� �� ������ ũ�� ) max(min) ���� �迭��Ұ����� �����մϴ�.
	// -> �񱳰� ������ ���� max min�� �����˴ϴ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int[] nums = new int[5];
		int ex = nums.length;

		for (int i = 0; i < ex; i++) {
			System.out.print("�迭��� ���� �Է��ϼ��� ");
			nums[i] = sc.nextInt();

			sum += nums[i];
			System.out.println("�հ��= " + sum);
		}

		System.out.println("��հ��� =" + (float) (sum / ex));

		int max = maxOfArray(nums);

		System.out.println("�ִ밪�� " + max + "�Դϴ�");

		int min = minOfArray(nums);
		System.out.println("�ִ밪�� " + min + "�Դϴ�");

		sc.close();
	}

	public static int maxOfArray(int[] array) {

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) // �񱳰��� max���� ŭ.
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
