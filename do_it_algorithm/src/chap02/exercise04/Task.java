package chap02.exercise04;

import java.util.Arrays;
import java.util.Scanner;

public class Task {

//	배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
//	static void copy(int[] a, int[] b)

//	[실행 결과]
//	a의 요솟수는: 3
//	a[0]: 1
//	a[1]: 2
//	a[2]: 3
//	b의 요솟수는: 2
//	b[0]: 4
//	b[1]: 5
//	배열 b의 모든 요소를 배열 a에 copy하였습니다.
//	a[0]: 1
//	a[1]: 2
//	a[2]: 3
//	a[3]: 4
//	a[4]: 5
	
//	[알고리즘]
//	void copy(int[] a, int[] b) {
//		int[] temp = new int[a.length + b.length] 
//		i: 0 1 a.length
//			temp[i] = a[i]
//		i: 0 1 b.length
//			temp[i + a.length] = b[i]
//		a = temp
//	}
	
//	배열은 길이가 달라지면 새로운 배열 객체를 생성해야한다.
//	?? 반복문을 돌리지 않고도 2개의 배열을 붙이는 방법은 없나 ??
	
	public static void copy(int[] a, int[] b) {
		
		int[] temp = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			temp[i + a.length] = b[i];
		}
		
		a = temp;
//		a = new int[a.length + b.length];
//		a = temp;

	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = 0;
		int[] a = null, b = null;
		
		System.out.print("a의 요솟수는: ");
		length = scan.nextInt();
		
		a = new int[length];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("b의 요솟수는: ");
		length = scan.nextInt();
		
		b = new int[length];
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		copy(a, b);
		
		System.out.println(Arrays.toString(a));
//		System.out.println("배열 b의 모든 요소를 배열 a에 copy하였습니다.");
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "]: " + a[i]);
//		}
		
		
	}

}
