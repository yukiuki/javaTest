package j0509_01;

import java.util.Scanner;

public class Class0509_09 {
	public static void main(String[] args) {
		//1개의 글자를 입력받아 숫자로 변환하시오.
		//"15784" 1문자를 숫자로 변화
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열울 입력하시오.");
		char input = scan.next().charAt(4); //charAt()문자열에서 1개의 문자를 가져옴
	   // int result = input - 0; //1입력시= 49-0 = 49
		int result = input - '0'; //char 타입의 숫자는  "0"문자 0을 빼야 숫자값으로 변환됨.
	    String content = (result%2 == 0)?"짝수입니다.":"홀수입니다.";
	    System.out.println("추출한 숫자 : "+result);
	    System.out.println(content);
	
	
	}

}
//