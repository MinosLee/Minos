package koreait.day15;

import java.io.File; //io= input, output 입출력과 관련된 기능의 클래스
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FilerReadTest2 {

	public static void main(String[] args) {

		String filename = "D:\\study\\자바테스트2.txt";

		File file = new File(filename);

		// Scanner : 입력기능을 갖는 클래스
		// PrintWriter : 출력 기능을 갖고 있는 클래스
		// Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try catch가
		// 필요하다는 뜻.
		Scanner sc = null;
		try {
			sc = new Scanner(file); // System.in을 쓰면 표준입력(콘솔입력)
//			
//			System.out.println("파일에서 읽은 내용 :" + sc.nextLine());
//			System.out.println("파일에서 읽은 내용 :" + sc.nextLine());
//			System.out.println("파일에서 읽은 내용 :" + sc.nextLine());
//			
			while (sc.hasNext()) { // 구분자 엔터를 기준으로 다음 데이터가 있으면 true
				System.out.println(sc.nextLine());
			}

			System.out.println("파일 읽기가 완료되었습니다");// System.out : 표준 출력

		} catch (FileNotFoundException e) {
			// 입력기능에는 파일이 없으면 Exception이 발생
			System.out.println("사용자 오류발생 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
//try catch자원해제 방법을 finally 안쓰고 java 7버전부터는 다른 구문형식가능
	// ㄴ 관련된 인터페이스가 무엇인지도 찾아보기
}
