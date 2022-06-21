package koreait.day11.test;

public class AnimalTest5 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[8] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();

		for (Animal temp : animals)
			if (temp != null) {
				temp.act();

			}

		// 현재시간 : ms nt 1970 1월 1일 자정을 기준으로 카운트
		System.out.println("현재시간......");
		System.out.println(System.currentTimeMillis() + "ms");
		System.out.println(System.nanoTime() + "nt");

		// 개구리가 몇마리인지.... instanceof 개구리일때만 카운트
		int cnt = 0; // 카운트 변수
		long start = System.nanoTime();
		System.out.println("개구리 먹이주기.......");
		for (Animal temp : animals) {
			if (temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100 * (cnt + 2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("개구리 먹이 주는데 걸린 시간" + (end - start) + "nt");
		System.out.println("개구리는" + cnt + "마리 살고 있습니다.");

		// 강아지가 몇마리인지 ..... instanceof 대신 type필드 이용하여 만들기. 먹이주기
		start = System.nanoTime();
		System.out.println("강아지 먹이주기.......");
		cnt = 0;
		for (Animal temp : animals) {
			if (temp != null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("맛있는 간식"));
			}
		}
		end = System.nanoTime();
		System.out.println("강아지는 " + cnt + "마리가 살고 있습니다.");
		System.out.println("강아지 먹이 주는데 걸린 시간" + (end - start) + "nt");

		System.out.println("까마귀에게 먹이주기........");
		System.out.println(animals[6].eat(animals[3]));

	}

}

class Frog extends Animal { // 개구리

	protected String mouth; // 디폴트 한정자+ 다른 패키지 자식클래스

	public Frog() {
		System.out.println("새로운 동물가족은 Frog입니다.");
		type = Animal.FROG;
	}

	public void jump() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}

	@Override
	public void act() {
		System.out.println("Animal행동 : 하루종일 점프하기");
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
		System.out.println("새로운 동물가족은 Cat입니다.");
		type = Animal.CAT;

	}

	public void sound() {
		setName("고양이");
		setColor("하얀색");
		System.out.println("특징 : 야옹야옹");
	}

	@Override
	public void act() {
		System.out.println("하루종일 야옹야옹 울기");

	}

	@Override
	public String eat(Object object) {

		return null;
	}

}
