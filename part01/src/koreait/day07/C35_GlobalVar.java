package koreait.day07;

public class C35_GlobalVar {
	/*
	 * [������ ����� ��ġ�� ������] ��������(local variable) : �޼ҵ�, for, if, while ���{ }���� ����� ����.
	 * ����� ����� ������ ����� ��������(Global Variable) : Ŭ���� { }���� ����� ����
	 * 
	 * [���������� static ���η� ����] Ŭ�����̸�. ������ ��ü�� ���� ����ϴ� this.������ (�̶� ������ �ν��Ͻ� ������� ��)
	 * 
	 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� �ʵ�field(�Ǵ� ������Ƽproperty)��� �θ�.
	 */
	int count; // ��ġ�� �̷��� �����ϸ� ���������� ��.
	String message;
	static int num;
	static double point;
	static final int TEST = 9999; // static final�� �����. �����Ҷ� �ʱ�ȭ ������ ������ ������.

	public static void main(String[] args) { // static�� static�� ������.
		int num = 10; // main�޼ҵ忡���� ���
		System.out.println("num=" + num);// 10
//		System.out.println("message =" + message); //static�� �ƴ� message�� ���� �Ұ�.
		methodB();
//		methodA();//���� : static�� �ƴ� �޼ҵ�

	}

	public void methodA() {
		int num = 99; // methodA������ ����ϴ� ����
		System.out.println("num=" + num);// 99
		System.out.println("message = " + message); // ���������� ����� message

	}

//***�߿�
	public void methodC(int count) {
		this.count = count; // this�� new�� ������� ��ü�� ��Ī. methodC �޼ҵ带 �����Ű�� ��ü
	}

	public static void methodB() {
		int num = 77; // methodB������ ����ϴ� ����
		System.out.println("num=" + num);// 99
		System.out.println("num = " + C35_GlobalVar.num); // Integer.BYTES�� ��������
		// ���������� ����� num. ���������� �������� �̸��� ���� ���. static�� ���� Ŭ�����̸�.������ , static�� �ƴ� ����
		// this.�������� ���
		// ���������� ����,
	}

}
