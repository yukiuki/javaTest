package j0511;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Class0511_01 {
	public static void main(String[] args) {
		//구구단을 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		int num = 0;
//		num = scan. nextInt();

//		for(int i = 2; i<=9; i++) {
//			System.out.printf("[ %d ]\n",i);
//			for(int j=1; j<=9;j++) {
//				System.out.printf("%d*%d = %d\n",i,j,i*j); // \n 삭제하면 옆으로 바꿈
//
//			}
//			System.out.println();
//		}
//1-2
//		for(int i = 2; i<=9; i++) {
//			for(int j=1; j<=9;j++) {
//				System.out.printf(" %d * %d = %d \t",j,i,i*j); // \n 삭제하면 옆으로 바꿈
//
//			}
//			System.out.println();
//		}
//1-3
				for(int i = 1; i<=9; i++) {
					System.out.printf("[ %d ]\t",i);
				}
				System.out.println();
					for(int j=1; j<=9;j++) {					
						for(int i = 2; i<=9; i++) {	
						System.out.printf(" %d * %d = %d \t",j,i,i*j); // \n 삭제하면 옆으로 바꿈
					}
					System.out.println();
				}

	}
}
