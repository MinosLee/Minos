package koreait.day08;

//작성자: 이민호
public class Member {

	private String name;
	private String email;
	private int age;
	private int level;

	public Member(String name, String email) { // 괄호 안에 있는 것은 실행할 때 전달받을 인자
		this.name = name;
		this.email = email;
		System.out.println("name, email, age, level은 기본값입니다.");
	}

	public Member() {
		System.out.println(" name =" + this.name); // this는 메소드를 실행하는 객체
		System.out.println(" age =" + this.age);
	}

	/*
	 * public Member(String name){ this.name=name; }
	 * 
	 * Public Member(String email){ this.email=email; } 이게 안되는 이유는 타입과 인자 갯수를 가지고
	 * 구별이 되어야 메소드 오버로딩 오류! 2개 동시정의 불가
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public int getLevel() {
		return level;
	}

}
