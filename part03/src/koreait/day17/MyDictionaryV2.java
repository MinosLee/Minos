package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//�ۼ���: �̹�ȣ
public class MyDictionaryV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // voca�� mywords�� �ٲ㼭 ����

		try {
			Scanner ssc = new Scanner(System.in);
			System.out.println("������ �ҷ��ñ��? (y or n)");
			if (ssc.nextLine().equals("y"))
				read(mywords, "D:\\study\\���ǿ��ѻ���.txt");
			else
				System.out.println("������ ���� ����ϴ�");
		} catch (FileNotFoundException e1) {
			System.out.println("������ �ҷ����� �� ������ �߻��߽��ϴ�" + e1.getMessage());
		} // ���Ͽ��� �������� �о����, �� ������ mywords ����Ʈ�� �����ϱ�

		String eng, kor, typ;
		int lev;
		System.out.println("����� �����ϼ���. -> 1. �ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ������ �˻� 5. ���α׷� ������");
		boolean menu = true;

		while (menu) {
			System.out.println("���� -> ");
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
				menu = false;
				break;

			default:
				System.out.println("�߸� �Է��� �����Դϴ� 1~4�� �Է����ּ���");

				break;
			}
		}

		try {
			Scanner ssc = new Scanner(System.in);
			System.out.println("���Ͽ� �����ұ��? (y or n)");
			if (ssc.nextLine().equals("y"))
				save(mywords, "D:\\study\\���ǿ��ѻ���.txt");
			else
				System.out.println("������ ������� �ʾҽ��ϴ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� �� ������ �߻��߽��ϴ�.-" + e.getMessage());

		}
		// mywords ����Ʈ�� ������ ���Ͽ� ����
		System.out.println("�ܾ����� �����մϴ�");
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String temp = sc.nextLine(); // ���Ͽ��� 1�� �о�� �� ����
			System.out.println(temp.substring(0, temp.indexOf("("))); // ��ü ���� �� �ʿ��� ���� �������� �׽�Ʈ
			// ���� ����� ����� StringTokenizer�� word��ü ����� mywords ����Ʈ�� �߰�.
			StringTokenizer stk = new StringTokenizer(temp.substring(0, temp.indexOf("("))); // �ι�° ���ڴ� delimiter : ���б�ȣ
																								// ���ڳ���(���Խ� �ƴ�)

			mywords.add(new Word(stk.nextToken(), stk.nextToken(), Integer.parseInt(stk.nextToken())));
		}
		sc.close();
		System.out.println("���� �ҷ����Ⱑ �Ϸ�Ǿ����ϴ�");

	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for (Word w : mywords)
			pw.println(w);

		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
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