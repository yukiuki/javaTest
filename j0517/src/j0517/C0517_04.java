package j0517;

import java.util.Scanner;

public class C0517_04 {

	int result;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//3개의 숫자를 입력받아 가장 큰수를 출력하세요.
		//numMax 메소드를 만들어 사용하세요




		//1-1	
		//		C0517_04 C0517_04 = new C0517_04();
		//		int[] num = new int[3];
		//		for (int i = 0; i < num.length; i++) {
		//			System.out.println((i+1)+"번째 번호를 입력하세요>>>");		
		//			num[i] = scan. nextInt();
		//		}
		//		int result = C0517_04.numMax(num[0], num[1], num[2]);
		//		System.out.println("가장 큰수를 출력합니다. " +result);
		//1-1
		//10,5,25

		int max=0;
		//		int num1=10,num2=5,num3=25;

		while(true) {
			//			System.out.println("첫번째 숫자를 입력하세요.>>");
			//			num1 =scan.nextInt();
			//			System.out.println("두번째 숫자를 입력하세요.>>");
			//			num2 =scan.nextInt();
			//
			//		
			//			System.out.println("두개의 숫자 중 큰수 : "+Math.max(num1, num2));
			//			//2-1
			int min=0;
			//		int num1,num2,num3=0;


			System.out.println("첫번째 숫자를 입력하세요.>>");
			int num1 =scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요.>>");
			int num2 =scan.nextInt();
			System.out.println("세번째 숫자를 입력하세요.>>");
			int num3 =scan.nextInt();

			System.out.print("세개의 숫자 중 작은 수 :   "+ Math.min(Math.min(num1, num2), num3)+"\n");
			System.out.println();

			
			//다름 메소드 호출방법
			//참조변수명.메소드명 - 매개 변수는 같아야 함.
			int result = C0517_04.max(1,num1, num2,num3);
int resurt2 = C0517_04.min(2,num1,num2,num3);
System.out.println("3개의 수의 최대 값 : ");
System.out.println("3개의 수의 최소 값 : ");
//메소드 리턴타입과 retuen 변수는 타입이 같아야함.
int max (int check, int a, int b, int c)


		}//while

		//5,10,25
		//		if(num1>num2) {
		//			if(num1>num3) {
		//				max= num1;
		//			}else{
		//				max =num3;
		//			}
		//				if(num2>num3) {
		//					max =num2;
		//				}else {
		//					max =num3;
		//				}
		//				
		//삼항식
		////			max = (num1>num2)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);
		//
		//			//Math.Max()
		//			max = Math.max(Math.max(num1, num2), num3);


	}//main





	//1-1-1
	int numMax(int num1, int num2, int num3) {

		int max;
		if(num1>num2 & num1>num3) {
			max = num1;
		}else if (num2>num3 & num2>num1){
			max = num2;
		}else {
			max = num3;
		}

		return max;	
	} //int
	//2-1
	int numMin(int num1, int num2, int num3) {

		int min;
		if(num1<num2 & num1<num3) {
			min = num1;
		}else if (num2<num3 & num2<num1){
			min = num2;
		}else {
			min = num3;
		}

		return min;	
	} //int
}//class
