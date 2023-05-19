package j0517;

import java.util.Iterator;
import java.util.Scanner;

public class C0517_03 {

	int result;//인스턴트 변수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//3개의 숫자를 입력받아 합계를 구하세요.
		//add 메소드를 이용하세요.

		//객체 선언
		//클래스명 참조변수명 = new 클래스명();
		C0517_03 C0517_03 = new C0517_03();
		//		int num1 =0;
		//		int num2 =0;
		//		int num3 = 0;
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"번째 번호를 입력하세요>>");
			num[i] = scan.nextInt();
		}


		//메소드 호출
		int result = C0517_03.add(num[0],num[1],num[2]);
		System.out.println("세개의 더하기 : "+result);





	}

	//add

	int add(int num1,int num2,int num3) {
		int result = num1 + num2 + num3;
		return result;
	}

}
