package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

	}

}

class Product2 {
	int price;

	// superclass의 디폴트 생성자 정의해서 subclass가 사용할 수 있도록 함.
	public Product2() {

	}

	public Product2(int price) { // 커스텀 생성자
		this.price = price;
	}

}

/*
 * class Food extends Product{ // subclass 는 무조건 superclass의 XXXX() 디폴트 생성자
 * 실행(여기선 Product()) -> Food() 디폴트 생성자 실행 // 디폴트생성자가 없으면 오류남. 디폴트생성자를 만들지 않을
 * 것이라면 자식클래스도 커스텀 생성자를 만들어야 함.
 * 
 * }
 */

class Food2 extends Product2 {

}

class Electronics2 extends Product2 { // Product() 디폴트 생성자 실행

	public Electronics2(int price) {
		super(price); // 부모클래스 커스텀생성자 실행
	}

}
