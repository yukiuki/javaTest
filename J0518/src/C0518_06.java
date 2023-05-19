import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		//국어 , 영어 , 수학, 입력받아 평군 점수 90점 이상 A, 80점 이상B,c,d,f

		Scanner scan = new Scanner(System.in);

		//		for(int i=0; i<3; i++) {
		//			int num = 0;
		//		
		//			System.out.println("점수를 입력하세요.");
		//			int num = scan. nextInt(); 
		//		}







		for(int i=0; i<3; i++) {
			int num = 0;

			System.out.println("점수를 입력하세요.");
			int kor = scan. nextInt();
			System.out.println("영어 점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입려하세요.");
			int math =scan. nextInt();

			int total = kor +eng+math;
			double avg = total/3.0;




			if(avg>=90) {
				System.out.println(" A 입니다!");
				if(avg>=97) {
					System.out.println("+");
				}else if(93<=avg) {
					System.out.println("-");
				}
			}else if (80<=avg){
				System.out.println(" B 입니다.");
			}else if(70<=avg) {
				System.out.println(" C 입니다.");
			}else if(60<=avg)
			{
				System.out.println(" D입니다.");
			}else {
				System.out.println(" F입니다.  ");
			}


		}


	}
}
