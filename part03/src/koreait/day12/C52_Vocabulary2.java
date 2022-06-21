package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_Vocabulary2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> voca = new TreeMap<String, String>();
//		HashMap<String, String> voca = new HashMap<>();
		String eng, kor, typ;
		System.out.println("기능을 선택하세요. -> 1. 단어저장 2. 단어검색 3. 단어장보기 4. 프로그램 끝내기");
		boolean menu = true;
		while (menu) {
			typ = sc.nextLine();
			switch (typ) {
			case "1":
				System.out.println("영어 단어를 입력하세요");
				eng = sc.nextLine();
				System.out.println("단어의 뜻을 입력하세요");
				kor = sc.nextLine();
				voca.put(eng, kor);
				break;

			case "2":
				System.out.println("검색할 단어를 입력하세요");
				eng = sc.nextLine();
				System.out.println("단어의 뜻은 " + voca.get(eng));
				break;
			case "3":
				System.out.println(voca);
				break;

			case "4":
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못 입력한 선택입니다 1~4를 입력해주세요");
				break;
			}
		}
		System.out.println("단어장을 종료합니다");
	}
	// 참고: 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환.
	// int score= Integer.parseInt(sc.nextLine()); 처럼 씀.
	// 이유 : nextInt() 는 엔터를 처리하지 않아 다음에 나오는 nextLine()에게 전달되어 입력흐름에 방해가 됨.
	// 결론: 한 소스파일에서 nextInt()만 사용하거나 nextLine()만 사용하는 것이 좋음.
}