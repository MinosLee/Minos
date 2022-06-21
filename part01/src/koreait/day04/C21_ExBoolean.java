package koreait.day04;

import java.util.Scanner;

public class C21_ExBoolean {
	public static boolean CheckValid(String email) {
		if (email.indexOf("@") == -1) {
			System.out.println("@�� ���̵� ���� ���� �մϴ�");
			return false;
		}

		int firstAt = email.indexOf("@");
		int secondAt = email.lastIndexOf("@");

		if (firstAt != secondAt) {
			System.out.println("@�� �ѹ��� �� �� �ֽ��ϴ�");
			return false;
		}

		if (!email.substring(firstAt + 1).equals("gmail.com")) {
			System.out.println("�������� gmail.com�̾�� �մϴ�");
			return false;
		}

		if (email.substring(0, firstAt).length() < 6) {
			System.out.println("���̵�� 6���� �̻��̾�� �մϴ�");
			return false;
		}

		int pIdx = email.indexOf('%');
		int dIdx = email.indexOf('$');
		if (pIdx != -1 || dIdx != -1) {
			System.out.println("$ Ȥ�� % ��(��) �� �� �����ϴ�");
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		boolean isValid = false;
		Scanner sc = new Scanner(System.in);

		String email;
		do {
			System.out.print("�̸����� �Է����ּ��� >>> ");
			email = sc.nextLine();

			isValid = CheckValid(email);
		} while (!isValid);

		System.out.println("isValid? :" + isValid);

		sc.close();
	}

}
