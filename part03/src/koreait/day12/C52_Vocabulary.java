package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_Vocabulary {
//�ۼ��� �̹�ȣ
	public static void main(String[] args) {

		String eng = "";
		String kor = "";
		String typ;
		HashMap<String, String> voca = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("����� �����ϼ���. -> 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ���α׷� ������");
			int menu = sc.nextInt();
			if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else if (menu == 3) {
				System.out.println("�ܾ��� ��ü���⸦ �����ϼ̽��ϴ�");
				System.out.println(voca);
			}

			else if (menu == 2) {
				sc.nextLine();
				System.out.println("����ܾ �Է����ּ���");

				typ = sc.nextLine();
				if (eng.equals(typ)) {
					System.out.println("����ܾ�" + eng + "�� ���� " + kor + " �Դϴ�.");
				} else
					System.out.println("�ܾ��忡 ���� ���� �ܾ��Դϴ�.");
			}

			else if (menu == 1) {
				System.out.println("������ �ܾ �Է����ּ���");
				sc.nextLine();
				eng = sc.nextLine();

				System.out.println("���� �ܾ�" + eng + "���� �Է����ּ��� ");
				kor = sc.nextLine();
				voca.put(eng, kor);

				System.out.println("�ܾ ����Ǿ����ϴ� ����� �ܾ� :" + voca);

			} else {
				System.out.println("���� ����Դϴ�. ����� �ٽ� �������ּ���");
				continue;
			}
		}
		sc.close();
	}
}