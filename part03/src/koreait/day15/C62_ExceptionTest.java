package koreait.day15;

import java.util.Scanner;
//Throwable Ŭ������ ����Ŭ���� : Error, Exception
//Error-> �ý��ۻ� ����- �ϵ����, os, jvm �� �������� ���α׷� ���� ����
//Exception-> �������� ���α׷� ���� ����

public class C62_ExceptionTest {

	public static void main(String[] args) {
		/*
		 * ��������: int a= 4.1; �� ���� ������ ��ü�� �ȵǴ� ��. Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ�
		 * ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.) -> ���ο� ���� �ٸ��̸� XXXXException �� �߻��ϰ� �̵���
		 * Exception Ŭ������ �ڽ� Ŭ�����Դϴ�. -> Exception �� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� ��������
		 * �ߴܵ˴ϴ�. ����, Exception �� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
		 */

		// Exception ����3 : java.util.InputMismatchException(���� ���� �ٸ� ���ڸ� �Է��ϸ� ����)
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�>>>");
		// int a = sc.nextInt(); // Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�.
		int n = Integer.parseInt(sc.nextLine());
		// ���� �ܿ� �ٸ� ���ڸ� �Է��ϸ� java.lang.NumberFormatException�߻�.
		System.out.println("����� �Է��� ��" + n);

		// Exception ����2: java.lang.ArrayIndexOutOfBoundsException (�迭�� ��踦 �Ѿ ����)
		int[] nums = new int[5]; // �迭���� : ��� 5���Դϴ�.
		nums[5] = 100; // �ε����� 4�������ۿ� ����.

		// Exception ����1 : java.lang.NullPointerException(��ü ������ null�̸� �޼ҵ� ���� �Ұ� ��� ��)
		String message = null;

		char temp = message.charAt(0); // message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.

	}

}
