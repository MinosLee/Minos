package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//작성자: 이민호
public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // voca를 mywords로 바꿔서 구현

		String eng, kor, typ;
		int lev;
		System.out.println("기능을 선택하세요. -> 1. 단어저장 2. 단어검색 3. 단어장보기 4. 레벨로 검색 5. 프로그램 끝내기");
		boolean menu = true;

		while (menu) {
			typ = sc.nextLine();
			switch (typ) {
			case "1":
				System.out.println("영어 단어를 입력하세요");
				eng = sc.nextLine();

				System.out.println("단어의 뜻을 입력하세요");
				kor = sc.nextLine();

				System.out.println("단어의 레벨을 입력하세요");
				lev = Integer.parseInt(sc.nextLine());

				Word temp = new Word(eng, kor);
				temp.setLevel(lev);
				mywords.add(temp);

				break;

			case "2":
				System.out.println("검색할 단어를 입력하세요");
				eng = sc.nextLine();
				for (Word w : mywords)
					if (w.getEnglish().equals(eng))
						System.out.println("단어장 검색했습니다. 결과는" + w);

				break;

			case "3":
//				System.out.println("단어장 전체보기" + mywords);
				all(mywords);
				break;

			case "4":
				System.out.println("검색할 레벨을 입력하세요(1~3)->");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords, no);

				break;

			case "5":
				System.out.println("프로그램을 종료합니다.");

				break;

			default:
				System.out.println("잘못 입력한 선택입니다 1~4를 입력해주세요");

				break;
			}
		}
		System.out.println("단어장을 종료합니다");
	}

	private static void level(List<Word> mywords, int no) {
		for (Word w : mywords)
			if (w.getLevel() == no)
				System.out.println("단어장 검색했습니다. 결과는" + w);

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