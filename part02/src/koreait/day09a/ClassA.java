package koreait.day09a;

/*
 * Ŭ������ ���
 * -> Ŭ�������� �θ��ڽİ���
 * �θ�� ����Ŭ����(super), �ڴ� ����Ŭ���� ���谡 �������. ����ϴ� �θ� Ŭ������ ���� 1����.
 * -> �θ���Ŭ���� ������Ҹ� �ڽ��� ����� �� ����. ��ӵǴ� ��Ҵ� �ʵ�, �޼ҵ�
 * -> extends Ű���带 ����Ͽ� �θ�Ŭ���� ����.
 * -> private ���������ڴ� ��Ӿȵ�.
 * -> protected �� �ٸ� ��Ű���� Ŭ������ ��ӹ��� �� �ְ� ��.
 * 
 */

public class ClassA { // �θ�Ŭ����

	int ab;
	String name;
	protected String title; // protected�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���

	void print() {
		System.out.println("ab= " + ab);
		System.out.println("name= " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
