package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		// 현재시간 : 1초=1000ms, ns(1970년 1월 1일 기준으로 단위마다 카운트한 값)
		// 1일= 24시간 60분 60초

		int result = 24 * 60 * 60 * 1000;
		System.out.println("1일= " + result + "ms입니다");
		// int 범위 벗어나면 overflow가 나니. long으로 변환
		System.out.println("1년= " + 365L * result + "ms입니다");

		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1년= " + String.format("%15s", df.format(result)) + "ms입니다");
		System.out.println("1년= " + String.format("%15s", df.format(365L * result)) + "ms입니다");
		// String.format("%15s", ~)으로 하면 자리정렬위치를 맞출 수 있음.

		/*
		 * 날짜와 시간형식을 다루는 자바클래스를 연습합니다. 1)java.util.Date 클래스 2)java.util.Calendar 클래스-> 이
		 * 2개는 구버전 클래스 3) java 8 버전 java.time.LocalDate(날짜) , LocalTime(시간) ,
		 * LocalDateTime(날짜와 시간) 클래스 4) java.sql.Date클래스 - 데이터베이스 다룰 때 사용
		 */
		LocalDate currentDate = LocalDate.now(); // static메소드로 객체생성
		System.out.println("날짜확인" + currentDate);

		LocalTime currentTime = LocalTime.now();
		System.out.println("시간확인" + currentTime);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("시간확인" + current);

		// of()메소드로 특정시간 및 날짜 객체 생성
		LocalDate mybirth = LocalDate.of(1991, 8, 28);
		System.out.println("내 탄신일 확인" + mybirth);

		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("내 탄생 시간" + mybirth_time);

		// 새 버전 클래스는 날짜 사이의 간격 계산 클래스가 있음. (내가 태어난지 몇년 몇달 몇월 몇일 등)

		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난 지" + between.getYears() + "년(years)");
		System.out.println("내가 태어난 지" + between.getMonths() + "개월(months)");
		System.out.println("내가 태어난 지" + between.getDays() + "일(days)");

		System.out.println("내가 태어난 지 :" + ChronoUnit.DAYS.between(mybirth, currentDate) + "일");

	}

	// Duration 클래스
	// ChronoUnit 클래스

}
