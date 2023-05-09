package j0509_01;

import java.util.Scanner;

public class Class0509_10 {
	public static void main (String[] args) {	
		
	// int 인경우ㅡ10000

//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000;
//		System.out.println(result);
		
		
	//double 인경우 1000.0
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0; //1000.0 = 1000d
//		System.out.println(result);	
//		
   //     double num = 564.124586 소수점 3자리 절사 2자리까지 존재		
//		double num = 564.124586;
//		double result = (int)(num*100)/100.00; 
//		System.out.println(result);	
		
//	실수 소수점자리 7자리 까지 입력받아, 소수점 4자리까지만 출력하시오.

		double num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 소수점자리 7자리 까지 입력받아, 소수점 4자리까지만 출력하시오");
		num= scan.nextDouble();
		double result = (int)(num*10000)/10000.0;
		System.out.println(result);

		

		
		
	}
}
