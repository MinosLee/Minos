package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

		Student[] stus = new Student[5]; // 배열요소 5개는 참조값 저장. Student 객체(총 5개) 참조
		String[] names = { "이하니", "김모모", "박나연", "홍길동", "박지성" };
		stus[0] = new Student();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 3;

		// for문으로 나머지 4개 객체 생성 stus배열에 참조

		for (int i = 1; i < stus.length; i++) {
			stus[i] = new Student(); // 중요! 객체생성해서 참조시키기
			stus[i].name = names[i];
			stus[i].no = i + 1;
			stus[i].grade = 3;
		}

		for (int i = 0; i < stus.length; i++)
			System.out.println(stus[i]);

		// 각 생성된 Student 객체가 Score 객체를 필드로 갖도록 함.->Score 객체 3개 필드값 입력 실행
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].name + "점수 입력하세요");

			/*
			 * Score temp = new Score();// ****- temp를 안 쓸 수 있지만 알아보기 쉽게 쓴것임. temp.input();
			 * //korean, english, science 3개의 필드값이 저장되 있는 상태 stus[i].score = temp; // ****매우
			 * 중요 System.out.println(stus[i]); // 확인
			 */
			stus[i].score = new Score();
			stus[i].score.input();
			System.out.println(stus[i]);
			// Score temp 는 new score()이다.
			// temp 는 stus[i].score이다.
			// stus[i].score는 new Score()이다.
			// temp는 stus[i].score이기 때문에 temp.input()은 stus[i].score.input()이다.

		}
		System.out.println("[[성적 통계]]");
		System.out.printf("%8s %10s %8s %8s\n", "번호", "이름", "총점", "평균");
		for (int i = 0; i < stus.length; i++)
			System.out.printf("%4d %6s %8d %6.1f\n", stus[i].no, stus[i].name, stus[i].score.sum(),
					stus[i].score.average());
	}

}
