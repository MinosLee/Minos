package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//�ۼ��� : �̹�ȣ
public class C67_ResourceClose {

	public static void main(String[] args) {

		String filename = "D:\\study\\�ڹ��׽�Ʈ2.txt";

		File file = new File(filename);

		try (PrintWriter pw = new PrintWriter(file);) {
			// �� ��ȣ �ȿ� ���������μ� finally�� �Ƚᵵ �ǰ� ��.
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�");// System.out : ǥ�� ���

		} catch (FileNotFoundException e) {
			System.out.println("����� �����߻� : " + e.getMessage());
			e.printStackTrace();
		}

		try (Scanner sc = new Scanner(file);) {

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}

			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�");// System.out : ǥ�� ���

		} catch (FileNotFoundException e) {
			// �Է±�ɿ��� ������ ������ Exception�� �߻�
			System.out.println("����� �����߻� : " + e.getMessage());
			e.printStackTrace();
		}

	}
	// Ʈ���� �ϳ��� �ΰ��� �� �ְ�ʹٸ�

//		String filename = "D:\\study\\�ڹ��׽�Ʈ.txt";	
//		String filename2 = "D:\\study\\�ڹ��׽�Ʈ2.txt";	
//	File ifile = new File(filename);
//	File ofile = new File(filename2);
//	try (Scanner sc = new Scanner(ifile); PrintWriter pw = new PrintWriter(ofile); ) {
//	while (sc.hasNext()) {
//		String temp = sc.nextLine()
//		System.out.println(temp);
//	}
//
//	System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�");// System.out : ǥ�� ���
//} catch (FileNotFoundException e) {
//	System.out.println("����� �����߻� : " + e.getMessage());
//	e.printStackTrace();
//}
//
//}
//try catch�ڿ����� ����� finally �Ⱦ��� java 7�������ʹ� �ٸ� �������İ���
	// try with resource��� ��.
	// �� ���õ� �������̽��� ���������� ã�ƺ���
	// ����� �ڿ��� java.lang.AutoCloseable �������̽��� �����Ǿ� �־�� ��.
}
