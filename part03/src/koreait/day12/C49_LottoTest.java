package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random(); // random����

		for (int i = 0; i < 45; i++) { // �ε����� 0~44
			numbers.add(i + 1); // ������ 1~45
		}

		System.out.println("numbers �迭 �ʱⰪ -------------------------------");
		System.out.println(numbers); // ���� 1~45 ����ȭ
		System.out.println("------------------------------------------------");

		ArrayList<Integer> lotto = new ArrayList<>();
		int k; // �ε��� �ѹ�

		for (int cnt = 0; cnt < 6; cnt++) {// 6���� ��ȣ�� ���� ��
			k = r.nextInt(45 - cnt); // cnt 0,1,2,3,4,5�� ���� ������ bound���� 45,44,43,42,41,40 �ߺ�����(Ȯ������ ���� ���̱�)
			// k�� ���������� bound ����.
			System.out.println("k=" + k + ",number=" + numbers.get(k)); // �ε����ѹ�k�� ���� �ѹ� number[k] ����ȭ

			lotto.add(numbers.get(k)); // lotto�� 0~5������ �迭��Ҵ� numbers[k]�� ��.

			numbers.remove(k);
			System.out.println("���� ��");
			System.out.println(numbers); // �迭 ����ȭ

		}
		System.out.println("���� ���� ����: ");
		System.out.println(lotto); // ���� ��ȣ ����ȭ

//		Arrays.sort(lotto); //lotto �迭���� ũ�� ������� ��ġ����
//		System.out.println(lotto);// ���ĵ� ��ȣ ����ȭ

	}
//�迭�� ����� ���� ��ġ ����(����/����) �޼ҵ尡 ����. �迭�� ũ��� ������.
	// �̷� �κ��� ArrayList�� �ذ��ϰ� �����α׷����� �� �� ArrayList�� �ʼ���.

}
