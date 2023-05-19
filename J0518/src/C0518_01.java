import java.util.Scanner;

public class C0518_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0 ;
		int i = 1 ;
		
		//5! = 5*4*3*2*1;
		//for문으로 헤보세요.
		
		
		
		//1. 1-10까지의 합을 구하세요.55
		for( i=1; i<=10; i++) {//위에 int i = 1 ; 설정으로 for문 int은 삭제 해야
			sum += i; //sum = sum+i;  
			System.out.println(i);
			System.out.println();

		}
		System.out.println("1-10까지 합  : " +sum);
		//2. 1-100까지 합을 구하세요.5050


		//3. 1-1000까지 합까지 구하세요.500500
		
		
		
		
		
		
	}//main

}//class
