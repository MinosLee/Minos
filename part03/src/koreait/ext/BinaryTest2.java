package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {

		int n10= 123;
		int n16= 0xa41c; //16진수표기- 0x로시작
		int n2= 0b1010010000011100; //2진수표기 - 0b로 시작
		
		System.out.println("1. 변수 그대로 출력");
		System.out.println("10진수 리터럴 123 : " + n10);
		System.out.println("16진수 리터럴 a41c : " + n16); //정수값 출력 포맷은 지정안하면 10진수로 나옴
		System.out.println("2진수 리터럴 1010010000011100 : " + n2);
		
		System.out.println("2. format 지정");
		System.out.println(String.format("16진수 리터럴 0xa41c : %x", n16));
		System.out.println(String.format("2진수 리터럴 0b1010010000011100 : %x", n2));
		System.out.println(String.format("10진수 리터럴 42012 : %x", 42012));
//결론 : 10진수는 42012, n16과 n2변수값이 메모리에 저장될때는 모두 동일한 0,1표현값임.
		
		//n16= 0xffffffff; //int는 4바이트
		//System.out.println(n16); -1
		System.out.printf("%x\n", -1);
		System.out.println("2진수 -1 : "+ Integer.toBinaryString(-1));
		
		System.out.println("3. 입력한 2진수 또는 16진수의 값을 10진수로 바꿔드립니다.");
		Scanner sc= new Scanner(System.in);
		System.out.print("2진수 값 입력>>>");
		String t2= sc.nextLine();
		System.out.print("16진수 값 입력>>>");
		String t16= sc.nextLine();
		
		System.out.println(String.format("2진수 %s 는 10진수  %d 입니다.", t2, Integer.parseInt(t2, 2)));
		System.out.println(String.format("16진수 %s 는 10진수  %d 입니다.", t16, Integer.parseInt(t16, 16)));
	}

}
