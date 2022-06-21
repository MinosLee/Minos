package koreait.day07;

//C37
public class Singer {
	/*
	 * 클래스를 정의하는 것은 현실의 데이터를 처리하기 위한 형식을 지정
	 */
	// Singer 객체가 만들어질때마다 다른 값: 인스턴스 필드
	String gerne;// 장르
	String name_eng;
	String name_kor;
	int debutYear;
	String[] members; // 그룹일경우 멤버이름 저장

	static final String JOB = "연예인";
	static String label = "※"; // Singer에게는 모두 동일한 라벨 표시

	void printMembers() {
		if (members == null)
			System.out.println("그룹이 아닌 솔로 가수 입니다.");
		else
			for (int i = 0; i < members.length; i++) {
				if (members[i] != null)
					System.out.println((i + 1) + ":" + members[i]);
			}
	}

	int actYears(int year) {// 활동기간 계산

		return year - debutYear + 1;

	}

	@Override
	public String toString() {
		return "Singer [gerne=" + gerne + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutyear="
				+ debutYear + "]";
	}

}
