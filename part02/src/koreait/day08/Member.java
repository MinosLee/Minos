package koreait.day08;

//�ۼ���: �̹�ȣ
public class Member {

	private String name;
	private String email;
	private int age;
	private int level;

	public Member(String name, String email) { // ��ȣ �ȿ� �ִ� ���� ������ �� ���޹��� ����
		this.name = name;
		this.email = email;
		System.out.println("name, email, age, level�� �⺻���Դϴ�.");
	}

	public Member() {
		System.out.println(" name =" + this.name); // this�� �޼ҵ带 �����ϴ� ��ü
		System.out.println(" age =" + this.age);
	}

	/*
	 * public Member(String name){ this.name=name; }
	 * 
	 * Public Member(String email){ this.email=email; } �̰� �ȵǴ� ������ Ÿ�԰� ���� ������ ������
	 * ������ �Ǿ�� �޼ҵ� �����ε� ����! 2�� �������� �Ұ�
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
