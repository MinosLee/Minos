package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {

		String message = "hi java!"; // message 는 참조형 변수
		String[] engKey = { "continue", "break", "public", "static", "dynamic" };

		// int, double, char 배열에서 요소를 나타내는 nums[2], carr1[2], point[2]
		// ㄴ기본형 데이터 타입
		// engKey[2] 는 String 참조형타입

		for (int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);// engKey[i]는 String참조형

		String[] koreans = new String[5];// 배열요소의 값이 기본형데이터 저장X, 참조값 저장
											// 기본초기값은? null(아무것도 참조하지 않은 상태)
		for (int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);

		System.out.println("1. engKey 배열오소 값이 참조하는 문자열의 길이");
		for (int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());

		koreans[0] = "계속하다";
		koreans[1] = "멈추다";
		koreans[2] = "공용의";

		System.out.println("2. kroreans 배열오소 값이 참조하는 문자열의 길이");
		for (int i = 0; i < koreans.length; i++)
			if (koreans[i] != null)// 매우 매우 중요한 if문임.
				System.out.println(koreans[i] + ":" + koreans[i].length());
		// 참조하고 있는 객체가 없을 때 메소드 필드 참조하면 오류 koreans[3], koreans[4]은 null참조

//		String temp=null;
//		System.out.println(temp.length());

		Scanner sc = new Scanner(System.in);
		System.out.print("static 뜻? >>>");
		koreans[3] = sc.nextLine();
		System.out.print("dynamic 뜻? >>>");
		koreans[4] = sc.nextLine();

		System.out.println("3. 모두 입력된 koreans 배열 확인");
		for (int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);

		System.out.println("4. 문자열 배열에서 비교하기");
		// 사용자가 입력한 영어 단어가 engKey배열 인덱스 몇번인지 알아내는 방법
		System.out.println("찾을 단어는 >>>");
		String find = sc.nextLine();

		int i;
		for (i = 0; i < engKey.length; i++) {
			if (find.contentEquals(engKey[i]))
				break;
		}

		System.out.println("찾은 단어위치" + i);
		if (i == engKey.length)
			System.out.println("찾는 단어가 engKey에 없습니다!");
		else
			System.out.println("한글 뜻 :" + koreans[i]);

		/*
		 * int index = -1;
		 * 
		 * for (int i = 0; i < engKey.length; i++) { // 순차적으로 참조하는 문자열 비교 if
		 * (find.contentEquals(engKey[i])) { // 일치하는 단어 찾으면 for종료 index = i; break; } }
		 * System.out.println("찾은 단어 위치 :" + index); if (index == -1)
		 * System.out.println("찾는 단어가 engKey에 없습니다!"); else System.out.println("한글 뜻 :"
		 * + koreans[index]);
		 */

		sc.close();
	}

}
