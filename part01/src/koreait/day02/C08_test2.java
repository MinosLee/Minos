package koreait.day02;

public class C08_test2 {
//�ۼ��� : �̹�ȣ
	public static void main(String[] args) {

		System.out.println("\n[[�簢�� ������ ���� ���ϱ�]]\n");

		int width = 23;
		int heigth = 19;
		int box_area = width * heigth;

		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + heigth + "��");
		System.out.println("���̸� ���߽��ϴ� : " + box_area + "��");

		System.out.println("\n[[�� ������ ���̿� �ѷ� ���ϱ�]]\n");
		double radius = 23.230;
		final double pi = 3.14;
		double round = 2 + pi * radius;
		double circle_area = pi * radius * radius;

		System.out.printf("������ : %.3f �� \n", radius);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f �� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f �� \n", circle_area);

		// final test
		// ���� ���� �տ� final Ű���带 ���̸� ���� �������� ����.

		final int test = 123; // test�� �������� ���ϰ� ��. ���� ���� ���ϴ� �����.
		System.out.println("test=" + test);
	}

}
