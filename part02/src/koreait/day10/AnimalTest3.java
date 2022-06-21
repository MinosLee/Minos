package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];

		animals[0] = new Frog();
		animals[1] = new Cat();
		animals[5] = new Dog();
		animals[7] = new Frog();
		animals[8] = new Crow();

		for (Animal temp : animals) { // 배열에서 순서대로 하나씩 꺼내오기
			System.out.println(":::::::::::");
			if (temp != null) {
				Cat cat;
				Dog dog;
				Frog frog;
				Crow crow;
				if (temp instanceof Cat) {
					cat = (Cat) temp; // 다운캐스팅 : animal 진짜 객체에 따라 오류 또는 오류없음이 뜸. -> instanceof 조건식 필요
					cat.sound();
				}
				if (temp instanceof Dog) {
					dog = (Dog) temp;
					dog.run();
				}
				if (temp instanceof Frog) {
					frog = (Frog) temp;
					frog.jump();
				}
				if (temp instanceof Crow) {
					crow = (Crow) temp;
					crow.fly();
				}

				temp.act(); // 재정의 된 메소드가 있다면 그 재정의 메소드로 실행
				temp.print();
			} else {
				System.out.println("null 참조입니다.");
			}
			System.out.println(":::::::::::");
		}

	}

}
