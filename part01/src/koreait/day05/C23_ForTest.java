package koreait.day05;

public class C23_ForTest {

	public static void main(String[] args) {

		// ���ɹ��� �ݺ�1
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");

		// ���ɹ��� �ݺ�2
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");

//		for(�����ʱⰪ;�������ǽ�;������)		//������ loop counter(�ݺ��� Ƚ���� �����ϴ� ����)
		for (int i = 0; i < 5; i++) { // i�� for() �ȿ��� �����ϸ� for������ ����Ҽ� �ֽ��ϴ�.(for { }�� ��������)
			// i�� 0���� 4���� ����Ǹ鼭 �����մϴ�.
			System.out.println("��ο� !"); // i=0 , 0<5 �� -> ��� ���� -> i++
			System.out.println(i);
			System.out.println("////////"); // i=1 , 1<5 �� -> " -> i++
		} // i=2, 2<5 �� -> " -> i++
			// :
			// i=5, 5<5 ���� -> for����
		System.out.println("---------------------------");
		// �ٸ� ����
		for (int i = 0; i < 10; i += 4) // �����?
			System.out.println("hello!!!!!");

		System.out.println("---------------------------");
		for (int i = 0; i < 0; i++) // �����?
			System.out.println("��ο�!!!!!");

		System.out.println("---------------------------");
		for (int i = 3; i > 0; i--) {
			System.out.println("��ο� !");
			System.out.println(i);
			System.out.println("////////");
		}
		System.out.println("---------------------------");

		// ���ǽİ� �������� ���ߴ� ������ ���°��-->���ѷ���(�ݺ�), �������� �ʿ�

		// �� ���ɹ��� �ݺ�2�� for�� ����غ�����.

		for (int i = 0; i < 5; i++)
			System.out.println("Hello(" + (i + 1) + ")");

	}

}