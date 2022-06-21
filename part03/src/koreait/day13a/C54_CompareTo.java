package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
		// 모든 객체(Object 상속)엔 CompareTo 메소드가 있음.- 값의 비교메소드

		String na = "kim";
		String you = "momo";
		String he = "Son";

		System.out.println("kim과 momo 비교 :" + na.compareTo(you)); // -2
		System.out.println("kim과 son 비교: " + na.compareTo(he));// 24 아스키코드 차이

		int a = 12, b = 45;
		System.out.println("a-b :" + (a - b));

		Integer aa = 12;
		Integer bb = 45;
		System.out.println("aa와 bb :" + aa.compareTo(bb));// -1 aa<bb
		aa = 90;
		System.out.println("90과 45" + aa.compareTo(bb));// 1 aa>bb
		aa = 45;
		System.out.println("45와 45" + aa.compareTo(bb)); // 0 aa==bb

		// compareTo 와 같은 비교는 sort(정렬)에 사용
		// 정렬은 오름차순, 내림차순 2가지 방법으로 가능.

	}

}
