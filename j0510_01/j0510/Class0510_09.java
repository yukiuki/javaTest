package j0510;

import java.util.Scanner;

public class Class0510_09 {
	public static void main(String[] args) {
//		10개의 숫자를 입력받아 합계를 출력하시오.
//		int num = 0;
//		int sum = 0;
//		
//		Scanner scan = new Scanner(System.in);	
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i+"번째 숫자를 입력하세요");
//			int input = scan.nextInt();
//			sum = sum+input;
//				System.out.println("합계"+sum);
//			i++;// 없으면 무한으로 돌음
//		}
//		
//		
//	교수님 답
		//		10개의 숫자를 입력반아 합계를 출력하시오.
		Scanner scan = new Scanner(System.in);
		//		1.변수선언
		int num = 0, sum = 0;
		int i = 0;
		//		반복문
		while(i<10) {
			//	2. 입력
			System.out.println("숫자를 입력하세요.");
			num = scan.nextInt();
			//	3.합계
			sum = sum + num;
			i++;
		}

//4. 출력
	System.out.println("합계"+sum);
	}

}
