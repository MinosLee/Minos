package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;

	// �⺻�����ڰ� ��������. ���������ڴ� public

	void setKorean(int korean) {
		this.korean = korean; // this= setKorean�� �����Ű�� ��ü
		// �޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
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
