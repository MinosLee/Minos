package koreait.day04;

import java.util.Scanner;


public class C21_StringEx2 {
//작성자 강화민
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		String domain = "gmail.com";
		String account;
		
		System.out.print("사용할 이메일을 입력하세요: ");
		email = sc.nextLine(); //키보드 입력을 문자열로 처리
		
		if(!(email.indexOf("@") == email.lastIndexOf("@")) || (email.indexOf("@") == -1)) {//@가 한 개 포함되어있는지 확인
			System.out.println("메시지: 이메일 형식이 아닙니다.");
			isValid = false;
		}
		else {
			if(!(domain.equals(email.substring(email.indexOf("@") + 1)))) {//@뒤가 gmail.com인지 확인
				System.out.println("메시지: 도메인 이름이 틀립니다.");
				isValid = false;
			}
			else {
				account = email.substring(0,email.indexOf("@")); //계정이름 추출
				System.out.println(account);
				if(account.length() < 6) { //계정이름 길이는 6이상
					System.out.println("계정이름은 6글자 이상이어야 합니다.");
					isValid = false;
				}
				else if(account.indexOf("$") != -1) {
					System.out.println("특수문자 $는 사용불가능합니다.");
					isValid = false;
				}
				else if(account.indexOf("%") != -1) {
					System.out.println("특수문자 %는 사용불가능합니다.");
					isValid = false;
				}
			}
		}
		if(isValid == false) {
			System.out.println("유효하지 않은 계정입니다.");
		}
		else {
			System.out.println("유효한 계정입니다.");
			System.out.println("이메일: " + email);
		}
	}

}
/*  구글 이메일 계정을 체크하는 기능 구현 
 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
 *  		ㄴ indexof 가 -1이 아니고 indexof 와 lastindexof 가 같은 값인가?
 *  
 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
 *  		ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝(length()-1)까지 substring 추출한 문자열을 equals 비교
 *  
 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
 *  		ㄴ '@' 의 indexof 를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
 *  
 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
 *  		ㄴ 3번의 문자열이 length() 값 6인지 비교
 *  
 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
 *   		ㄴ indexof('$') , indexof('%') 가 모두 -1이 아니면 허용안하는 기호 포함
 */


