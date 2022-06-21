package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_Vocabulary2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> voca = new TreeMap<String, String>();
//		HashMap<String, String> voca = new HashMap<>();
		String eng, kor, typ;
		System.out.println("����� �����ϼ���. -> 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ���α׷� ������");
		boolean menu = true;
		while (menu) {
			typ = sc.nextLine();
			switch (typ) {
			case "1":
				System.out.println("���� �ܾ �Է��ϼ���");
				eng = sc.nextLine();
				System.out.println("�ܾ��� ���� �Է��ϼ���");
				kor = sc.nextLine();
				voca.put(eng, kor);
				break;

			case "2":
				System.out.println("�˻��� �ܾ �Է��ϼ���");
				eng = sc.nextLine();
				System.out.println("�ܾ��� ���� " + voca.get(eng));
				break;
			case "3":
				System.out.println(voca);
				break;

			case "4":
				System.out.println("���α׷��� �����մϴ�.");
				break;

			default:
				System.out.println("�߸� �Է��� �����Դϴ� 1~4�� �Է����ּ���");
				break;
			}
		}
		System.out.println("�ܾ����� �����մϴ�");
	}
	// ����: ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ.
	// int score= Integer.parseInt(sc.nextLine()); ó�� ��.
	// ���� : nextInt() �� ���͸� ó������ �ʾ� ������ ������ nextLine()���� ���޵Ǿ� �Է��帧�� ���ذ� ��.
	// ���: �� �ҽ����Ͽ��� nextInt()�� ����ϰų� nextLine()�� ����ϴ� ���� ����.
}