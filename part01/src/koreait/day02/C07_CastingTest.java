package koreait.day02;

public class C07_CastingTest {
//참고 : 자바프로그램은 파일명과 클래스명이 같아야 함.
	public static void main(String[] args) {
		// 대입문: 오른쪽 값(리터럴)/수식/변수가 왼쪽 변수로 대입.
		// 수식에 사용되는 연산
		// 산술연산(+-*/ 등, %나눗셈 나머지) ,
		// 관계연산(== 동등, !=같지 않음, <, >, <=, >=),
		// 논리연산(%%and, ||or, !not)
		// 참교 : ++, --, +=, -=, *=, /= 과 같은 증감연산자, 축약연산자 진도 예정

		// 정수형식 연산은 보통int를 씀

		int a = 123, b = 13;
		double c = 10.34; // 실수형을 정수형으로 변환한다면 소수점 아래 버림.

		// 연산에 사용되는 피연산자(현재 123과 13)가 모두 정수이면 결과는 정수임
		// 연산에 사용되는 피연산자중 하나가 정수, 하나가 실수라면 결과는 실수임
		// -> 연산 결과를 변수에 저장할 때 데이터 형식을 고려함.

		int isum;
		double dsum;

		isum = a + b;
		dsum = a + c;

		System.out.println("a+b= " + isum);
		System.out.println("a+c= " + dsum);

//		isum= a+c;// 결과가 실수이므로 정수형식 변수에 저장이 불가능함: 오류
		// 꼭 해야한다면 강제로 형변환(casting)을 하면 됨.
		isum = a + (int) c;// c변수의 실수값을 정수로 변환(소숫점 아래 버림)

		System.out.println("a+(int)c= " + isum);

		b = 10;
		System.out.println("a/b=" + (a / b)); // 정수끼리 나누면 결과 정수
		System.out.println("a/b=" + (a % b)); // 정수끼리 나누기의 나머지

		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);

//		강제 형변환(캐스팅) 예시: 정수끼리 나눗셈결과를 실수로 구하는 처리조건일 때
//		-> 정수 1개를 실수로 변환

		System.out.printf("%d / %d = %f\n", a, b, (double) a / b); // 실수형식문자 %f, 기본 소수점 이하 6자리
		System.out.printf("%d / %d = %.2f\n", a, b, (double) a / b);// %.숫자f 하면 소숫점 숫자자리 까지 나옴

		double test = 12.3456789123456789;
		System.out.println("test=" + test);
		System.out.println("test=" + test);

	}

}
