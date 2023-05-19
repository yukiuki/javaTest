
package j0517;

import java.util.Scanner;

public class Class0517_02 {
	public static void main(String[] args) {
		Class0517_02 c1= new Class0517_02();
		int num1 = 10;
		int num2 = 5;



		// 객체선언
		//클래스면 참조 변수명  = new 클래스명();
		//Card c1 = new Card();
		// 두수를 입력 받아 더하기 결과 값을 출력하시오.
		//	1-1	
		Scanner scan = new Scanner(System.in);
		//		System.out.println("첫번째 번호를 입력하세요.>>");
		//		num1 = scan.nextInt();
		//		System.out.println("두번째 번호를 입력해주세요.>>");
		//		num2 = scan.nextInt();
		//
		//   1-2
		int[] num  = new int[2];
		for(int i=0; i<2;i++) {

			System.out.println((i+1)+"번째 번호를 입력하세요.");
			num[i] = scan.nextInt();

		}
		int result = c1.add(num[0], num[1]);
		System.out.println("두수의 더하기 : "+ result);		

		int result2 = c1.sub(num[0], num[1]);
		System.out.println("두수의 빼기 : "+ result2);
		
		int result3 =c1.multi(num[0],num[1]);
		System.out.println("두개의 곱하기 : "+result3);
		
		int result4 = c1.div(num[0], num[1]);
		System.out.println("두개의 나누기 : "+result4);

		
	}//main

	//더하기 메소드
	int add(int num1, int num2) {

		int result = num1+ num2;

		return result;
	}

	//빼기 메소드 sub
	int sub(int num1, int num2){
		int result2 = num1-num2;
		return result2;

	}

	//곱하기 매소드 multi
	int multi(int num1, int num2) {
		int result3 = num1*num2;
		return result3;
	}

	// 나누기 메소드 div
	int div(int num1, int num2) {
		int result4 =num1%num2;
		return result4;
	}




}//class
