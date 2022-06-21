package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// try형식
		try {
			// Exception 가능성이 있는 명령을 작성 -> 오류가 생기면 catch로감.
			// 이 위치에서 변수선언하면 try의 지역변수

		} catch (NullPointerException e) {
			// 오류 원인에 따른 Exception 종류 검사.
			// 지금은 NullPointException일때만 아래 명령 시행
			e.printStackTrace(); // 오류 추적을 위해 원인을 출력(기존 Exception 출력내용)
		}

		catch (InputMismatchException e) {
			// catch는 여러번 작성 가능

		} finally {
			// 마지막으로, 최종적으로 : 오류 발생 상관없이 실행되는 부분

		}

		sc.close();

	}

}
