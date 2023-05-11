package j0509_01;

import java.util.Scanner;

public class Class0509_03 {
	
	public static void main(String[] args) {
		
		int kor = 0; //소숫점으로 입력하고 싶으면 int->double로 변경
		int eng = 90;
		int math = 89; //변수명은 마음대로 적으면 되지만 첫글자에 숫자만 아니면 됨EX)scanScore
		String name = "홍길동";
		//데이터 입력 Scanner -화면에서 입력을 받음.
		//java.utill Scanner 라고 입력하거나
//		String str = new String("aaa");
//		String str2 = "aaa"; //객체 = Class 와 같은 말임.
		Scanner scan = new Scanner (System.in);
		System.out.println("이름을 입력하세요");
		name = scan.next(); //너무 좋아요
//		name = scan.neatLine(); //너무 좋아요 함계해요.

		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextInt(); //소수점 입력하면 error남. nextDouble
		System.out.println("영어점수를 입력헤주세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력헤주세요");
		math = scan.nextInt();
			
		
//		
		int total = kor + eng + math; //소숫점으로 입력하고 싶으면 int->double로 변경
		double  avg = total/3.0;	
		System.out.println(" --------------------------------------------------------");
		System.out.println(" \t이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println(" --------------------------------------------------------");
		System.out.printf(" \t%s\t%d\t %d\t %d\t %d\t %.2f\n",name,kor,eng,math,total, avg);
		//소숫점으로 입력하고 싶으면 %d-> %.1f로 변경
	
	
	
	}

}
