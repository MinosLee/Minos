package koreait.day13a;

public class User implements Comparable<User> {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(User o) { // 현재객체의 age와 인자값 age 비교
		Integer o1 = this.age;
		Integer o2 = o.getAge();

		return o1.compareTo(o2);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	// 객체를 직접 비교할수 있는 상태로 만드는 것 Comparable
	// 비교기준 내용과 방법을 정렬에 적용한 것이 comparator

}
