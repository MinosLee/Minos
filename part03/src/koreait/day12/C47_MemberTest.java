package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		// Member[] members= new Members[10]; 과 같음.
		ArrayList<Member> list = new ArrayList<>(); // 리스트에 저장되는 것은 객체의 참조값.

		list.add(new Member("모모", 27)); // 새로운 객체를 생성하고, 참조값을 리스트에 추가
		Member member = new Member("다현", 26);
		list.add(member);
		list.add(new Member("나나", 20));
		list.add(new Member("신비", 22));

		System.out.println("현재 list의 요소 갯수:" + list.size());
		System.out.println("1. 전체 리스트 출력");
		System.out.println(list);
		// list.get(i) 하면 Member객체의 참조값을 가져 옴
		System.out.println("2. list의 요소중 age 필드값이 25이하인 것만 출력"); // for 문?

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge() <= 25)
				System.out.println("i=" + i + "," + list.get(i));
		}

		System.out.println("3. '나나'는 몇번 인덱스에서 참조하고 있는 객체인가?");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("나나") && list.get(i).getAge() == 20)
				System.out.println("i=" + i + "," + list.get(i));

		}
		// 리스트 요소가 여러개의 필드를 갖는 객체이면 필드값 비교하는 equals 예제임.

		System.out.println("4. 참고");
		// indexOf는 사용 불가. indexOf는 String, 기본형 래퍼클래스만 추가적 기능 구현 없이 사용가능

		System.out.println("Member객체로 indexOf 실행 " + list.indexOf(new Member("나나", 20)));
		// -1 못찾음.(이유: 참조값이 같은 것을 찾는 것인데 이것을 필드값 비교에서 찾도록 바꿔주는 작업이 필요함.

		System.out.println("Member객체로 indexOf실행 " + list.indexOf(member));// 1

	}

}
