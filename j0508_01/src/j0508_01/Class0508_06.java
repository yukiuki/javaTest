package j0508_01;

public class Class0508_06 {

	public static void main(String[] args) {
		//형변환
//		기본형 - 8가지
//		논리형 1바이트 -boolean
//		문자형 2바이트 -char
//		정수형 1바이트 - byte, 2바이트 - short, 4바이트 - int, 8바이트 - long
//		실수형 4바이트 - float, 8바이트 - double
//		문자열 -String
		
		
		float f = 1.6f; //소수점이 있음.
		int i = (int)f;//강제형 변환 1 -()안에 넣을려고 하는 수를 넣어야한다. 그래야 강제로 변환됨.
		System.out.println(i);
		
		int num = 10;
		double d = num;
		System.out.println(d);
		
//		String > double > float > long > int > char,byte,short
//		String에서 double로 갈수 있지만 d -> S으로 넘어가지 못한다. 
//		그외에는 자유롭게 강제변환으로 가능함.
		
		char ch = 'A';
		int n = ch;
		System.out.println(n);//65
		
		
		int n2 = 97;
		char ch2 = (char)n2;
		System.out.println(ch2);//a
		
		
		
		
	}
	
}
