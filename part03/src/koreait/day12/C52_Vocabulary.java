package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_Vocabulary {
//작성자 이민호
	public static void main(String[] args) {

		String eng = "";
		String kor = "";
		String typ;
		HashMap<String, String> voca = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("기능을 선택하세요. -> 1. 단어저장 2. 단어검색 3. 단어장보기 4. 프로그램 끝내기");
			int menu = sc.nextInt();
			if (menu == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (menu == 3) {
				System.out.println("단어장 전체보기를 선택하셨습니다");
				System.out.println(voca);
			}

			else if (menu == 2) {
				sc.nextLine();
				System.out.println("영어단어를 입력해주세요");

				typ = sc.nextLine();
				if (eng.equals(typ)) {
					System.out.println("영어단어" + eng + "의 뜻은 " + kor + " 입니다.");
				} else
					System.out.println("단어장에 없는 영어 단어입니다.");
			}

			else if (menu == 1) {
				System.out.println("저장할 단어를 입력해주세요");
				sc.nextLine();
				eng = sc.nextLine();

				System.out.println("영어 단어" + eng + "뜻을 입력해주세요 ");
				kor = sc.nextLine();
				voca.put(eng, kor);

				System.out.println("단어가 저장되었습니다 저장된 단어 :" + voca);

			} else {
				System.out.println("없는 기능입니다. 기능을 다시 선택해주세요");
				continue;
			}
		}
		sc.close();
	}
}