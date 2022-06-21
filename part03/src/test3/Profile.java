package test3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ProF> profile = new ArrayList<>();

		String na, cr, sel;
		int no;

		boolean menu = true;

		
		while (menu) {
			System.out.println("����� �����ϼ���-> 1. profile����� 2. ������ �˻� 3. ��ü ������ ��� 4. ���� �̷º� ��ȸ 5. ���α׷� ������");
			sel = sc.nextLine();
			switch (sel) {
			case "1":
				System.out.println("Profile����⸦ �����ϼ̽��ϴ�.");
				System.out.println("�̸��� �Է����ּ���");
				na = sc.nextLine();
				System.out.println("�����̷��� �ۼ����ּ���");
				cr = sc.nextLine();
				System.out.println("���˴ܰ�� ��� �ǳ���?");
				no = Integer.parseInt(sc.nextLine());

				ProF temp = new ProF(na, cr, no);
				profile.add(temp);

				break;

			case "2":
				System.out.println("������ �˻��� �����ϼ̽��ϴ�.");
				System.out.println("�������� �̸��� �Է����ּ���.");
				na = sc.nextLine();

				for (ProF p : profile)
					if (p.getName().equals(na))
						System.out.println("�����ڴ� " + p);

				break;

			case "3":
				all(profile);

				break;

			case "4":
				System.out.println("�˻��� ���� �ܰ�� ��� �˴ϱ�? (1~3)");
				no = Integer.parseInt(sc.nextLine());
				number(profile, no);

				break;

			case "5":
				menu = false;
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~5�� �Է����ּ���.");
			}

		}
		System.out.println("���α׷��� �����մϴ�");

	}

	private static void number(List<ProF> profile, int no) {
		for (ProF p : profile)
			if (p.getNum() == no)
				System.out.println("���� �ܰ躰 ������ ����Դϴ�" + p);

	}

	private static void all(List<ProF> profile) {
		profile.sort(new Comparator<ProF>() {

			@Override
			public int compare(ProF o1, ProF o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println(String.format("%-20s %-20s\t %10s", "�̸�", "���˸�", "���˴ܰ�"));
		System.out.println("-----------------------------------------------------");
		for (ProF p : profile) {
			System.out.println(String.format("%-20s %-20s\t %10d", p.getName(), p.getCrime(), p.getNum()));
		}
	}

}
