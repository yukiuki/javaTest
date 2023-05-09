package j0508_01;

public class Class0508_07 {
	
	public static void main(String[] args) {
//		printf, println, print
		System.out.println(10/4.0); // 출력 후 enter키카 포함. 
//		(10/3); //int로 도출 10 int, 3 int
//		(10/3.0)은 결과값이 3.333333333333335 15자리값이 나옴.
		//\n단락 \t tab 키
		System.out.printf("%.2f \n", 10/7.0);//실수형 -출력 후 자동 enter키가 없음.
	    System.out.printf("[%5d]",1000);// 정수형
	    System.out.printf("[%05d]",1000);// 정수형
	    System.out.printf("%9d",1000);// 정수형
	    System.out.printf("[%10d]",1000);// 정수형
	    System.out.printf("%09d",1000);//정수형
	    System.out.printf("%x \n",16);//16진수
	    System.out.printf("%o",9);//8진수
	    System.out.printf("당신의 나이 : %d 세, 생년 : %d 년 \n",25,1986);
//	    println으로 사용 시
	    System.out.println("당신의 나이 : "+25+" 세, 생년 : "+1986+" 년");
	    


		
		
		
	}

}
