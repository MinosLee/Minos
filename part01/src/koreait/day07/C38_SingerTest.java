package koreait.day07;

public class C38_SingerTest {

	public static void main(String[] args) {

		Singer twice = new Singer();
		twice.name_eng = "Twice";
		twice.name_kor = "Ʈ���̽�";
		twice.debutYear = 2015;
		twice.gerne = "kpop-GirlGroup";

		twice.members = new String[9];
		twice.members[0] = "���";
		twice.members[1] = "����";
		twice.members[2] = "����";

		System.out.println("twice members");
		twice.printMembers();
		System.out.println("Ȱ���Ⱓ :" + twice.actYears(2022) + "��");

		Singer beo = new Singer();
		beo.name_eng = "BE'O";
		beo.name_kor = "���";
		beo.gerne = "Hiphop";
		beo.printMembers();

		System.out.println(Singer.JOB + Singer.label);
		System.out.println(twice.toString());
		System.out.println(beo.toString());
		System.out.println(twice);
		System.out.println(beo);

	}

}