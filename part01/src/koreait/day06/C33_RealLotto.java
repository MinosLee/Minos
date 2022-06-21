package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//�ۼ���: �̹�ȣ
	public static void main(String[] args) {
		int[] numbers = new int[45]; // �ζ� ��ȣ �� 45�� =�迭 45�� ����
		Random r = new Random(); // random����

		for (int i = 0; i < 45; i++) { // �ε����� 0~44
			numbers[i] = i + 1; // ������ 1~45
		}

		System.out.println("numbers �迭 �ʱⰪ -------------------------------");
		System.out.println(Arrays.toString(numbers)); // ���� 1~45 ����ȭ
		System.out.println("------------------------------------------------");

		int[] lotto = new int[6]; // lotto��ȣ 6�� ���� ����
		int k; // �ε��� �ѹ�
		for (int cnt = 0; cnt < 6; cnt++) {// 6���� ��ȣ�� ���� ��
			k = r.nextInt(45 - cnt); // cnt 0,1,2,3,4,5�� ���� ������ bound���� 45,44,43,42,41,40 �ߺ�����(Ȯ������ ���� ���̱�)
			// k�� ���������� bound ����.
			System.out.println("k=" + k + ",number=" + numbers[k]); // �ε����ѹ�k�� ���� �ѹ� number[k] ����ȭ

			lotto[cnt] = numbers[k]; // lotto�� 0~5������ �迭��Ҵ� numbers[k]�� ��.

			// k��ġ�� ���� ����(����)- �ε��� k+1���� ��������ұ��� �������� �̵�
			for (int i = k; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1];// ��ȣ �ϳ��� ���������� ��ȣ�� �����ϰ� �� �޹�ȣ �迭�� �ϳ��� ������ ���

			}
			System.out.println(Arrays.toString(numbers)); // �迭 ����ȭ

		}
		System.out.println("���� ���� ����: ");
		System.out.println(Arrays.toString(lotto)); // ���� ��ȣ ����ȭ

		Arrays.sort(lotto); // lotto �迭���� ũ�� ������� ��ġ����
		System.out.println(Arrays.toString(lotto));// ���ĵ� ��ȣ ����ȭ

	}

}
