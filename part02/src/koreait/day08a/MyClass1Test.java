package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {

	public static void main(String[] args) {

		// My Class1��ü����
		MyClass1 my = new MyClass1();

		// ��Ű���� �ٸ� MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ� ����? point
		// default(package) ������ �ʵ�name, �޼ҵ� setAge, getAge ���Ұ�
		// my.name= "momo"; //string name�� public�� �ƴ�
		my.point = 1.234;
		// my.age= 23 ����- private ������ �ʵ�
		// my.setAge(23); //setAge�� getAge�� public�� �ƴ�.

		// System.out.println("age = " + my.getAge()); //private �ʵ� ���� �о���� �޼ҵ� getter

		// my.setAge(-100);
		// System.out.println("age = " + my.getAge());
		System.out.println("age = " + my.point);
		// System.out.println("age = " + my.name);

		// Score Ŭ���� �ʵ�, �޼ҵ��� �����ڰ� ��� default��.
		// new ��ü������ �Ǵ°�? �� (O) class�� public�������̹Ƿ� ������.
		Score score = new Score();

	}

	// ���������� �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� �����.

}
