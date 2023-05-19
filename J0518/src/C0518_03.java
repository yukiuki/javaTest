import java.util.Scanner;

public class C0518_03 {


	public static void main(String[] args) {
		//Scanner - 입력받을 때만 쓴다.
		Scanner scan = new Scanner(System.in);
		//숫자
		//	int num = scan.nextInt();
		//	//nextLine();
		//	String str = scan.next();
		//	double d = scan.nextDouble();
		//	
		//숫자 2개를 입력받아 1,10 -> 

		System.out.println("숫자를 입력하세요.");
		int num = scan. nextInt();
		System.out.println("숫자를 입력하세요.");
		int num2 = scan.nextInt();//10
		
		//if
		int temp=0;
		if(num>num2){
			temp = num;
			num = num2;
			num2 = temp;
			
		}
		


		//1,10 -> 1부터 10까지의 합을 구하시오.
		int sum = 0;
		for(int i= num; i<=num2;i++) {
			sum += i;


		}

		System.out.println("1-10까지의 합계  :"+ sum);

	}

}
