package koreait.day07;

//C39
public class Student {

	int no;
	String name;
	int grade;
	Score score; // 다른 클래스 객체를 필드(구성요소)로 갖게 됨.

	// 인자로 전달받은 값을 전역변수에 대입
	void setData(String name, int grade) {
		this.name = name;
		this.grade = grade;

	}

	// 그냥 사용 앞으로 나갈 진도임.
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";// score는
																										// score.toString()
																										// // 임.

	}
}
