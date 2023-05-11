package j0510;

import java.util.Scanner;

public class Class0510_03 {
	public static void main(String[] args) {
		
//		m,f문자로 입력받아 m이면 남자입니다.f면 여자입니다. 출력하시오.
//		1.변수선언  2.scan한 후 변수 입력받음  3. 비교   4. 출력
//		교수님 답
		String input = "";//객체, 기본형 타입만 ==
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 확인해주세요.");
		input = scan.next(); //문자열 입력받음.
		if(input.equals("m")||input.equals("M")) {
			System.out.println("남자입니다.");
		}else if(input.equals("f")||input.equals("F")){
			System.out.println("여자입니다.");
		}else {
			System.out.println("다른문자를 입력하셨습니다. 다시 입력하세요");
		}
//		
		
//		char input = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이사람은 남자입니까 여자입니까?");
//		 input = scan.next().charAt(0);
//		 if(input?'m':'M') {
//			 System.out.println('m은 남자입니다.'||'M은 남자입니다');
//		 }else {
//			 System.out.println('f는 여자입니다.'||'F는 여자입니다.');
//		 }
//		 
		
		
		
//		입력한 숫자가 1,6,9만 입력받아 1, 6, 9 출력하세요.
//		 1.변수선언  2.scan한 후 변수 입력받음  3. 비교   4. 출력
//		if else if() else
//		int num = 0;
//		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		num = scan.nextInt();
//		if(num==1) {
//			System.out.println("입력한 숫자가 1입니다.");
//		}else if(num==6){
//			System.out.println("입력한 숫자는 6입니다.");
//		}else {
//			System.out.println("입력한 숫자가 9입니다.");
//		}
//				
		
//		점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격 출력하시오
//		1.변수선언  2.scan한 후 변수 입력받음  3. 비교   4. 출력
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		num = scan.nextInt();
//		if(num >= 60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}//if
//		
	}//main

}//class
