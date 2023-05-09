package j0509_01;

import java.util.Scanner;

public class Class0509_04 {
	public static void main(String[] args) {
//		아이디, 패스워드, 이름을 입력 받아 출력하시오.
//		아이디 패스워드 이름
//		abcd    11111 홍길동
		Scanner id_1 = new Scanner (System.in);
		
		String id1 = "";
		String pass = "";
		String name1 = "";

		System.out.println("아이디을 입력하세요.");
		id1 = id_1.next();
		System.out.println("패스워드을 입력하세요.");
		pass = id_1.next();
		System.out.println("이름을 입력하세요.");
		name1 = id_1.next();
		
		
		
		System.out.println(" --------------------------------------------------------");
		System.out.println(" \t아이디\t패스워드\t이름");
		System.out.println(" --------------------------------------------------------");
		System.out.printf(" \t%s\t%s\t %s\n",id1, pass, name1);
		
//	    1. 변수선언
		String id = "";
		int pw = 0;
		String name = "";
		
//		2.Scanner - 입력 클래스
		Scanner scan = new Scanner (System.in);
		System.out.println("아이디을 입력하세요.");
//		id = scan.next(); //next()-문자만 입력받음, nextLine()
		id = scan.nextLine();
		System.out.println("패스워드을 입력하세요.");
		pw = scan.nextInt();//0145의 0은 표현이 안되므로 문자로 변환하여야함.
		scan.nextLine(); //nextInt() enter키를 입력으로 사용
		System.out.println("이름을 입력하세요.");
		name = scan.nextLine();
//		3. 출력
		System.out.println(" --------------------------------------------------------");
		System.out.println(" \t아이디\t패스워드\t이름");
		System.out.println(" --------------------------------------------------------");
		System.out.printf(" \t%s\t%d\t %s\n",id, pw, name);
	}

}
