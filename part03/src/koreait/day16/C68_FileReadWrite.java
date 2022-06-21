package koreait.day16;

//Exception 처리명령이 별도 메소드에서 정의될 때 다른방법:1) 2)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C68_FileReadWrite {
// main메소드가 throws Exception 한다면 jvm에게 넘김. 처리 내용은 printStackTrace결과와 동일함.
	public static void main(String[] args) {
		String filename = "D:\\study\\자바테스트0617.txt";

		try {
			fileWrite(filename);
			// filename = "D:\\study\\자바테스트0618.txt"; //없는 파일 테스트용
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("사용자 실행 오류" + e.getMessage());
			System.out.println("파일이 존재하는지 확인하세요");
		}
	}

	public static void fileWrite(String filename) {

		File file = new File(filename);

		PrintWriter pw = null;

		// 방법 1: Exception을 try~catch 로 직접처리
		// java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		// //file타입일 때 알아서 처리하라는 방식으로 우리에게 주는 것임. exception시리즈는 전부 다 throws가붙어있음
		try {
			pw = new PrintWriter(file);
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다");

		} catch (FileNotFoundException e) {
			System.out.println("사용자 오류발생 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}

	}

//방법 2 : throws 키워드는 해당 Exception을 호출한 곳으로 넘김.
	// throws 뒤에 , 로 구분해 여러개를 지정해 넣을 수 있음.
	// try catch와 throws를 어떻게 써야하는가?
	// throw가 Exception 처리해야 할 메소드가 많이 정의되고 사용 될 때 한곳에서 모두 처리할 수 있음.
	//
	public static void fileWrite2(String filename) throws FileNotFoundException {

		File file = new File(filename);

		PrintWriter pw = null;

		pw = new PrintWriter(file);
		pw.println("모모 90 89 82");
		pw.println("다현 89 90 82");
		pw.println("나연 82 89 90");
		System.out.println("파일 출력이 완료되었습니다");

		pw.close();

	}

	public static void fileRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
