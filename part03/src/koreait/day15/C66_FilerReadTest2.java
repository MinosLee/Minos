package koreait.day15;

import java.io.File; //io= input, output ����°� ���õ� ����� Ŭ����
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FilerReadTest2 {

	public static void main(String[] args) {

		String filename = "D:\\study\\�ڹ��׽�Ʈ2.txt";

		File file = new File(filename);

		// Scanner : �Է±���� ���� Ŭ����
		// PrintWriter : ��� ����� ���� �ִ� Ŭ����
		// Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try catch��
		// �ʿ��ϴٴ� ��.
		Scanner sc = null;
		try {
			sc = new Scanner(file); // System.in�� ���� ǥ���Է�(�ܼ��Է�)
//			
//			System.out.println("���Ͽ��� ���� ���� :" + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� :" + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� :" + sc.nextLine());
//			
			while (sc.hasNext()) { // ������ ���͸� �������� ���� �����Ͱ� ������ true
				System.out.println(sc.nextLine());
			}

			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�");// System.out : ǥ�� ���

		} catch (FileNotFoundException e) {
			// �Է±�ɿ��� ������ ������ Exception�� �߻�
			System.out.println("����� �����߻� : " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
//try catch�ڿ����� ����� finally �Ⱦ��� java 7�������ʹ� �ٸ� �������İ���
	// �� ���õ� �������̽��� ���������� ã�ƺ���
}
