package j0510;

import java.util.Scanner;

public class Class0510_07 {
	public static void main(String[] args) {
		//랜덤 숫자
//		random  = (int)(Math.random()); //0.0~0.999999999999999999....
//		double random = 0;
//		random  =Math.random(); //0.0~0.999999999999999999....
//		int random = 0;
//		random  = (int)(Math.random()*3)+1; //0.0~0.999999999999999999....
//		System.out.println(random);
//		double random = 0;
//		random = Math.random()*1;
//		System.out.println(random);
//		random = Math.random()*10;
//		System.out.println(random);
//		random = Math.random()*8+1;
//		System.out.println(random);
		
//		
//		랜덤 숫자
//		System.out.println((int)(Math.random()*10)+1);
//		 숫자를 입력받아 같은 값일 경우 당첨 그렇지 않으면 꽝 출력하시오.
		int random = (int)(Math.random()*10)+1;//1,2,3
		int input = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if(input==random) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		System.out.println("랜덤숫자: "+random);
		System.out.println("입력숫자: "+input);
		
	}

}
