package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {

	// �͸� Ŭ���� anonymous. �̸����� Ŭ����.

	public static void main(String[] args) {

		// �������
		AShape sha = new AShape() {
			// �߻�޼ҵ� ������
			// �͸� ����(Inner) Ŭ���� ����. 1ȸ�� Ŭ���� ����(�߻�޼ҵ� ������ �ʼ�)
			@Override
			public double getArea() {

				return width + height;
			}
		};

		AShape sha2 = new AShape(20, 13) {

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + height;
			}
		};

		System.out.println("sha ���� =" + sha.getArea());
		System.out.println("sha ���� =" + sha2.getArea());

		// �߻�Ŭ���� �ƴ� ���� �޼ҵ� �������ؼ� ���� �͸�Ŭ����ó�� �� �� �ֳ�?
		// ����. �� �߻�޼ҵ� �����Ǹ� �ϸ� �͸�Ŭ������ ���� ��

		Animal snake = new Animal() {
			int length;

			@Override
			public void act() {
				setName("�Ƴ��ܴ�");
				setColor("���");
				length = 30;
				System.out.println("act :���ٴϱ�.");
				super.act();
			}

			@Override
			public String toString() {
				return "length= " + length;
			}
		};
		snake.act();
		System.out.println(snake);
	}

}
