package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		

	}

}

class Product{
	int price;
	
	//디폴트 생성자 동작X
	
	public Product(int price) { //커스텀 생성자
		this.price= price;
	}
	
}

/*
class Food extends Product{ // subclass 는 무조건 superclass의 XXXX() 디폴트 생성자 실행(여기선 Product()) -> Food() 디폴트 생성자 실행
							// 디폴트생성자가 없으면 오류남. 디폴트생성자를 만들지 않을 것이라면 자식클래스도 커스텀 생성자를 만들어야 함.
}
*/

class Food extends Product{
	//Product()디폴트 생성자 실행하므로 없으면 오류
	//자식클래스도 커스텀생성자를 정의해서 부모클래스 커스텀생성자를 호출.
	public Food(int price) {
		super(price);
		
	}
}

class Electronics extends Product{ //Product() 디폴트 생성자 실행
	public Electronics(int price) {
		super(price); //product()디폴트 생성자 대신 커스텀 생성자 호출
	}
	
}



