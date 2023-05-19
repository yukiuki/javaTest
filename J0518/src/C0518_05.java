import java.util.Scanner;

public class C0518_05 {
	public static void main(String[] args) {
		//숫자를 입력받아 양수인지 음수인지 출력하시오. 0은 양수로 인정
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan. nextInt();

		if(num >=0) { 
			System.out.println("양수입니다.!!");

		}else{
			System.out.println("음수입니다.!");	
		}
		System.out.println();


		//국어 , 영어, 수학 입력받아 평균 60점이 넘으면 합격 , 불합격 출력하시오.
		//		int kor =0 ; 
		//		int eng = 0;
		//		int math = 0;
		//		int total = kor+ eng + math;
		//		double avg = total /3.0;
		//		System.out.println("국어 점수를 입력하세요.>>");
		//		kor = scan. nextInt();// 변수 값만 들어감
		//		System.out.println("영어 점수를 입력하세요.");
		//		eng = scan.nextInt();
		//		System.out.printf("수학 점수를 입력하세요.");
		//		math = scan.nextInt();
		//		if(avg>=60) {
		//		
		//			
		//	System.out.println("합격입니다.!");
		//		}else {
		//			System.out.println("불합격입니다.");
		//		}



		System.out.println("국어 점수를 입력하세요.>>");
		int kor = scan. nextInt();// 변수 값만 들어감
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.printf("수학 점수를 입력하세요.");
		int math = scan.nextInt();

		int total = kor+ eng + math;//입력 받은 밑에 입력해야함.
		double avg = total /3.0;// 위로 올라 가지 않기 때문에


		if(avg>=60) {


			System.out.println("합격입니다.!");
		}else {
			System.out.println("불합격입니다.");
		}



	}

}
