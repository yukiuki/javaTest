package j0517;

public class C0517_06 {

	import java.util.Scanner;

	public static void main(String[] args) {
		//3개위 수를 입력받아 , 평균 60점 이상이면 합격/ 불합격 출력하시오.
		// average()   return double  ->String

		Scanner scan = new Scanner(System.in);

		C0517_06 c1 = new C0517_06();
		int[] num = new int[3];
		//num[0]=0,num[1]=0,num[2]=0;
		String result = "";

		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"숫자를 입력하세요.");
			num[i] = scan. nextInt();	

		}//3번만  - 10,20,30


		result = c1.average(num[0], num[1], num[2]);
		System.out.println("합격여부 : " +result);		

	}//main

	String average(int a,int b, int c) {
		String result ="";
		if() {

		}
		return result;
	}

}

