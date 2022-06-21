package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("-------------------------");

		Dog dog = new Dog();
		dog.run();
		dog.print();// 상속받은 메소드
		System.out.println("-------------------------");

		Crow crow = new Crow();
		crow.fly();
		crow.print();
		System.out.println("-------------------------");

		Animal temp = dog; // 자식 객체는 부모클래스 타입으로 참조 가능.
		temp.print();
//		temp.run(); // 부모타입 변수로는 자식 메소드가 실행 안됨

		temp = crow;
		temp.print();

		System.out.println("-------------------------");

		Animal puppy = new Dog();
		puppy.print();
//		puppy.run();		//오류: 부모타입 변수로 자식메소드 실행불가

		((Dog) puppy).run(); // 이렇게 캐스팅 할 수 도 있음.
		// ((Crow)puppy).print(); //

		Dog puddle = (Dog) puppy;// Animal 타입을 Dog타입으로 casting 하는 것.(자식클래스만 가능)

		puddle.run();
		puddle.print();
	}

}
