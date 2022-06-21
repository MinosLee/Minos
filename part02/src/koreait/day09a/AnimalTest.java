package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("-------------------------");

		Dog dog = new Dog();
		dog.run();
		dog.print();// ��ӹ��� �޼ҵ�
		System.out.println("-------------------------");

		Crow crow = new Crow();
		crow.fly();
		crow.print();
		System.out.println("-------------------------");

		Animal temp = dog; // �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ���� ����.
		temp.print();
//		temp.run(); // �θ�Ÿ�� �����δ� �ڽ� �޼ҵ尡 ���� �ȵ�

		temp = crow;
		temp.print();

		System.out.println("-------------------------");

		Animal puppy = new Dog();
		puppy.print();
//		puppy.run();		//����: �θ�Ÿ�� ������ �ڽĸ޼ҵ� ����Ұ�

		((Dog) puppy).run(); // �̷��� ĳ���� �� �� �� ����.
		// ((Crow)puppy).print(); //

		Dog puddle = (Dog) puppy;// Animal Ÿ���� DogŸ������ casting �ϴ� ��.(�ڽ�Ŭ������ ����)

		puddle.run();
		puddle.print();
	}

}
