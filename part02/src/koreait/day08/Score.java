package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;

	// 기본생성자가 숨어있음. 접근한정자는 public

	void setKorean(int korean) {
		this.korean = korean; // this= setKorean을 실행시키는 객체
		// 메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getScience() {
		return science;
	}

	int getKorean() {
		return korean;
	}

	void setEnglish(int english) {
		this.english = english;
	}

	int getEnglish() {
		return english;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

	String getGrade() {
		return grade;
	}

}
