package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {

		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("---------------------------");
		System.out.println("사나\t1996.12.29\t27"); // 한개 문자열을 출력
		System.out.println("지효\t1997.02.26\t26");
		System.out.println("미나\t1998.03.24\t25");

		// printf() 메소드 사용해서 출력형식 지정.
		// 12칸 문자열+자리수 지정하지 않은 문자열+5칸 정수 + 줄바꿈
		// System.out.printf("%-12s%s%5d\n","zzuwi","1998.05.28",25);
		// %s는 지정된 칸에서 오른쪽으로 맞춤 , -기호는 왼쪽 맞춤으로 바꿔줌

		System.out.printf("%-8s%s%8d\n", "dahyeon", "1998.05.28", 25);
		System.out.printf("%-8s%s%8d\n", "momo", "1999.04.23", 24);
		System.out.printf("%-8s%s%8d\n", "nayeon", "1997.06.14", 27);

//연습 : 		System.out.printf("%-8s%s%8d\n","dahyeon","1998.05.28",25); 의 1998.05.28을 정수형식(데이터)으로 출력하도록 수정

		System.out.println("\n연습문제");
		System.out.printf("%-8s%4d.%02d.%02d%8d\n", "dahyeon", 1998, 05, 28, 25);
		// 여기까진 데이터를 직접 리터럴("momo"나 1998, true 등)로 표현해 출력했음

		System.out.printf("%-8s %5s %8s %5d\n", "이러면", "문자열로", "바꿀수 있네", 99);
		System.out.printf("%s\n", "이러면 println과 다름없지 않나");

//		 printf 메소드에서 형식문자 갯수만큼 뒤에 나오는 데이터 개수가 일치해야 함.
//       System.out.printf("%-8s%s%8d\n","nayeon","1997.06.14");면 뒤에 8d의 형식만큼 모자람
//       printf 메소드에서 형식문자와 뒤에 나오는 데이터 형식이 일치하지 않아도 오류 발생함.
//		 System.out.printf("%-8s%5d\n","nayeon","1997.06.14"); 라면 d(정수)가 "1997.06.14:"(문자열)과 일치되지 않음.		

		// 진도 방향: 변수(데이터를 저장하고 있는 기억장소 이름) 사용
		// System.out.printf("%-8s%4d.%02d.%02d%8d\n",name,year,month,day,age);

		/*
		 * 출력에 사용되는 형식 \(역슬래시) 사용하는 이스케이프 문자 : \n(줄바꿈), \t(tab) 형식지정문자 %기호 사용 : %s(문자열),
		 * %d(정수) 자리수를 지정해서 쓸 수 있음 ㄴ 남은 자리 0으로 채우고싶을 때는 %03d 와 같이 함. ""안에 있으면 문자열임. 정수로
		 * 인식X
		 */

	}

}
