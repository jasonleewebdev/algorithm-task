package chap01.exercise07;

import java.util.Scanner;

// 1부터 10까지의 합은 (1 + 10) * 5 와 같이 구할 수 있습니다.
// 이를 '가우스의 덧셈'이라고 하는데 이 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하시오.

// [실행결과]
// 1부터 n까지의 합을 구합니다.
// n값: 5
// 1부터 5까지의 합은 15입니다.
public class SumGauss {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int n = 0;
		
//		1부터 2까지의 합 : (1 + 2) * (2 / 2)
//		1부터 3까지의 합 : ((1 + 3) * (3 / 2)) + ((1 + 3) *  1 / 2) => (1 + 3) * ( 3 / 2 ) => 4 * 1.5 = 
//		1부터 n까지의 합 : (1 + n) * (n / 2)
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		n = scan.nextInt();
		
		sum = (1 + n) * ((double)n / 2);
		
		System.out.printf("1부터 %d까지의 합은 %.0f입니다.", n, sum);
	}
}
