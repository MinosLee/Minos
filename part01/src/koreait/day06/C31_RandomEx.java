package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ���� ������ ���� �л��ο� 100��- ������ ���������� �׽�Ʈ (0<= ����<= 100) 90~100���� :0��(�Ҽ���
		 * 1�ڸ�%) ī��Ʈ���� 5���� �ʿ���. 80~89���� :0��(�Ҽ��� 1�ڸ�%) �� counts[5] : counts[0]�� 90~100
		 * �̷������� ������ �� 70~79���� :0��(�Ҽ��� 1�ڸ�%) 60~69���� :0��(�Ҽ��� 1�ڸ�%) 60�� ���� :0��(�Ҽ��� 1�ڸ�%)
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

		// �������� ��� ���
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
		System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60�̸�");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < counts.length; i++) {
			// counts �迭�� ���
			System.out.printf("%8d ", counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++)
			// counts �迭������ ����� ���ϰ� ���
			System.out.printf("%8.1f%%", (double) counts[i] / koreans.length * 100);

	}

}

//�迭���� ����� ���(������ ����, �߰�)�� ���� �ڹ� ArrayList
//�迭���� ���� ������ �߰�, ������ ������.-> �޼ҵ� ���� 
