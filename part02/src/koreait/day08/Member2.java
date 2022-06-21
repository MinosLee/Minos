package koreait.day08;

public class Member2 {
	private String name;
	private String email;
	private int age;
	private int level;

	public Member2(String name, String email) {
		this.name = name;
		this.email = email;
		System.out.println("name, email, age, level은 기본값입니다.");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}