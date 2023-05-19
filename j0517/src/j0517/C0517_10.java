package j0517;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class C0517_10 {


	public static void main(String[] args) {
		//3개의 숫자를 입력받아 작은수 부터 순차적으로 출력하시오.
		//calculate() 메소드를 만들어서 사용하시오.
		//10 5 25 -> 5 10 25
//
//		Scanner scan = new Scanner(System.in);
//		int [] arr = new int[3];
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println((i+1)+"숫자를 입력하세요.>>>>>>>");
//			arr[i] = scan.nextInt();
//
//		}
//
//		//배열 정렬
//		Arrays.sort(arr);
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println(arr[i]+ " ");
//
//		}
//		System.out.println();





		//			// 변수 만들기    === 유정
		//	        int[] num = new int[3];
		//	        for (int i = 0; i < num.length; i++) {
		//	            System.out.println((i + 1) + "번째 번호를 입력하세요");
		//	            num[i] = scan.nextInt();
		//	        }
		//	        
		//	        // calculate 메소드 호출하여 결과 출력
		//	        calculate(num);
		//	    }
		//
		//	    // calculate 메소드
		//	    public static void calculate(int[] num) {
		//	        int min = Math.min(Math.min(num[0], num[1]), num[2]);
		//	        int max = Math.max(Math.max(num[0], num[1]), num[2]);
		//	        int mid = num[0] + num[1] + num[2] - min - max;
		//
		//	        System.out.println("작은 수부터 순차적으로 출력: " + min + " " + mid + " " + max);
		//
		//	        





		// 변수 만들기   === 다혜
//		System.out.println("3개의 숫자를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//
//		calculate(num1, num2, num3);
//	}// main
//	public static void calculate(int num1, int num2, int num3) {
//		int min, mid, max;
//
//		if (num1 <= num2 && num1 <= num3) {
//			min = num1;
//			if (num2 <= num3) {
//				mid = num2;
//				max = num3;
//			} else {
//				mid = num3;
//				max = num2;
//			}
//		} else if (num2 <= num1 && num2 <= num3) {
//			min = num2;
//			if (num1 <= num3) {
//				mid = num1;
//				max = num3;
//			} else {
//				mid = num3;
//				max = num1;
//			}
//		} else {
//			min = num3;
//			if (num1 <= num2) {
//				mid = num1;
//				max = num2;
//			} else {
//				mid = num2;
//				max = num1;
//			}
//		}
//
//		System.out.println("작은 수부터 순차적으로 출력 : "+ min + " " + mid + " " + max);
//
//



		
			//3개의 숫자를 입력받아 작은수 부터 순차적으로 출력하시오.
			//calculate() 메소드를 만들어서 사용하시오.
			//10 5 25 -> 5 10 25

			Scanner scan = new Scanner(System.in);
			int [] arr = new int[3];

			for (int i = 0; i < 3; i++) {
				System.out.println((i+1)+"숫자를 입력하세요.>>>>>>>");
				arr[i] = scan.nextInt();

			}

			//배열 정렬
			calculate(arr);

			for (int i = 0; i < 3; i++) {
				System.out.println(arr[i]+ " ");

			}
			System.out.println();

	}//main
	
static void calculate(int[] arr) {
	
	int max = Math.max(Math.max(arr[0], arr[1]),arr[2]);
	int min = Math.min(Math.min(arr[0], arr[1]),arr[2]);
	int middle = (arr[0]+arr[1]+arr[2])-max-min;
	arr[0]=min;
	arr[1]=middle;
	arr[2]=max;
	
}
}//class
