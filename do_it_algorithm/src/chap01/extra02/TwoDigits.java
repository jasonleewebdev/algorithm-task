package chap01.extra02;

import java.util.Scanner;

public class TwoDigits {

//	2자리의 양수를 입력받는 프로그램입니다.
	
//	[실행 결과]
//	2자리의 양수를 입력하세요.
//	no값: 5
//	no값: 105
//	no값: 57
//	변수 no값은 57이 되었습니다.
	
	public static void main(String[] args) {
		
//		[결론]
//		반복문의 계속 조건이 복잡하다면 !(종료 조건)을 사용해본다.
//		드모르간의 법칙 : 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면, 원래의 조건과 같다.
		
//		10 <= 변수 <= 99
		
		Scanner scan = new Scanner(System.in);
		int no = 0;
		
		System.out.println("2자리의 양수를 입력하세요.");
		
		do {
			System.out.print("no값: ");
			no = scan.nextInt();
			
//		[내가 작성한 코드]	
		} while(no < 10 || no > 99);
		
//		[답안 코드]
//		} while(!(no >= 10 && no <= 99));
			
		System.out.println("변수 no값은 " + no + "이 되었습니다.");
		
	}
	
}
