package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {

		String message = "hello~"; // String 의 패키지는 java.lang. (기본 패키지 클래스)

		// string 클래스의 메소드는 많음. 다 외우고 사용하는 것이 아닌 메소드의 이름, 인자, 리턴형식을 참조해서 사용함.
//		message.length(); //public int length() : 길이
//		message.charAt(0); //public char charAt(int index)

//		message.contentEquals("Hello~"); //public boolean contentEquals(CharSequence cs) , object는 모든 타입
		// message가 String 타입이므로 Object는 String으로 해석함.

		int len = message.length();
		char temp = message.charAt(3); // 0부터 시작해서 0 1 2 3 번문자가 무엇인지 return
		boolean isState = message.equals("Hello~"); // 문자열이 같은지 비교.

		System.out.println("Length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello~\") = " + isState);

		// 리턴값 형식은?
		message.indexOf('e'); // public int indexOf(int ch)
		message.indexOf("lo"); // public int indexOf(int ch)

		message.substring(2); // public String substring(int beginIndex)
		message.substring(2, 4); // public String substring(int beginIndex)

		message.replace("11", "*@"); // public String replace(CharSequence target, CharSequence replacement)
// 메소드 오버로딩(overloading) : 메소드 이름과 리턴 형식은 같고 인자 값의 갯수와 형식이 다르게 정의된 것.

		System.out.println("indexOf('e'=)=" + message.indexOf('e')); // 1번위치
		System.out.println("indexOf(\"lo\"=)" + message.indexOf("lo"));// 3번위치
		System.out.println("indexOf(\"ol\"=)" + message.indexOf("ol"));// -1 : 찾는 문자열이 없을 때
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\"=)" + test.indexOf("lo"));
		System.out.println("test.lastindexOf(\"lo\"=)" + test.lastIndexOf("lo"));

		System.out.println("substring(2)=" + message.substring(2));// 부분추출 : llo
		System.out.println("substring(2,4)" + message.substring(2, 4));// ll, 2번부터 2개(4-2)
		System.out.println("replace(\"ll\",\"*@\") =" + message.replace("ll", "*@"));// 치환:he*@o~
		System.out.println("startsWith(\"H\")=" + message.startsWith("H"));// H로 시작하는가
		System.out.println("endsWith(\"~\")=" + message.endsWith("~"));// ~로 끝나는가

	}

}
