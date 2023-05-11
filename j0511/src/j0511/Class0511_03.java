package j0511;

public class Class0511_03 {
	public static void main(String[] args) {
// 1-1   i 의 위치
//		int i = 0, sum = 0;
//		
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum = sum+i;   //i=0  sum = 0 , i= 1  sum = 1 ,...i = 14 sum =91
//			i++;          // i = 15 sum =105
//			
//		}
//		System.out.println("i의 결과값 : "+i);
//		System.out.println("sum의 결과 값 : "+sum);
//		
//		1-2
//	int i = 0, sum = 0;
//		
//		while(true) {
//			if(sum>100) {
//				break;  //while와  for문 종료할때 : break문
//			}
//			i++;          // i = 14 sum =105
//			sum = sum+i;   //i=0  sum = 0 , i= 1  sum = 1 ,...i = 13 sum =91
//			
//		}
//		System.out.println("i의 결과값 : "+i);
//		System.out.println("sum의 결과 값 : "+sum);
		
//		1-3
		int i = 0, sum = 0;

		//반복문에서 break문에 대한 설명
		for(i=0;;i++) { //debug 모드에서 F6 누르며 하나씩 확인 할수 있다.
			if(sum>10) {
				break;
			}
			sum = sum+i;
		}
		System.out.println("i의 결과 값 : "+(i-1));
		System.out.println("sum의 결과 값 : "+sum);
		
//		1-4
//		int i = 0, sum = 0;
//
//		for(i=0;;) {
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum+i;
//		}
//		System.out.println("i의 결과 값 : "+i);
//		System.out.println("sum의 결과 값 : "+sum);
		
	}//main

}//class
