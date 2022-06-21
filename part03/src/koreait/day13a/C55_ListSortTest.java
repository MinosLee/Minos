package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListSortTest {

	public static void main(String[] args) {

		// ArrayList<String> name_list= new ArrayList<>();�� ����X
		// List�� �������̽�, ArrayList�� ����ü
		// ������: List�� ����Ÿ������ �Ͽ� ����.

		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();

		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort ���� : " + ilist);
		// ���� ��������
		ilist.sort(null);// ���ڷ� �ʿ��� ���� ����Comparator����ü �ʿ�
							// �⺻��, String�� null�� �� �� ����(�������� �⺻)

		System.out.println("sort ���� : " + ilist);
		ilist.sort(Comparator.reverseOrder());// �������� ����
		System.out.println("sort �������� : " + ilist);

		System.out.println("-------------------------------");
		System.out.println("1. Comparator �������̽� ��� sort");
		slist.add("Ʈ���̽�");
		slist.add("�����̰�");
		slist.add("�������");
		slist.add("�����");
		slist.add("�ҳ�ô�");
		slist.add("�극�̺�ɽ�");

		System.out.println("sort ���� : " + slist);
		slist.sort(null);
		System.out.println("sort ����(ascending= ASC�����) : " + slist);
		slist.sort(Comparator.reverseOrder());// �������� ����
		System.out.println("sort ��������(descending= DESC�����) : " + slist);
		/*
		 * ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
		 *  ���� ��ȯ���� �ʴ� ���� �������� : o1< o2 �������� : o1 > o2
		 */
		System.out.println("-------------------------------");

		List<Member> mlist = new ArrayList<>();

		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));

		System.out.println("Member ����Ʈ ����" + mlist);
//		mlist.sort(null);//Member��ü�� ���� �� ���� ��ü ��� ��-> �����ʿ�- �������̽��� ���ڷ� �����
		// ��� ��ü�� ��Ʈ: �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü�� ����.
		mlist.sort(new MemberAgeAscending());
		System.out.println("Member sort ����(ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("Member sort ����(DESC) : " + mlist);

		System.out.println("-------------------------------");

		System.out.println("Member ����Ʈ ����" + mlist);
		mlist.sort(new MemberNameAscending());
		System.out.println("Member sort ����(ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("Member sort ����(DESC) : " + mlist);

		System.out.println(" \n2. Comparable ����ϴ� Sort ");
		List<User> ulist= new ArrayList<User>();
		ulist.add(new User("���",23));
		ulist.add(new User("����",27));
		ulist.add(new User("����",25));
		ulist.add(new User("����",29));
		ulist.add(new User("����",26));
		ulist.add(new User("����",27));
		
		System.out.println("user ����Ʈ ����: " + ulist);
	//User�� ���� �� �ִ� Ÿ��: comparable ����ü	
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
