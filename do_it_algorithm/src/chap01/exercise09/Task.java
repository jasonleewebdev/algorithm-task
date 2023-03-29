package chap01.exercise09;

import java.util.Scanner;

public class Task {
//	두 변수 a, b에 정수를 입력하고
//	b - a를 출력하는 프로그램을 작성하세요.
	
//	[예시]
//	a값: 6
//	b값: 6
//	a보다 큰 값을 입력하세요!
//	b값: 8
//	b - a는 2입니다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		
//		1) do while문 사용 코드
//		System.out.print("a값: ");
//		a = scan.nextInt();
//		
//		do {					
//			System.out.print("b값: ");
//			b = scan.nextInt();
//		} while (a >= b);
//		
//		System.out.println("b - a는 " + (b - a) + "입니다.");
		
//		?? do while문을 사용하면 "a보다 큰 값을 입력하세요!"는 어떻게 출력할까 ??
		
//		2) while문 사용 코드
		System.out.print("a값: ");
		a = scan.nextInt();
		
		while(true) {
			System.out.print("b값: ");
			b = scan.nextInt();
			
//			내가 작성한 코드
//			if(a >= b) {
//				System.out.println("a보다 큰 값을 입력하세요!");
//			} else {
//				break;
//			}
			
//			답안 코드
			if(a < b) {
				break;
			}
			System.out.println("a보다 큰 값을 입력하세요!");
			
		}
		
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

}