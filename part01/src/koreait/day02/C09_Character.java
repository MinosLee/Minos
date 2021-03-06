package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;

		// 둘다 a로 출력
		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);

		// 문자코드 정수값 출력 -> int로 캐스팅 :둘다 97로 출력
		System.out.printf("c1= %d\n", (int) c1);
		System.out.printf("c2= %d\n", (int) c2);// char형은 %d로 출력이 불가능함

		// 문자코드 정수값을 출력하고싶다면 int로 캐스팅하면 됨
		c1 = (char) (c1 + 1); // 덧셈연산 가능. 연산결과 대입할 때는 casting 필요
		System.out.println("c1= " + c1);

		c1++; // ++dustksdms c1= c1+1, char형에서는 casting도 함
		System.out.println("c1= " + c1);

		// 한글문자 테스트 : 한글문자코드는 10진수 값을 44032~55203, 16진수(2진수) ac00~d7a3
		char h1 = '가';
		char h2 = 44032;
		char h3 = '\uac00'; // \\u는 16진수 유니코드, ac00은 16진수 '가' 값

		System.out.println("h1= " + h1);
		System.out.println("h2= " + h2);
		System.out.println("h3= " + h3);

		System.out.printf("h1= %d\n", (int) h1);
		System.out.printf("h2= %d\n", (int) h2);
		System.out.printf("h3= %d\n", (int) h3);

		h1++;
		System.out.println("h1= " + h1);

		h1++;
		System.out.println("h1= " + h1);

		// 한글 마지막문자
		char h4 = 55203; // 10진수 표현방법
		char h5 = '\ud7a3'; // 16진수 표현, 힣
		System.out.println("h4= " + h4);
		System.out.println("h5= " + h5);

		h4++; // 해당되는 모양의 문자가 없음. ?표시
		System.out.println("h4= " + h4);

		h5--;// 힢
		System.out.println("h5= " + h5);
		System.out.println('H' + 'e' + 'l' + 'l' + 'o'); // 각 문자 코드의 값을 더한 결과가 나옴
		// hello 를 출력하고싶다면 char의 배열로 처리해야 함.

	}

	// char이 모여 한줄로 나란히 세운다면 문자열이 됨.

}

/*
 * 데이터 기본형식 : 문자형 char 문자데이터를 저장하는 2 바이트 형식. 정수값 0~65535 범위 저장도 가능. 컴퓨터에서 다루는
 * 문자는 문자코드로 처리되는데 코드는 정수값임 문자데이터는 ''기호를 사용. ('' 안에는 문자 1개만 가능)
 * 
 * 영문, 숫자, 특수문자는 ASCII코드로 표현됨. 영문자, 숫자, 특수문자 외의 다국어 문자는 문자를 처리하는 인코딩방식에 따라 문자코드
 * 값이 다름. 국제화 인코딩으로 utf-8방식을 많이 사용함.
 * 
 * 
 * 간: ㄱ ㅏ ㄴ (초성, 중성, 종성 각각에 코드값으로 조합하는 조합형)
 * 
 * utf-8 = 한글에서 나올 수 있는 모든 초성 중성 종성의 모든 표현을 만들어 각각 코드값을 부여하는 완성형
 */