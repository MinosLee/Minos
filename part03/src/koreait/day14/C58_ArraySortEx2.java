package koreait.day14;

import java.util.Arrays;

//�ۼ��� : �̹�ȣ
public class C58_ArraySortEx2 {

	// �迭�� ����� �� �����ϱ�
	public static void main(String[] args) {
		// for�� �ȿ� for������ �� ����.

		String[] names = { "����", "����", "����", "�ź�", "����", "���" };
		String temp;
		System.out.println(Arrays.toString(names));// �迭 Ȯ��

		for (int i = 0; i <= names.length - 2; i++) {
			for (int k = (i + 1); k <= (names.length - 1); k++) {
				if (names[i].compareTo(names[k]) > 0) {
					temp = names[k];
					names[k] = names[i];
					names[i] = temp;
					System.out.println(Arrays.toString(names));// ����Ȯ��
				}

			}

		}
		System.out.println(Arrays.toString(names));// ���Ȯ��
	}

}
