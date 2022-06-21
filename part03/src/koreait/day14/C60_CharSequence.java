package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {
	// ㄴ 인터페이스 이름임
	public static void main(String[] args) {

		String result = new String(); // result= "test"; result= new String("test");
		System.out.println("result :" + result);

		System.out.println("1. String 타입 테스트");
		for (int i = 2; i < 6; i++) {
			// 문자열 내용이 바뀌면 문자열 객체의 위치도 바뀜.
			result += i + "/"; // result= result+(i+"/");
			System.out.println("result :" + result);
		}

		StringBuffer sb = new StringBuffer(); // StringBuilder와 함께 많이 사용되는 클래스
		System.out.println("2. StringBuffer타입 테스트");
		for (int i = 2; i < 6; i++) {
			// StringBuffer객체의 문자열 내용이 바뀌어도 기존 객체에 추가되는 동작.
			// 반복되는 연결 연산이 많은 경우 String?X StringBuffer?O 버퍼가 더 효율적임
			sb.append(i).append(":");// 문자열 연결 연산+ 와 같은 동작
			System.out.println("sb :" + sb);
		}

		// CharSequence 인터페이스 사용: contains메소드의 매개변수타입
		// boolean java.lang.String.contains(CharSequense s)
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contains 메소드 확인");
		System.out.println("contains(result)" + sample.contains(result)); // 2/3/4/5가 포함되어있는가? //true
		System.out.println("contains(sb)" + sample.contains(sb)); // 2:3:4:5가 포함되어있는가 ? //false

		// 메소드의 형식 또는 다른 여러 형식들을 확인할 때
		// 1) 클래스인지 인터페이스인지
		// 2) 인터페이스일 때 구현체는 무엇인가?

		// 참고 : ArrayList- (순서를 가지고 인덱스를 저장) 선언할 떄 변수선언 List 인터페이스 타입으로 함.
		// List<String> 구현체
		List<String> names = new ArrayList<>();
		names = new Vector<>();

		// HashMap - (순서가 없고 인터페이스 타입으로 저장) 선언할 때 변수선언 Map 인터페이스 타입으로 함.
		Map<String, Integer> map = new HashMap<>(); // 객체 생성시 제너릭 타입 생략가능
		map = new TreeMap<String, Integer>();

	}

}
