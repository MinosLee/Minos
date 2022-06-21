package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog(); // ��ĳ����- �θ� �����ϴ� ĳ���� : �ڵ���ȯ �Ǵ� ĳ������
		Animal ani2 = new Cat(); // - �ݴ�� �ٿ�ĳ���õ� ������. ������ȯ �ʿ�

		Dog puddle = new Dog();
		Crow crow = new Crow();
		Dog dog = new Dog();

		System.out.println("::::::::::");

		animal(ani1);
//		animal(ani2);
//		animal(puddle);
//		animal(crow);
//		animal(new Frog());

	}

	// ������
	// ���� 1) �޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal : Animal, Dog, Crow, Frog, Cat ��ü ��� ����.
	public static void animal(Animal animal) {

		// ��������2 : �޼ҵ� ������. animal ��ü �ν��Ͻ� Ÿ�Կ� ���� ����Ǵ� act�� �ٸ�.
		animal.act();

		animal.print();
		// ���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻� : instanceof
		System.out.println("dog ?" + (animal instanceof Dog));
		System.out.println("Crow ?" + (animal instanceof Crow));
		System.out.println("Frog ?" + (animal instanceof Frog));
		System.out.println("Cat ?" + (animal instanceof Cat));

		/*
		 * Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ忡 ���� ����. �ٿ�ĳ�����ʿ� animal.jump(); animal.run();
		 * animal.fly(); animal.sound();
		 */

		Cat cat;
		Dog dog;
		Frog frog;
		Crow crow;
		if (animal instanceof Cat) {
			cat = (Cat) animal; // �ٿ�ĳ���� : animal ��¥ ��ü�� ���� ���� �Ǵ� ���������� ��. -> instanceof ���ǽ� �ʿ�
			cat.sound();
		}
		if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.run();
		}
		if (animal instanceof Frog) {
			frog = (Frog) animal;
			frog.jump();
		}
		if (animal instanceof Crow) {
			crow = (Crow) animal;
			crow.fly();
		}

	}

}

class Frog extends Animal { // ������

	protected String mouth; // ����Ʈ ������+ �ٸ� ��Ű�� �ڽ�Ŭ����

	public Frog() {
		System.out.println("���ο� ���������� Frog�Դϴ�.");
	}

	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}

	// ������ ���� : �޼ҵ� �������̵� *��: �����ε�(overloading)�� �ٸ�
	// �� �θ�Ŭ������ �޼ҵ带 �������ϴ� ����. �� �� ���ڿ� ����Ÿ���� �����ϰ� ��.
	@Override // annotation�̶�� �θ�
	public void act() {
		// super.act(); //�θ�Ŭ������ ��Ʈ�� �θ�.
		System.out.println("Animal �ൿ : ���÷� �����ϱ�");
	}

}

class Cat extends Animal {

	protected String eyes;

	public Cat() {
		System.out.println("���ο� ���������� Cat�Դϴ�.");
	}

	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿˾߿�");
	}

	@Override
	public void act() {
		// super.act();
		System.out.println("Animal �ൿ : ���÷� �߿˾߿� ���");
	}

}
