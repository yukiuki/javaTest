package j0511;

public class Class0511_04 {
	public static void main(String[] args) {

//		구구단 5단을 빼고 출력 하시오.
//		for(int i=5;i<=9;i++) {
//			System.out.printf("[  %d단  ]\t");
//		}
//			System.out.println();
//			for(int j=1;j<=9;j++) {
//				int i;
//				System.out.printf(" %d * %d = %d \t", i,j,i*j);
//			}
//			System.out.println();
//		}
		
	for(int i=2;i<=9;i++) {
		if(i%2!=0) continue; // 같은 의미 if(i%2==1) 짝수만 나옴
		for(int j=1;j<=9;j++) {
			if(j%2==0) continue;		
			System.out.printf(" %d * %d = %d \n", i,j,i*j);
		}
		System.out.println();
	}
	
		
		
		
		//		for(int i=0;i<=10;i++) {
//			if(i==5) { //if(i%2==1) 와 같은 결과 나옴.
//				continue;//
//				//break;//0-4까지만 나옴.
//			}
//			System.out.println(i);
//			
//		}//for
	}//main

}//class
