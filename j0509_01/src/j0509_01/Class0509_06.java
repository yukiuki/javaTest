package j0509_01;

import java.util.Scanner;

public class Class0509_06 {
	public static void main(String[] args) {
//		int num = 5;
//		num = num+1;
//        System.out.println(num);
//		
//		int num1 = 5;
//		int result = ++num1;
//		System.out.println(result); //위와 같은 결과. num에 1을 더해 그 결과값을 result대입
//		
	   int num = 5;
//		int result2 = num2++;
//         System.out.println(result2);
//         
//		int result = ++num; //num 을 1을 더해서 그 결과 값을 result에 대입함.
		int result = num++; //result에 먼저 값을 대입한 후 num을 1을 더함.
		System.out.println(result);
		 
		String answer = (num>1)?"1보다 큽니다.":"1보다 작습니다.";
		System.out.println(answer);
		
//		1개의 정수형을 입력받아 10보다 큰 수 인지 출력하시오.
//	answer: 1. 변수 선언 2. 입력. 3. 확인 출력
		
		//1. 변수 선언
		int input = 0;
		//2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		String answer2 = (input>10)?"10보다 큽니다.":(input==10)?"10입니다.":"10보다 작습니다.";
		//3. 확인 출력
		System.out.println(answer2);
		
	}
}