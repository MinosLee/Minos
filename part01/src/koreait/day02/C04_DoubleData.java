package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {

		System.out.println("Float 실수데이터-----------");
		System.out.println("메모리 크기: " + Float.BYTES + "바이트");
		System.out.println("Float 실수의 최소값" + Float.MIN_VALUE);// 1.4E-45 = 1.4x 10의 -45승임
		System.out.println("Float 실수의 최대값" + Float.MAX_VALUE);// 3.4028235E38 = 3.4의 10의 38승

		System.out.println("Double 실수데이터-----------");
		System.out.println("메모리 크기: " + Double.BYTES + "바이트");
		System.out.println("Double 실수의 최소값" + Double.MIN_VALUE);// 4.9E-324 = 4.9 x 10의 -324승
		System.out.println("Double 실수의 최대값" + Double.MAX_VALUE);// 1.7976931348623157E308= 1.79의 10으ㅢ 308승

	}

}
/*
 * 실수데이터는 컴퓨터 구조에서 부동소수점 형식으로 다룸. ex) 1.23x 10의 23승 에서 1.23(가수)과 23(지수)을 각각 어떤
 * 크기만큼 할당하냐에 따라 값의 표현범위와 정밀도가 결정됨. 값의 표현범위와 정밀도(가수부 소수점이 float는 7자리, double은
 * 16자리)가 결정됨. 실수 데이터 기본 형식 : float ,double Wrapper 클래스는 Float, Double 1.234
 * 리터럴은 double 형식입니다.
 */
