package koreait.ext;

public class BinaryOp {

	public static void main(String[] args) {
		
		//2진수의 비트연산 : &, |, ^, ~, >>, << 등. 간단히 테스트해보기
		int data= 0b0101110100100110;
		
		System.out.println("1. ~(비트 반전) 연산자"); //참고: !연산은 true와 false를 반대로(단 !는 논리연산임)
		System.out.println(String.format("%32s : ", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s : ", Integer.toBinaryString(~data)));
		
		
		System.out.println("2. >> 오른쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data>>2), data>>2));
		// >>1 은 나누기 2 와 같음.
		
		System.out.println("3. << 왼쪽 쉬프트 연산(왼쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data<<1), data<<1));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data<<2), data<<2));
		// >>1 은 곱하기 2 와 같음.
		
		data= -2345;
		System.out.println("4. 음수값 >> 오른쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data>>2), data>>2));
		// 정수 32비트의 맨 왼쪽 비트는 부호표시. 오른쪽 쉬프트 연산에서 왼쪽에 추가되는 비트는 부호비트와 같음.
		//참고: 오른쪽 쉬프트를 할 때 부호와 상관 없이 왼쪽에 추가되는 비트를 0으로 해야 될 떈 >>>연산으로 함.
		
		System.out.println("5. >>> 오른쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data>>>2), data>>>2));
		
		byte n= 0xffffffff; //32비트가 모두 1
		data= 100;
		//참고: 논리연산 and 는 참 and 참 일때만 결과가 참이고, 논리연산 or 는 거짓 or 거짓 일 때만 결과가 거짓임
		//비트 연산 and 는 1&1일 때만 결과가 1이고, 비트연산 or 는 0 or 0 일때만 결과가 0
		System.out.println("\n6-1. & 는 bit and 연산");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(n), n));
		System.out.println("-----------------------------------------------");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data&n), data&n));// 결과값 100
		
		System.out.println("\n7-1. ㅣ 는 bit or 연산");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(n), n));
		System.out.println("-----------------------------------------------");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data|n), data|n));// 결과값 -1
		
		n=0;
		System.out.println("\n6-2. & 는 bit and 연산");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(n), n));
		System.out.println("-----------------------------------------------");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data&n), data&n));	//결과값 0
		
		System.out.println("\n7-2. | 는 bit or 연산");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(n), n));
		System.out.println("-----------------------------------------------");
		System.out.println(String.format("%32s %d : ", Integer.toBinaryString(data|n), data|n));	//결과값 100
		
		
	}

}
