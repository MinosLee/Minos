package koreait.day04;

public class C19_MethodTest {
//main�޼ҵ� : ������ ������. ���α׷� ������ ���� �� �־�� �� �޼ҵ�. static
	public static void main(String[] args) {

		System.out.println("�޼ҵ带 ���� �����ؼ� ����� ���ϴ�");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����");
		System.out.println("��� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�.");
		System.out.println("1.");
		methodA(); // �޼ҵ� ȣ��(����). �ʿ��� �� ȣ����.
		System.out.println("2.");
		methodB(11, 33);// **11, 33�� �޼ҵ� ���࿡ �ʿ��� ����
		methodB(929, 111);
		System.out.println("3.");
		methodc(929, 123.4);
		methodc(929, 121); // �ڵ�ĳ����( ����ȯ)
		System.out.println("4.");
		methodD(); // ��ȯ���� �ִ� �޼ҵ����� main �޼ҵ忡�� ��ȯ���� �������� ����.
		System.out.println("return= " + methodD()); // ��ȯ���� �޾Ƽ� ����ϴ� ����.
		int temp = methodD(); // ��ȯ���� �޾Ƽ� ������ �����ϴ� ����
		System.out.println("return=" + temp);
		System.out.println("5.");

		double result = methodE(21, 111.1);
		methodE(21, 111.1); // ��ȯ���� �ִ� �޼ҵ����� main �޼ҵ忡�� ��ȯ���� �������� ����.
		System.out.println("return= " + result);

		System.out.println("6.");
		System.out.println(methodF('i', 4));

		char ch = 'a';
		int val = 3;
		ch = methodF(ch, val); // �޼ҵ� ���ڷ� ������ ����� �� ����
		System.out.println("return= " + ch);

	}
	/*
	 * String Ŭ������ �޼ҵ带 �����ϱ� ���� ���� �޼ҵ��� ���� ����
	 * 
	 * 
	 * �޼ҵ��� �ֿ� ��� : ��ȯ��, ����(argument)�Ǵ� �Ű�����(parameter), �޼ҵ� �̸�, public �Ǵ� static ����
	 * ���� �� ��ȯ�� : �޼ҵ� ���� �Ϸ�Ǹ� ������� ����� �� ����: �޼ҵ� ������ ���� �ʿ��� ������(���İ� ������ ���� �ʿ�)- ������
	 * ������ ������ �پ���. �� �޼ҵ� �̸�: �ĺ��� �� public : ����������, static : ���� ���
	 * 
	 */

	// static�� main���� ������ �޼ҵ�� �����ϰ� static�̾�� �մϴ�.
	// �޼ҵ� ����(����)
	public static void methodA() {
		System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
	}

	public static void methodB(int a, int b) { // **int a, int b �� ���ڰ��� ���޹޴� �Ű�����(��������)
		System.out.println("## �ι��� �޼ҵ� ���� �����Դϴ�. ##");
		System.out.println("���޹��� �� a= " + a + ", b= " + b);
	}

	public static void methodc(int a, double b) {
		System.out.println("## ������ �޼ҵ� ���� �����Դϴ�. ##");
		System.out.println("���޹��� �� a= " + a + ", b= " + b);
	}

	public static int methodD() { // ��ȯ���� �ִ� ���� : ��ȯ���� int ������, �ݵ�� return�� �ʿ���
		System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�. ##");

		return 999;
	}

	public static double methodE(int a, double b) { // ��ȯ���� �ִ� ���� : ��ȯ���� int ������, �ݵ�� return�� �ʿ���
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�. ##");

		return a + b;

	}

	public static char methodF(char ch, int size) {
		System.out.println("## ����� �޼ҵ� ���� �����Դϴ�.##");

		return (char) (ch + size); // ���ڷ� ���޹��� ������ �����ϰ� ó����� ����
	}

}
