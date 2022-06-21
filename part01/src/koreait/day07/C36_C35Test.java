package koreait.day07;

public class C36_C35Test {
//C35 Ŭ������ 1)��ü�� ����  2) static�� �͵��� �׽�Ʈ
	// ���� : main�޼ҵ带 ���� Ŭ������ ��ü�� ����� ������� �ʴ� ���� �Ϲ�����.

	public static void main(String[] args) {

		// test1, 2�� ������ ����
		C35_GlobalVar test1 = new C35_GlobalVar(); // C35Ŭ����Ÿ���� ��ü�� ����
		C35_GlobalVar test2 = new C35_GlobalVar(); // C35Ŭ����Ÿ���� ��ü�� ����

//		C35Ŭ�������� static�� �ƴ� �ν��Ͻ� �������� ��ü���� �ٸ� ���� ������ - ��ü ���� �ٸ� Ư���� ��Ÿ��.
		test1.count = 10;
		test2.count = 20;
		test1.message = "hi test1";
		test2.message = "hello test2";

		test1.methodA(); // �ν��Ͻ� �޼ҵ�
		test2.methodA();

		test1.methodC(123); // C35�� �޼ҵ�C�� this.count���� this�� test1�� �ǹ��ϰ� ��.
		test2.methodC(999);

		System.out.println("test1.count= " + test1.count);
		System.out.println("test2.count= " + test2.count);

		// static��� �׽�Ʈ : static���� �Ǵ� static�޼ҵ�� Ŭ���� �̸����� ����

		C35_GlobalVar.num = 101;
		System.out.println("static num= " + C35_GlobalVar.num);
		System.out.println("static num= " + test1.num); // static���� �����϶�� ������ ��
		System.out.println("static num= " + test2.num);

		// static�� ����Ǵ� �޸𸮿���(�޼ҵ念��)�� ��ü�� ����Ǵ� �޸𸮿���(������)�� �ٸ�.

		// ��� TESTȮ��
		System.out.println("TEST=" + C35_GlobalVar.TEST);
		// C35_GlobalVar.TEST=100; //final���� ����Ұ�

		C35_GlobalVar test3 = new C35_GlobalVar();
		// ���������� �⺻�ʱⰪ- 0, 0.0, ����Ÿ���� null
		// ���� : ���������� �⺻�ʱⰪ? = �迭�϶� 0, 0.0, ����Ÿ���� null, �� �� �������� ����
		System.out.println("test3.count=" + test3.count); // 0
		System.out.println("test3.message=" + test3.message); // null
		System.out.println("C35_GlobalVar.point=" + C35_GlobalVar.point);// 0.0

	}

}
