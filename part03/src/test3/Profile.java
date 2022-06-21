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
			System.out.println("기능을 선택하세요-> 1. profile만들기 2. 범죄자 검색 3. 전체 범죄자 기록 4. 범죄 이력별 조회 5. 프로그램 끝내기");
			sel = sc.nextLine();
			switch (sel) {
			case "1":
				System.out.println("Profile만들기를 선택하셨습니다.");
				System.out.println("이름을 입력해주세요");
				na = sc.nextLine();
				System.out.println("범죄이력을 작성해주세요");
				cr = sc.nextLine();
				System.out.println("범죄단계는 어떻게 되나요?");
				no = Integer.parseInt(sc.nextLine());

				ProF temp = new ProF(na, cr, no);
				profile.add(temp);

				break;

			case "2":
				System.out.println("범죄자 검색을 선택하셨습니다.");
				System.out.println("범죄자의 이름을 입력해주세요.");
				na = sc.nextLine();

				for (ProF p : profile)
					if (p.getName().equals(na))
						System.out.println("범죄자는 " + p);

				break;

			case "3":
				all(profile);

				break;

			case "4":
				System.out.println("검색할 범죄 단계는 어떻게 됩니까? (1~3)");
				no = Integer.parseInt(sc.nextLine());
				number(profile, no);

				break;

			case "5":
				menu = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 1~5를 입력해주세요.");
			}

		}
		System.out.println("프로그램을 종료합니다");

	}

	private static void number(List<ProF> profile, int no) {
		for (ProF p : profile)
			if (p.getNum() == no)
				System.out.println("범죄 단계별 범죄자 목록입니다" + p);

	}

	private static void all(List<ProF> profile) {
		profile.sort(new Comparator<ProF>() {

			@Override
			public int compare(ProF o1, ProF o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println(String.format("%-20s %-20s\t %10s", "이름", "범죄명", "범죄단계"));
		System.out.println("-----------------------------------------------------");
		for (ProF p : profile) {
			System.out.println(String.format("%-20s %-20s\t %10d", p.getName(), p.getCrime(), p.getNum()));
		}
	}

}
