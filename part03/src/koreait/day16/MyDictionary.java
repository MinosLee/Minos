package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//�ۼ���: �̹�ȣ
public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // voca�� mywords�� �ٲ㼭 ����

		String eng, kor, typ;
		int lev;
		System.out.println("����� �����ϼ���. -> 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ������ �˻� 5. ���α׷� ������");
		boolean menu = true;

		while (menu) {
			typ = sc.nextLine();
			switch (typ) {
			case "1":
				System.out.println("���� �ܾ �Է��ϼ���");
				eng = sc.nextLine();

				System.out.println("�ܾ��� ���� �Է��ϼ���");
				kor = sc.nextLine();

				System.out.println("�ܾ��� ������ �Է��ϼ���");
				lev = Integer.parseInt(sc.nextLine());

				Word temp = new Word(eng, kor);
				temp.setLevel(lev);
				mywords.add(temp);

				break;

			case "2":
				System.out.println("�˻��� �ܾ �Է��ϼ���");
				eng = sc.nextLine();
				for (Word w : mywords)
					if (w.getEnglish().equals(eng))
						System.out.println("�ܾ��� �˻��߽��ϴ�. �����" + w);

				break;

			case "3":
//				System.out.println("�ܾ��� ��ü����" + mywords);
				all(mywords);
				break;

			case "4":
				System.out.println("�˻��� ������ �Է��ϼ���(1~3)->");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords, no);

				break;

			case "5":
				System.out.println("���α׷��� �����մϴ�.");

				break;

			default:
				System.out.println("�߸� �Է��� �����Դϴ� 1~4�� �Է����ּ���");

				break;
			}
		}
		System.out.println("�ܾ����� �����մϴ�");
	}

	private static void level(List<Word> mywords, int no) {
		for (Word w : mywords)
			if (w.getLevel() == no)
				System.out.println("�ܾ��� �˻��߽��ϴ�. �����" + w);

	}

	private static void all(List<Word> mywords) {
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}

		});

		System.out.println(String.format("%-20s %-20s\t %10s", "English", "Korean", "level"));
		System.out.println("-----------------------------------------------------");
		for (Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}

}