package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//작성자: 이민호
public class MyDictionaryV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // voca를 mywords로 바꿔서 구현

		try {
			Scanner ssc = new Scanner(System.in);
			System.out.println("파일을 불러올까요? (y or n)");
			if (ssc.nextLine().equals("y"))
				read(mywords, "D:\\study\\나의영한사전.txt");
			else
				System.out.println("파일을 새로 만듭니다");
		} catch (FileNotFoundException e1) {
			System.out.println("파일을 불러오는 중 오류가 발생했습니다" + e1.getMessage());
		} // 파일에서 기존내용 읽어오고, 그 내용을 mywords 리스트에 저장하기

		String eng, kor, typ;
		int lev;
		System.out.println("기능을 선택하세요. -> 1. 단어저장 2. 단어검색 3. 단어장보기 4. 레벨로 검색 5. 프로그램 끝내기");
		boolean menu = true;

		while (menu) {
			System.out.println("선택 -> ");
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
				menu = false;
				break;

			default:
				System.out.println("잘못 입력한 선택입니다 1~4를 입력해주세요");

				break;
			}
		}

		try {
			Scanner ssc = new Scanner(System.in);
			System.out.println("파일에 저장할까요? (y or n)");
			if (ssc.nextLine().equals("y"))
				save(mywords, "D:\\study\\나의영한사전.txt");
			else
				System.out.println("파일이 저장되지 않았습니다");
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 중 오류가 발생했습니다.-" + e.getMessage());

		}
		// mywords 리스트의 내용을 파일에 저장
		System.out.println("단어장을 종료합니다");
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String temp = sc.nextLine(); // 파일에서 1줄 읽어온 것 저장
			System.out.println(temp.substring(0, temp.indexOf("("))); // 객체 만들 때 필요한 값만 가져오기 테스트
			// 위의 결과를 참고로 StringTokenizer로 word객체 만들고 mywords 리스트에 추가.
			StringTokenizer stk = new StringTokenizer(temp.substring(0, temp.indexOf("("))); // 두번째 인자는 delimiter : 구분기호
																								// 문자나열(정규식 아님)

			mywords.add(new Word(stk.nextToken(), stk.nextToken(), Integer.parseInt(stk.nextToken())));
		}
		sc.close();
		System.out.println("파일 불러오기가 완료되었습니다");

	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for (Word w : mywords)
			pw.println(w);

		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
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