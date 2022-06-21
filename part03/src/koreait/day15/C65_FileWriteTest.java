package koreait.day15;

import java.io.File; //io= input, output 입출력과 관련된 기능의 클래스
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {

		String filename = "D:\\study\\자바테스트6.txt";

		File file = new File(filename);

		// Scanner : 입력기능을 갖는 클래스
		// PrintWriter : 출력 기능을 갖고 있는 클래스
		// Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try catch가
		// 필요하다는 뜻.
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			//System.out.println(); 에서 System.out 대신 파일출력개체 pw를 넣었음.
			pw.println("#Minos");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다");// System.out : 표준 출력

		} catch (FileNotFoundException e) {
			System.out.println("사용자 오류발생 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}

	}

}
