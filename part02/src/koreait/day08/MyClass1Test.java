package koreait.day08;

public class MyClass1Test {

	public static void main(String[] args) {

		// My Class1��ü����
		MyClass1 my = new MyClass1();

		// MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ� ����?
		my.name = "momo";
		my.point = 1.234;
		// my.age= 23 ����- private ������ �ʵ�
		my.setAge(23); // private �ʵ尪 ����(����)�ϴ� �޼ҵ� : setter
		// System.out.println("age= " + my.age); private������ �ʵ�.
		// ���嵵 �о���°͵� �Ұ���

		System.out.println("age = " + my.getAge()); // private �ʵ� ���� �о���� �޼ҵ� getter

		my.setAge(-100);
		System.out.println("age = " + my.getAge());
		System.out.println("age = " + my.point);
		System.out.println("age = " + my.name);

	}

	// ���������� �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� �����.

}
