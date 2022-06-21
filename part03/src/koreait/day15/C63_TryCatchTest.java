package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// try����
		try {
			// Exception ���ɼ��� �ִ� ����� �ۼ� -> ������ ����� catch�ΰ�.
			// �� ��ġ���� ���������ϸ� try�� ��������

		} catch (NullPointerException e) {
			// ���� ���ο� ���� Exception ���� �˻�.
			// ������ NullPointException�϶��� �Ʒ� ��� ����
			e.printStackTrace(); // ���� ������ ���� ������ ���(���� Exception ��³���)
		}

		catch (InputMismatchException e) {
			// catch�� ������ �ۼ� ����

		} finally {
			// ����������, ���������� : ���� �߻� ������� ����Ǵ� �κ�

		}

		sc.close();

	}

}
