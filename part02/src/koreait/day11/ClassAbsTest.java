package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {

		Person momo = new Person();
//		ClassAbs abs= new ClassAbs(); //���� : ClassAbs�� �߻�Ŭ������ new�� ����.
		ClassAbs abs = new ClassX(); // �θ�Ÿ�� ����
		ClassX cls = new ClassX(); // ���� Ŭ���� Ÿ��(�ڱ� �ڽ�) ����
		System.out.println("�׽�Ʈ ù��° : test �޼ҵ� ");
		abs.test();
		cls.test();
		abs.name = "�����"; // name�� �θ�Ŭ���� �ʵ�
		cls.name = "���";
		abs.print(); // print() �θ�Ŭ���� �޼ҵ�
		cls.print();

		System.out.println("�׽�Ʈ �ι�° : �ڽ��ʵ� num");
//		abs.setNum(23); -> �ȵ�. �ٿ�ĳ���� �ʿ�
		abs.test();
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX) abs; // -> �ٿ�ĳ����
		x.setNum(100);
		abs.test();
	}

}
