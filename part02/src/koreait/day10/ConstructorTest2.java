package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

	}

}

class Product2 {
	int price;

	// superclass�� ����Ʈ ������ �����ؼ� subclass�� ����� �� �ֵ��� ��.
	public Product2() {

	}

	public Product2(int price) { // Ŀ���� ������
		this.price = price;
	}

}

/*
 * class Food extends Product{ // subclass �� ������ superclass�� XXXX() ����Ʈ ������
 * ����(���⼱ Product()) -> Food() ����Ʈ ������ ���� // ����Ʈ�����ڰ� ������ ������. ����Ʈ�����ڸ� ������ ����
 * ���̶�� �ڽ�Ŭ������ Ŀ���� �����ڸ� ������ ��.
 * 
 * }
 */

class Food2 extends Product2 {

}

class Electronics2 extends Product2 { // Product() ����Ʈ ������ ����

	public Electronics2(int price) {
		super(price); // �θ�Ŭ���� Ŀ���һ����� ����
	}

}
