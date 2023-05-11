package j0510_01;

import java.util.Scanner;

public class Class0510_04 {
	public static void main(String[] args) {
	
//		점수를 입력받아 90점 이상이면 A, 아니면 80이상이면 B, 70점 이상 C, 60점 이상 D, F
//		97점 이상A+, 93점 이하 A-, 87점이상 B+, 83 점 이하 B-
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();
		if(score>=90) {//90,91,92...100
			System.out.print("A"); //println은 줄바꿈을 하기 때문에 print로 입력함.
			if(score>=97) {
				System.out.println("+");
			}else if(score<=93) {
				System.out.println("-");
			}
		}else if(score>=80) { //&& score<90){
			System.out.println("B"); //80,81,82...89
			if(score>=87) {
				System.out.println("+");
			}else if(score<=83) {
				System.out.println("-");
			}
		}else if(score>=70) { //&& score<90){
			System.out.println("C"); 
			if(score>=77) {
				System.out.println("+");
			}else if(score<=73) {
				System.out.println("-");
			}
		}else if(score>=60) { //&& score<90){
			System.out.println("D"); 
			if(score>=67) {
				System.out.println("+");
			}else if(score<=63) {
				System.out.println("-");
			}
		}else { 
			System.out.println("F"); 
		}
		
		
		
		
		
//		
		
//		error예문
//		String input = "";
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//	    System.out.println("문자을 입력하세요.");
//     // str = scan.next(); //문자열
//	    ch = input.charAt(0);//문자열의 첫번째 문wk 가져옴.
//	    if(ch =='c') {
//	    	System.out.println("c입니다.");	    	
//	    }else {
//	    	System.out.println("C가 아닙니다.");
//	    }
		
		
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//	    System.our.println("문자열을 입력하세요.");
//	    str = scan.next();
//	    if(str equalsignoreCase"c") {//기본형 8개 - boolean, char,byte, short, longfloat, double
//	    	System.out.println("c입니다.");	    	
//	    }else {
//	    	System.out.println("C가 아닙니다.");
//	    }
	    
		
		
		
		
//		m, f입력받아 m남자 f는 여자라고 출력하세요.
//		switch문을 사용하세요
//		char input = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성별을 입력하세요(m,f)?");
//		input = scan.next().charAt(0);
//		switch(input) {
//		case ('m'):case ('M'):
//			System.out.println("남자입니다.");
//		break;
//	    case ('f'):	
//	    case ('F'):
//	    	System.out.println("여자입니다.");
//		break;
//	    default:
//			System.out.println("다시 입력헤주세요.");
//			break;
//		}
		
		
		
		
		
		
//		String input = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성별은 무엇입니까?");
//		input = scan.next();
//		switch(input) {
//		case ("m"):
//			System.out.println("m 남자입니다.");
//		break;
//	    case ("M"):
//	    	System.out.println("M 남자입니다.");
//		break;	
//	    case ("f"):
//		    	System.out.println("f 여자입니다.");
//	    break;	
//	    case ("F"):
//	    	System.out.println("F 여자입니다.");
//		break;
//	    default:
//			System.out.println("다시 입력헤주세요.");
//			break;
//		}
//		
		
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		input = scan.nextInt();

//		switch
//		switch(input) {
//		
//		case 1:
//			System.out.println("1입니다.");
//			break;
//		case 6:
//			System.out.println("6입니다");
//			break;
//		
//		case 9:
//			System.out.println("9입니다.");
//			break;
//			
//		default:
//			System.out.println("원하는 숫자가 아닙니다.");
//			break;		
//		}//switch
	}

}
