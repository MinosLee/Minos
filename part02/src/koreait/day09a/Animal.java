package koreait.day09a;

public class Animal {

	private String name;
	private String color;

	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다."); // 자식 객체 생성될 때 부모클래스 생성자 먼저 실행.
	}

	public void act() {
		System.out.println("Animal 행동 : 아직 모름(Unknown)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("name: " + name + ",Color: " + color);
	}

	// Object 설명하고 작성한 메소드임.
	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}

	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}

}
