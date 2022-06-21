package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {

		boolean result;

		result = 10 > 5;
		System.out.println("10>5결과 :" + result);

		System.out.println("9 != 9 결과 : " + (9 != 9));
		System.out.println("9 == 9 결과 : " + (9 == 9));

		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		System.out.println(" false and true = " + (false && true)); // 데드코드인 이유= 아래 2개의 논리식은 첫째 값이 거짓이기때문에 두번쨰 값은 의미 없다는
																	// 말임.
		System.out.println(" false and false = " + (false && false));

		System.out.println("논리연산 결과 확인하기 : or");
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not true = " + !true); // true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);

		int korean; // 국어점수
		int math; // 수학 점수

		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수 입력 ->");
		korean = sc.nextInt();
		System.out.println("수학점수 입력 ->");

		math = sc.nextInt();

		// 국어점수와 수학점수 모두 80점 이상인가? - 모범학생

		System.out.println("모범학생 ? " + (korean >= 80 && math >= 80));

		// 국어점수 또는 수학점수 중 90점 이상이 있는가? - 특기학생
		System.out.println("특기학생 ? " + (korean >= 90 || math >= 90));

		// 국어점수가 20~80이 아닌(not) 학생들은? -> 특이한 학생
		System.out.println("특이한 학생? " + !(korean >= 20 && korean <= 80));
		System.out.println("특이한 학생? " + (korean < 20 || korean > 80));

		sc.close();

	}

}

/*
 * 데이터의 기본 형식 : Boolean 은 true또는 false 값을 가짐. (Boolean 래퍼 클래스가 있음) 관계연산 ==(동등,
 * 같음), !=(같지 않음), >, <, >=, <= 이 연산의 결과 값은 boolean 형식임 논리연산(&&and, ||or, !not)의
 * 결과값도 boolean 형식
 * 
 * 참고 : if 나 for에서 필요한 조건식엔 관계연산이 사용됨.
 * 
 * 
 */