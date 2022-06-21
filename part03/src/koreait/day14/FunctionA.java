package koreait.day14;
@FunctionalInterface //추상메소드가 하나만 가능.- 코딩에 도움을 주는 주석임.메소드 2개가 되지 말라고 넣어놓은 것임.
public interface FunctionA {
	int methodA(int a, int b);
//	void methodB();
}
//함수형 인터페이스 : 
//인터페이스 중에 *추상메소드가 1개인 것*은 다른 프로그래밍 언어에서 사용되는 함수 형식으로 표현할 수 있습니다.
//다른 프로그래밍 언어와 자바에서 (->)기호로줄여 씀. 람다식이라고도 부릅니다.가독성, 간결성을 위해서 사용합니다.

//추상메소드 이름은 중요하지 않음.
// 형식:리턴값, 인자(매개변수) 가 중요함

//자바엔 형식에 따라 사용가능한 여러 함수형 인터페이스가 있음: Consumer, Producer, Predicate