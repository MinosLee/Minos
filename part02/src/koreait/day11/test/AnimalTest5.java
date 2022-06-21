package koreait.day11.test;

public class AnimalTest5 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[8] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();

		for (Animal temp : animals)
			if (temp != null) {
				temp.act();

			}

		// ����ð� : ms nt 1970 1�� 1�� ������ �������� ī��Ʈ
		System.out.println("����ð�......");
		System.out.println(System.currentTimeMillis() + "ms");
		System.out.println(System.nanoTime() + "nt");

		// �������� �������.... instanceof �������϶��� ī��Ʈ
		int cnt = 0; // ī��Ʈ ����
		long start = System.nanoTime();
		System.out.println("������ �����ֱ�.......");
		for (Animal temp : animals) {
			if (temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100 * (cnt + 2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("������ ���� �ִµ� �ɸ� �ð�" + (end - start) + "nt");
		System.out.println("��������" + cnt + "���� ��� �ֽ��ϴ�.");

		// �������� ������� ..... instanceof ��� type�ʵ� �̿��Ͽ� �����. �����ֱ�
		start = System.nanoTime();
		System.out.println("������ �����ֱ�.......");
		cnt = 0;
		for (Animal temp : animals) {
			if (temp != null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("���ִ� ����"));
			}
		}
		end = System.nanoTime();
		System.out.println("�������� " + cnt + "������ ��� �ֽ��ϴ�.");
		System.out.println("������ ���� �ִµ� �ɸ� �ð�" + (end - start) + "nt");

		System.out.println("��Ϳ��� �����ֱ�........");
		System.out.println(animals[6].eat(animals[3]));

	}

}

class Frog extends Animal { // ������

	protected String mouth; // ����Ʈ ������+ �ٸ� ��Ű�� �ڽ�Ŭ����

	public Frog() {
		System.out.println("���ο� ���������� Frog�Դϴ�.");
		type = Animal.FROG;
	}

	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}

	@Override
	public void act() {
		System.out.println("Animal�ൿ : �Ϸ����� �����ϱ�");
		// TODO Auto-generated method stub

	}

	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return "unknown" + object;
	}

}

class Cat extends Animal {

	protected String eyes;

	public Cat() {
		System.out.println("���ο� ���������� Cat�Դϴ�.");
		type = Animal.CAT;

	}

	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿˾߿�");
	}

	@Override
	public void act() {
		System.out.println("�Ϸ����� �߿˾߿� ���");

	}

	@Override
	public String eat(Object object) {

		return null;
	}

}
