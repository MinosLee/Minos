package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
//���� �߻��ϴ� randomŬ������ �޼ҵ� �׽�Ʈ
	public static void main(String[] args) {
		Random r = new Random(); // randomŬ������ ��ü����(new����)

		System.out.println("1. ������ ������ 10�� ���");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(); // int���� ������ ������(����) ����
			System.out.println(inum);
		}
		System.out.println("2. ������ ������ 10�� ���- bound(��谪) ����.");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(100); // int���� ������ ������(����) ���� 0<= ���� < 100 ������ ������ ����
			System.out.println(inum);
		} // ��谪�� ������� ���.

		// int���� ������ ������(����) ���� 1<= ���� < 101 ������ ������ ����
		System.out.println("3. Ư�� ������ ������ 10�� ���- bound�� �̿��� ����.");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(100) + 1; // int���� ������ ������(����) ���� 1<= ���� < 101 ������ ������ ����
			System.out.println(inum);
		} // ��谪�� ������� ���.

		// n���� ũ�ų� ����, m���� ���� ������ ���� : r.nextInt(m-1)+n

		System.out.println("4. 2~45�� ������ ���� 10��"); // n=2 m=46
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(44) + 2;
			System.out.println(inum);

		}
	}

}
