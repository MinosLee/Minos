package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//�ۼ��� : �̹�ȣ

	public static void main(String[] args) {

		/*
		 * ���� �̸��� ������ üũ�ϴ� ��� ���� 1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�. (�޽��� : �̸��� ������ �ƴմϴ�.) �� indexof
		 * �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 * 
		 * 2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.) �� '@' �� indexof ��
		 * ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 * 
		 * 3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�. �� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������
		 * ���ڿ� substring ����
		 * 
		 * 4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�. �� 3���� ���ڿ��� length() �� 6���� ��
		 * 
		 * 5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. �� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ�
		 * �����ϴ� ��ȣ ����
		 */

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;

		System.out.println("����� �̸����� �Է��ϼ���. >>>");
		email = sc.nextLine(); // Ű���� �Է��� ���ڿ��� ó�� �Է��� email�� ó������ 1, 2, 4, 5�� �ش����� ������ �޽��� ����ϰ� isVaild������
								// false�� ��.-> isValid���

		int firstat = email.indexOf("@");
		int lastat = email.lastIndexOf("@");

		String domain;
		String name;

		if ((firstat == lastat) && (firstat != -1)) {
			domain = email.substring(firstat + 1, email.length());
			name = email.substring(0, firstat);

			if (domain.equals("gmail.com")) {
				if (name.length() >= 6) {

					if (name.indexOf('%') != -1) {
						System.out.println("���� �� %�� �� �� �����ϴ�");
						isValid = false;
					}

					else if (name.indexOf('$') != -1) {
						System.out.println("���� �� $ �� �� �����ϴ�");
						isValid = false;
					}

					else
						System.out.println("���� ���� " + name + "   @gmail.com �Դϴ�");
				} else {
					System.out.println("�������� 5���� �����Դϴ�");
					isValid = false;
				}
			} else {
				System.out.println("������ �̸��� Ʋ���ϴ�");
				isValid = false;
			}
		} else {
			System.out.println("�̸��� ������ �ƴմϴ�");
			isValid = false;
		}

		System.out.println(isValid);

		sc.close();
	}

}
