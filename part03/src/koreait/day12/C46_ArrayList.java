package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {

		int[] datas = { 45, 23, 7, 21, 19, 11, 44 }; // �迭�� ������ �� �迭�� ũ�⸦ ����.
														// �迭�� �⺻�� ������ Ÿ��(int double long�� ) �� �ܴ� ������ Ÿ��.

		ArrayList<Integer> list = new ArrayList<>();
		// ArrayList�� ũ�Ⱑ ������
		// ������ Ÿ���� ������Ÿ�Ը� ����. �⺻���� ����Ŭ������ ���.
		// <E>�� Ÿ���� ǥ���ϴ� ����.(���ʸ� Ÿ��(generic)=(��� Ÿ���� ����Ʈ�� ���� �� �ִٴ� ����)�̶�� �θ�), ������ �����
		// Ÿ���� �����ִ� ���̱⵵ ��.
		// ����Ʈ�� ��� �����͸� ���(Element)��� ��
		// �ֿ� �޼ҵ� add, get, size, remove

		String[] names = { "����", "���", "�ź�", "����", "����" };
		ArrayList<String> name_list = new ArrayList<>();

		// ArrayList�� ������ �߰��� add()�޼ҵ�
		list.add(45);
		list.add(7);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);

		System.out.println("1. ù ��° ArrayList<Integer>���");
		System.out.println(list);
		System.out.println("����(�迭) :" + Arrays.toString(datas) + ",�迭ũ��:" + datas.length);
		System.out.println("����Ʈ�� ũ�� :" + list.size());

		name_list.add("����");
		name_list.add("���");
		name_list.add("����");
		name_list.add("����");
		System.out.println("2. �� ��° ArrayList<String> ���");
		System.out.println(name_list);
		System.out.println("����Ʈ�� ũ��:" + name_list.size());

		System.out.println("3. Ư�� ��ġ�� ������ �߰�");
		list.add(1, 23);
		System.out.println("add(1,23) ���" + list);
		name_list.add(2, "�ź�");
		System.out.println("add\"�ź�\" ���:" + name_list);

		System.out.println("4. �迭ó��index������ ������ ��������");
		System.out.println("get(3) :" + list.get(3));
		System.out.println("get(3) :" + name_list.get(3));

		System.out.println("5. Ư�� ��ġ�� ������(���) ����");
		list.remove(4);
		System.out.println("remove(4) ���" + list);
		name_list.remove(4);
		System.out.println("remove(4) ���" + name_list);

		System.out.println("6. Ư�� �� ��ġ �˾Ƴ���");
		System.out.println("�迭" + Arrays.binarySearch(names, "�ź�"));
		System.out.println("����Ʈ: " + name_list.indexOf("�ź�"));

		System.out.println("7. 6���� ���� ������ for������ �Ѵٸ�?");
		System.out.println("�迭");
		int i;
		for (i = 0; i < names.length; i++)
			if (names[i].equals("�ź�"))
				break;
		System.out.println("'�ź�'�� �ε��� :" + i);
		System.out.println("����Ʈ");
		for (i = 0; i < name_list.size(); i++)
			if (name_list.get(i).equals("�ź�"))
				break;
		System.out.println("'�ź�' �� �ε��� :" + i);

		// '�ź�' ��Ұ� �������� �� lastIndexOf �޼ҵ�� ������ ��ġ ��� �˻�����.

	}

}

/*
 * �迭 : ���� ���� �����͸� �����ϴ� ��� �÷���(Collections): �ڷᱸ��. ���� ���� �����͸� ����(�б� ����)�ϴ� ���̰�,
 * ������ Ư¡�� ���� �����ϴ� ���̰� ����. �����͸� ����, ���� ���� �˰����� �޼ҵ�� �����Ǿ� ����. �� ArrayList Ŭ���� ��
 * HashMap Ŭ����
 * 
 * 
 */
