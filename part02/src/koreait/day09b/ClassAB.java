package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	// ���� �� Ŭ������ �ʵ�, �޼ҵ� ��� �޾ҳ� Ȯ�� - ClassA�� private default ���������� ��Ҵ� ��� ������.

	public void test() {
//		System.out.println("*name = "+ name); //name �ʵ� ���������ڴ� ����Ʈ: �ٸ���Ű������ ������.	
		title = "momo";
		System.out.println("title= " + title);

	}

}
