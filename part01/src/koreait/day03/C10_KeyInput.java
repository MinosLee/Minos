package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		// sc�� ��������. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� ������-> ������ ����
//            �� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ������ ������.

		Scanner sc = new Scanner(System.in); // Ű���� �Է��� ���� �⺻�� �غ�.(���� ����)

		int data;

		System.out.print("������ �Է��ϼ��� ->"); // �Է¸޼���
		data = sc.nextInt(); // ����ڷκ��� Ű���� �Է¹ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����.
		// ����ڰ� ���ڸ� �Է����� �ʾ��� ���� ������ ��ȯ���� ���ϰ� ������ �߻��մϴ�.

		System.out.println("�Էµ� ���� " + data + " �Դϴ�.");

		double point;
		System.out.print("�Ǽ��� �Է��ϼ��� ->");

		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + " �Դϴ�");

		sc.close();

	}

}

/*
 * ǥ�� ��� : System.out (out�� systemŬ������ ������ �ʵ�) - �޼ҵ��� println()�� ���� ǥ�� �Է� :
 * System.in(in�� systemŬ������ ������ �ʵ�) -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ���
 * ���. -> �⺻ ��Ű���� Ŭ������ �ƴϹǷ� import �� �ʿ��մϴ�.
 * 
 */
