package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//작성자 : 이민호
public class C67_ResourceClose {

	public static void main(String[] args) {

		String filename = "D:\\study\\자바테스트2.txt";

		File file = new File(filename);

		try (PrintWriter pw = new PrintWriter(file);) {
			// ㄴ 괄호 안에 선언함으로서 finally를 안써도 되게 함.
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다");// System.out : 표준 출력

		} catch (FileNotFoundException e) {
			System.out.println("사용자 오류발생 : " + e.getMessage());
			e.printStackTrace();
		}

		try (Scanner sc = new Scanner(file);) {

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}

			System.out.println("파일 읽기가 완료되었습니다");// System.out : 표준 출력

		} catch (FileNotFoundException e) {
			// 입력기능에는 파일이 없으면 Exception이 발생
			System.out.println("사용자 오류발생 : " + e.getMessage());
			e.printStackTrace();
		}

	}
	// 트라이 하나에 두개를 다 넣고싶다면

//		String filename = "D:\\study\\자바테스트.txt";	
//		String filename2 = "D:\\study\\자바테스트2.txt";	
//	File ifile = new File(filename);
//	File ofile = new File(filename2);
//	try (Scanner sc = new Scanner(ifile); PrintWriter pw = new PrintWriter(ofile); ) {
//	while (sc.hasNext()) {
//		String temp = sc.nextLine()
//		System.out.println(temp);
//	}
//
//	System.out.println("파일 읽기가 완료되었습니다");// System.out : 표준 출력
//} catch (FileNotFoundException e) {
//	System.out.println("사용자 오류발생 : " + e.getMessage());
//	e.printStackTrace();
//}
//
//}
//try catch자원해제 방법을 finally 안쓰고 java 7버전부터는 다른 구문형식가능
	// try with resource라고 함.
	// ㄴ 관련된 인터페이스가 무엇인지도 찾아보기
	// 선언된 자원이 java.lang.AutoCloseable 인터페이스가 구현되어 있어야 함.
}
