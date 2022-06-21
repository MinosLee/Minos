package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {
		// String 클래스의 split 메소드: 리턴타입이 String[]

		String temp = "모모 90 88 79";
		String[] result = temp.split(" "); // 공백을 기준으로 문자열을 여러개로 쪼개기
		System.out.println("1. 반복문 없이 출력");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);

		// for 문으로

		System.out.println("2. 일반적인 for문 출력");
		for (int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}

		// 향상 for문
		System.out.println("3. 향상된 for문 출력");
		for (String t : result)
			System.out.println("result 요소 : " + t);

		String temp2 = "모모,90,88,79";
		result = temp2.split(",");
		System.out.println("2. split 구분기호, ");
		for (String t : result)
			System.out.println("result요소 :" + t);

		temp2 = "모모,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split 구분기호, ");
		System.out.println(result.length);
		for (String t : result)
			System.out.println("result요소 :" + t);
		// result[1],result[3], result[5] 3개는 빈 문자열임.

		temp2 = "모모,,90,,88,,79";
		result = temp2.split(",,");// 구분기호 변경
		System.out.println("6. split 구분기호,, ");
		System.out.println(result.length);
		for (String t : result)
			System.out.println("result요소 :" + t);

		// split 의 인자인 문자열은 정규식 문자열(regex-regular expression) 임.(정규식 패턴은 복잡하고 어려움)
		// 정규식 예시 : []안에 표시하는 것은 문자 여러개가 또는(or) 에 해당함.

		temp2 = "모모,90 88()79";
		result = temp2.split("[ ,()]"); // 정규식 문자열 : 구분기호는 공백 또는 , 또는 ( 또는 )
		System.out.println("7. split 인자가 정규식");
		for (String t : result)
			System.out.println("result요소 :" + t);

		temp2 = "모모,90,88,79";
//		result = temp2.split(",", 2); 
		result = temp2.split(",", 6); // 정규식 문자열 : 구분기호는 공백 또는 , 또는 ( 또는 )
		System.out.println("8. split 두번쨰 인자 limit 확인");
		// limit은 리턴되는 배열의 크기. 단 쪼개지는 갯수보다는 커질 수 없음.
		System.out.println(result.length); // 6을 해도 4가 나옴. 한계가 4기 때문
		for (String t : result)
			System.out.println("result요소 :" + t);

		// 배열과 유사한 자료구조 : List
		// 배열을 List로 변환하는 방법
		System.out.println("9. result배열을 list로 객체 변경");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);

		// 위의 rlist는 배열의 크기만큼 list의 크기를 정적으로 생성(추가 삭제 변경 불가)
		// rlist.add("test"); 오류: 고정된 리스트
		// rilst.remove(2); 오류
		// rlist.add(2,"100"); 오류

		// 동적인 List로 만들기
		System.out.println("10. ArrayList의 인자가 있는 생성자 테스트");
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);

		List<Integer> ilist = Arrays.asList(1, 2, 6, 9, 100);
		System.out.println("11. Arrays.asList 활용");
		System.out.println(ilist);

	}

}
