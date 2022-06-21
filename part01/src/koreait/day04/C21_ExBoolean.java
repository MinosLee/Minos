package koreait.day04;

import java.util.Scanner;

public class C21_ExBoolean {
	public static boolean CheckValid(String email) {
		if (email.indexOf("@") == -1) {
			System.out.println("@는 아이디 다음 들어가야 합니다");
			return false;
		}

		int firstAt = email.indexOf("@");
		int secondAt = email.lastIndexOf("@");

		if (firstAt != secondAt) {
			System.out.println("@는 한번만 들어갈 수 있습니다");
			return false;
		}

		if (!email.substring(firstAt + 1).equals("gmail.com")) {
			System.out.println("도메인은 gmail.com이어야 합니다");
			return false;
		}

		if (email.substring(0, firstAt).length() < 6) {
			System.out.println("아이디는 6글자 이상이어야 합니다");
			return false;
		}

		int pIdx = email.indexOf('%');
		int dIdx = email.indexOf('$');
		if (pIdx != -1 || dIdx != -1) {
			System.out.println("$ 혹은 % 은(는) 들어갈 수 없습니다");
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		boolean isValid = false;
		Scanner sc = new Scanner(System.in);

		String email;
		do {
			System.out.print("이메일을 입력해주세요 >>> ");
			email = sc.nextLine();

			isValid = CheckValid(email);
		} while (!isValid);

		System.out.println("isValid? :" + isValid);

		sc.close();
	}

}
