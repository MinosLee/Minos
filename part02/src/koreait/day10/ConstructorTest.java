package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		

	}

}

class Product{
	int price;
	
	//����Ʈ ������ ����X
	
	public Product(int price) { //Ŀ���� ������
		this.price= price;
	}
	
}

/*
class Food extends Product{ // subclass �� ������ superclass�� XXXX() ����Ʈ ������ ����(���⼱ Product()) -> Food() ����Ʈ ������ ����
							// ����Ʈ�����ڰ� ������ ������. ����Ʈ�����ڸ� ������ ���� ���̶�� �ڽ�Ŭ������ Ŀ���� �����ڸ� ������ ��.
}
*/

class Food extends Product{
	//Product()����Ʈ ������ �����ϹǷ� ������ ����
	//�ڽ�Ŭ������ Ŀ���һ����ڸ� �����ؼ� �θ�Ŭ���� Ŀ���һ����ڸ� ȣ��.
	public Food(int price) {
		super(price);
		
	}
}

class Electronics extends Product{ //Product() ����Ʈ ������ ����
	public Electronics(int price) {
		super(price); //product()����Ʈ ������ ��� Ŀ���� ������ ȣ��
	}
	
}



