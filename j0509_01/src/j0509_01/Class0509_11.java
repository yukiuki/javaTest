package j0509_01;

import java.util.Scanner;

public class Class0509_11 {
	public static void main(String[] args) {
//실수를 입력 받아 소수점 4자리에서 올림해서 출력하시오.
		double num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		num = scan.nextDouble();
		//반올림 round(), 올림 ceil(), 버림floor()
		double result = Math.ceil(num*1000)/1000.0;
	    System.out.println(result);
	    
	
		
		
		
		
		
		
		// 소수점 5자리를 입력 받아 3자리 에서 반올림해서 출력하시오.		
//		double num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 5자리를 입력 받아 3자리 에서 반올림해서 출력하시오.");
//		num = scan.nextDouble();
//		double result = Math.round(num*100) / 100.0;
//		System.out.println(result);
//		
//		
		
		// 소수점 4자리에서 반올림 출력하시오.
//		double pi = 3.141592;
//		double result = Math.round(pi* 1000)/ 1000.0;	
//		System.out.println(result);

		
		//double pi = 3.7894; 소수점 2자리에서 반올림해서 출력하시오.
//		 double pi = 3.7894;
//	     double result = Math.round(pi * 10)/ 10.0;//소수점 2자리 이기 때문에 10
//	     System.out.println(result);
		
		
		
		
	}

}
