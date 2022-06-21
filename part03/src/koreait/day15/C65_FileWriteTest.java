package koreait.day15;

import java.io.File; //io= input, output ����°� ���õ� ����� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {

		String filename = "D:\\study\\�ڹ��׽�Ʈ6.txt";

		File file = new File(filename);

		// Scanner : �Է±���� ���� Ŭ����
		// PrintWriter : ��� ����� ���� �ִ� Ŭ����
		// Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try catch��
		// �ʿ��ϴٴ� ��.
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			//System.out.println(); ���� System.out ��� ������°�ü pw�� �־���.
			pw.println("#Minos");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�");// System.out : ǥ�� ���

		} catch (FileNotFoundException e) {
			System.out.println("����� �����߻� : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}

	}

}
