package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

//읽어올 수 있는 텍스트파일은 인코딩이 일치해야 함.
//workspace utf-8이면 텍스트 파일 UTF-8형식만.
//			ms949면 텍스트파일 ANSI형식만 가능.
//작성자 : 이민호
public class C67_ResourceClose2 {

	public static void main(String[] args) {

		// 트라이 하나에 두개를 다 넣고싶다면

//		String filename = "D:\\study\\자바테스트.txt";
//		String filename2 = "D:\\study\\자바테스트2.txt";

		// 파일 대화상자 사용하기
		String filename = fileDialogOpen();
		String filename2 = fileDialogSave();

		File ifile = new File(filename);
		File ofile = new File(filename2);

		try (Scanner sc = new Scanner(ifile); PrintWriter pw = new PrintWriter(ofile);) {
			while (sc.hasNext()) {
				String temp = sc.nextLine(); // 파일에서 읽어온 1줄
				System.out.println("파일 내용" + temp); // 표준출력(콘솔)
				pw.println(temp); // 파일출력
			}

			System.out.println("파일 읽기가 완료되었습니다");// System.out : 표준 출력

		} catch (FileNotFoundException e) {
			System.out.println("사용자 오류발생 : " + e.getMessage());
			System.out.println("지정된 파일이 없습니다.");

		} catch (Exception e) {
			System.out.println("알 수 없는 오류 :" + e.getMessage());
		}

	}

	public static String fileDialogOpen() {
		// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface) <-> GUI(Graphic User
		// Interface)
		// 자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다. 라이브러리는 awt,swing,javaFX
		// 등이 있습니다.
		// Windows OS는 프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것은 프레임이라고 합니다.

		JFrame f = new JFrame(); // 파일대화상자를 시작할 프레임객체 생성

		FileDialog fdr = new FileDialog(f, "파일 열기", FileDialog.LOAD); // 파일대화상자 객체 생성
		fdr.setVisible(true); // 파일 대화상자 보이기

		String filename = fdr.getDirectory() + fdr.getFile(); // 선택한 파일의 경로와 파일명 연결
		System.out.println("선택한 경로와 파일 : " + filename);
//		System.out.println("선택한 경로 : " + fdr.getDirectory() + ",선택한 파일:" + fdr.getFile());

		File file = new File(filename);
		System.out.println("선택한 파일 크기 :" + file.length() + "바이트");

		return filename;
	}

	public static String fileDialogSave() {
		JFrame f = new JFrame();

		FileDialog fdw = new FileDialog(f, "파일 저장", FileDialog.SAVE);
		fdw.setVisible(true); // 파일 대화상자 보이기

		String filename = fdw.getDirectory() + fdw.getFile(); // 선택한 파일의 경로와 파일명 연결
		System.out.println("저장할 경로와 파일 : " + filename);

		return filename;

	}
}
