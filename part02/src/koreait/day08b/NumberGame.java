package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random r = new Random(); // ��������
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int[] triallst = new int[max];

		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println("�� �޸��� ���纸����. (101~299)");
		int numComputer = r.nextInt(199) + 101; // ��ǻ�� 101~299�� ���� ���� ���� �߻�
		int numHuman;
		int i = 0; // 10ȸ�� ������ȸ

		do { // while���� ������ ������ �� �� ���� ����
			System.out.println("������ ���� �Է�(��ȸ : " + (max - i) + ") -> ");
			numHuman = sc.nextInt(); // ���� �Է�
			if (numComputer > numHuman) { // ��ǻ�ͼ��ڰ� ������ں��� Ŭ ���
				triallst[i] = numHuman; // �Է¼��� triallst �迭 �ȿ� ����
				i++;
				System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
			}
			if (i == max)
				break; // ������ȸ 10ȸ�� �Ǹ� ��������.
		} while (numComputer != numHuman);

		if (i == max) {
			System.out.println(" �� �޸� �Է³��� :" + Arrays.toString(triallst));
			System.out.println(" �־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽý����ϼ���! ����[" + numComputer + "]�Դϴ�");
		} else {
			System.out.println("������~ ���߼̽��ϴ� �������� �õ�Ƚ�� :" + (i + 1));
		}
		sc.close();
	}

}
