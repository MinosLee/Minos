package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String message = null;
			int cnt = message.length();

			System.out.println("정수입력>>>");
			// int n = sc.nextInt();
			int n = Integer.parseInt(sc.nextLine());
			// 이건 java.lang.NumberFormatException이 뜸.
			System.out.println("당신이 입력한 값 :" + n);
			// }catch(Exception e{ 오류 원인에 따른 Exception종류 검사.
			// }catch(NullPointerException e){
			// |기호는 bit 단위 or 연산 : Exception이 비트값으로 설정

		} catch (NullPointerException | NumberFormatException e) {
			// 발생한 오류정보를 Exception 객체로 관리하고 이에 대한 참조변수는 e임
			System.out.println("오류 발생" + e.getMessage());
			System.out.println("사용자 기능에 문제가 발생했습니다.");
		} finally {
			sc.close();
		}
		System.out.println("프로그램 끝!");
	}

}
