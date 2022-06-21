package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListSortTest {

	public static void main(String[] args) {

		// ArrayList<String> name_list= new ArrayList<>();로 선언X
		// List는 인터페이스, ArrayList는 구현체
		// 다형성: List를 참조타입으로 하여 선언.

		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();

		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort 이전 : " + ilist);
		// 정렬 오름차순
		ilist.sort(null);// 인자로 필요한 것은 비교자Comparator구현체 필요
							// 기본형, String은 null로 할 수 있음(오름차순 기본)

		System.out.println("sort 이후 : " + ilist);
		ilist.sort(Comparator.reverseOrder());// 내림차순 정렬
		System.out.println("sort 역순이후 : " + ilist);

		System.out.println("-------------------------------");
		System.out.println("1. Comparator 인터페이스 사용 sort");
		slist.add("트와이스");
		slist.add("오마이걸");
		slist.add("아이즈원");
		slist.add("비비즈");
		slist.add("소녀시대");
		slist.add("브레이브걸스");

		System.out.println("sort 이전 : " + slist);
		slist.sort(null);
		System.out.println("sort 이후(ascending= ASC라고함) : " + slist);
		slist.sort(Comparator.reverseOrder());// 내림차순 정렬
		System.out.println("sort 역순이후(descending= DESC라고함) : " + slist);
		/*
		 * 리턴식은 음수값이 나오는 경우를 씁니다. 교환하지 않는 경우를 -1(음수)로 리턴되게 합니다.
		 *  각각 교환하지 않는 경우는 오름차순 : o1< o2 내림차순 : o1 > o2
		 */
		System.out.println("-------------------------------");

		List<Member> mlist = new ArrayList<>();

		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));

		System.out.println("Member 리스트 상태" + mlist);
//		mlist.sort(null);//Member객체는 비교할 수 없는 객체 라고 함-> 비교자필요- 인터페이스를 인자로 줘야함
		// 멤버 객체의 소트: 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체를 만듦.
		mlist.sort(new MemberAgeAscending());
		System.out.println("Member sort 상태(ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("Member sort 상태(DESC) : " + mlist);

		System.out.println("-------------------------------");

		System.out.println("Member 리스트 상태" + mlist);
		mlist.sort(new MemberNameAscending());
		System.out.println("Member sort 상태(ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("Member sort 상태(DESC) : " + mlist);

		System.out.println(" \n2. Comparable 사용하는 Sort ");
		List<User> ulist= new ArrayList<User>();
		ulist.add(new User("모모",23));
		ulist.add(new User("나나",27));
		ulist.add(new User("나연",25));
		ulist.add(new User("다현",29));
		ulist.add(new User("수니",26));
		ulist.add(new User("제니",27));
		
		System.out.println("user 리스트 상태: " + ulist);
	//User는 비교할 수 있는 타입: comparable 구현체	
		ulist.sort(null);
		System.out.println("user sort(ASC): " + ulist);
		
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DECS): " + ulist);
		

		ulist.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		
		System.out.println("user sort(name ASC : "+ ulist);
		
	}

}
