package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {
//char 배열의 특징 및 문자열과의 연관된 내용 파악하기!
	// - char형은 2바이트 정수를 저장하여 문자(모양)를 표현한다.

	public static void main(String[] args) {

		// char배열의 선언
		char[] carr1 = { 'i', 'a', 'm', ' ', 'j', 'a', 'v', 'a' };
		char[] carr2 = new char[20]; // 지정해주지 않으면 기본 초기값은 0
		System.out.println("[[[char배열 테스트 - 1]]]");
		System.out.println("char1 : " + Arrays.toString(carr1));
		System.out.println("char2 : " + Arrays.toString(carr2));
		System.out.println("carr1 배열길이(크기) :" + carr1.length); // 8
		System.out.println("carr2 배열길이(크기) :" + carr2.length); // 20

		System.out.println("carr1 배열 3번째 데이터의 값(정수) :" + (int) carr1[2]); // 값? 'm' 109
		System.out.println("carr2 배열 3번째 데이터의 값(정수) :" + (int) carr2[2]); // 값? ' ' 0

		System.out.println("[[[char배열 테스트 - 2]]]");
		System.out.println("1. for 문으로 출력");
		for (int i = 0; i < carr1.length; i++) {
			System.out.println("carr1[" + i + "]의 데이터 값 :" + carr1[i]);
		}

		System.out.println("\n2. for문으로 출력_");
		for (int i = 0; i < carr1.length; i++) {
			System.out.print(carr1[i]);

		}

		System.out.println("\n3. 배열이름(참조형변수) 출력");
		System.out.println(carr1);

		// 위의 2번 for 문과 동일한 결과- 정수형배열과 다르게 문자열 참조변수처럼 동작함.

		String msg = "iam java";
		System.out.println(msg);

		System.out.println("[[[char배열 테스트 - 3]]]");
		System.out.println("\n4. 문자열을 배열로 변경");
		// carr2= "hello hi goodbye"; // char배열에 바로 문자열 대입을 하는것은 오류가 뜸
		carr2 = "hello hi goodbye".toCharArray(); // 스트링 문자열 객체를 char로 변환

		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length :" + carr2.length); // 배열의 크기가 커짐

		carr2 = "hello hi goodbye hi goodbye".toCharArray(); // 문자열이 선언된 배열 크기보다 크다.
		System.out.println(carr2);
		System.out.println("carr2.length :" + carr2.length); // 배열의 크기가 커짐

		String temp = String.valueOf(carr2); // char[]배열을 문자열로 변환. toCharArray()과 반대의 기능을 함

		// 참고 : String.valueOf 메소드는 여러가지 매개변수 형식을 다룸(메소드 overloading)

		System.out.println("String.valueOf(carr2) :" + String.copyValueOf(carr2));
		System.out.println("String.valueOf(carr2) :" + temp);
	}

}
