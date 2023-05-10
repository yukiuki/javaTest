package j0508_01;

public class Class0508_08 {
	
	public static void main(String[] args) {
//		null변수 10, num2 변수 3 을 선언후, 
//			두수를 나눠서 소수점 2자리까지 출력하시오.
	        int num = 10;
	        int num2 = 3;
	        System.out.println(10/0.3);
	        System.out.println(num/(float)num2);
	        System.out.printf("%.2f \n", num/(float)num2);        
	        System.out.printf("%.2f \n", (float)num / num2);
	        
//	        변수 n1 : 3.14,  변수 n2  : 5
//	        [ n1+n2 의 결과 값 : 8.14 ]를 출력하시오.

	        
	        double n1 = 3.14;
	        int n2 = 5;
	        System.out.printf("[n1+n2의 결과 값 : %.2f]\n", n1+(float)n2); 
	        	        
	        	        
	        float n3 = 3.14f;
	        int n4 = 5;
	        System.out.printf("[n3+n4의 결과 값 : %.2f]\n", n3+(float)n4);
	        
	        float n5 = 3.14f;
	        int n6 = 5;
	        System.out.printf("[n5+n6의 결과 값 : %.2f ]\n", n5+n6);
	        
	        double n7 = 3.14;
	        int n8 = 5;
	        System.out.printf("[n7+n8의 결과 값 : %f]", n7+n8); 
	        System.out.println();
	        
//	        국어점수 kor 100, eng 100, math 99
//	        합계와 평균을 출력하시오. 평균은 소수점 2자리까지 출력
//	        [합계 : 299, 평균 :99.67]
	        int kor = 100;
	        int eng = 100;
	        int mat = 99;
	        System.out.printf("[합계 : %d, 평균 :%.2f]\n", kor+eng+mat, (float)(kor+eng+mat)/3); 

	        int k = 100, e = 100, m = 99;
	        int total = k+e+m;
	        double avg = total/ 3.0;
	        System.out.printf("[ 합계 : %d, 평균 : %.2f]\n", total, avg);
	        		
	        
	}
}

//ㅇ
