package j0517;

import java.util.Scanner;

public class C0517_05 {
	
	public static void main(String[] args) {
		//3개위 수를 입력받아 , 평균 60점 이상이면 합격/ 불합격 출력하시오.
		// average()   return double
		
		Scanner scan = new Scanner(System.in);
		// 선언
		
		C0517_05 c1 = new C0517_05();
		int[] num = new int[3];
		//num[0]=0,num[1]=0,num[2]=0;
double result = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"숫자를 입력하세요.");
			num[i] = scan. nextInt();			
		}
			
				
		result = c1.average(num[0], num[1], num[2]);
		System.out.println("평균 : " +result);		
				
	}//main
	
	double average(int a,int b, int c) {
		double result = (a+b+c)/3.0;
		return result;
	}
		
}//class
