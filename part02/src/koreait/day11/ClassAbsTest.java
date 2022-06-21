package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {

		Person momo = new Person();
//		ClassAbs abs= new ClassAbs(); //오류 : ClassAbs는 추상클래스라 new를 못함.
		ClassAbs abs = new ClassX(); // 부모타입 참조
		ClassX cls = new ClassX(); // 구현 클래스 타입(자기 자신) 참조
		System.out.println("테스트 첫번째 : test 메소드 ");
		abs.test();
		cls.test();
		abs.name = "손흥민"; // name은 부모클래스 필드
		cls.name = "모모";
		abs.print(); // print() 부모클래스 메소드
		cls.print();

		System.out.println("테스트 두번째 : 자식필드 num");
//		abs.setNum(23); -> 안됨. 다운캐스팅 필요
		abs.test();
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX) abs; // -> 다운캐스팅
		x.setNum(100);
		abs.test();
	}

}
