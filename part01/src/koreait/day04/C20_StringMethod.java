package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {

		String message = "hello~"; // String �� ��Ű���� java.lang. (�⺻ ��Ű�� Ŭ����)

		// string Ŭ������ �޼ҵ�� ����. �� �ܿ�� ����ϴ� ���� �ƴ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� �����.
//		message.length(); //public int length() : ����
//		message.charAt(0); //public char charAt(int index)

//		message.contentEquals("Hello~"); //public boolean contentEquals(CharSequence cs) , object�� ��� Ÿ��
		// message�� String Ÿ���̹Ƿ� Object�� String���� �ؼ���.

		int len = message.length();
		char temp = message.charAt(3); // 0���� �����ؼ� 0 1 2 3 �����ڰ� �������� return
		boolean isState = message.equals("Hello~"); // ���ڿ��� ������ ��.

		System.out.println("Length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello~\") = " + isState);

		// ���ϰ� ������?
		message.indexOf('e'); // public int indexOf(int ch)
		message.indexOf("lo"); // public int indexOf(int ch)

		message.substring(2); // public String substring(int beginIndex)
		message.substring(2, 4); // public String substring(int beginIndex)

		message.replace("11", "*@"); // public String replace(CharSequence target, CharSequence replacement)
// �޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���� ������ ���� ���� ���� ������ ������ �ٸ��� ���ǵ� ��.

		System.out.println("indexOf('e'=)=" + message.indexOf('e')); // 1����ġ
		System.out.println("indexOf(\"lo\"=)" + message.indexOf("lo"));// 3����ġ
		System.out.println("indexOf(\"ol\"=)" + message.indexOf("ol"));// -1 : ã�� ���ڿ��� ���� ��
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\"=)" + test.indexOf("lo"));
		System.out.println("test.lastindexOf(\"lo\"=)" + test.lastIndexOf("lo"));

		System.out.println("substring(2)=" + message.substring(2));// �κ����� : llo
		System.out.println("substring(2,4)" + message.substring(2, 4));// ll, 2������ 2��(4-2)
		System.out.println("replace(\"ll\",\"*@\") =" + message.replace("ll", "*@"));// ġȯ:he*@o~
		System.out.println("startsWith(\"H\")=" + message.startsWith("H"));// H�� �����ϴ°�
		System.out.println("endsWith(\"~\")=" + message.endsWith("~"));// ~�� �����°�

	}

}
