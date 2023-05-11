package j0510_01;

import java.util.Scanner;

public class Class0510_05 {
	public static void main(String[] args) {
//		1. 변수 선언 num1,num2,op 2. scan입력 3번 입력, 3. 비교(switch)	}
//      4. 결과 값 출력 - 더하기 결과값 :4
//		교수님 답안
		int num1=0,num2=0,result = 0;
		char op = ' ';
		
		Scanner scan = new Scanner(System.in);
        System.out.println("두개의 숫자를 연산합니다.");
        System.out.println("첫번째 숫자를 연산합니다.");
        num1 = scan.nextInt();
        System.out.println("두번째 숫자를 연산합니다.");
        num2 = scan.nextInt();
        System.out.println("연산자를 연산합니다.");
        op = scan.next().charAt(0);
        
//        
        switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;	
		}
        System.out.println("결과 값 : "+result);
		
		
		
//		String op = "";
//		int num1 = 0; //int num1=0,num2=0;
//		int num2 = 0;
//		int result = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		op = scan.next();
//		result = scan.nextInt();
//		System.out.println("결과 값 출력 - 더하기 결과값 = 4");
//		
//		switch(op) {
//		case "+":
//			result = num1 + num2;
//			System.out.println("더하기 결과 값");
//			break;
//		case "-":
//			result = num1 - num2;
//			System.out.println("빼기 결과 값");
//			break;
//		case "*":
//			result = num1 * num2;
//			System.out.println("곱하기 결과의 값");
//			break;
//		case "/":
//			result = num1 / num2;
//			System.out.println("나누기 결과의 값");
//			break;	
//		}
//			System.out.println("결과 값"5);
			
	
	
	}
	
}
