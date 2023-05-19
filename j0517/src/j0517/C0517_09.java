package j0517;

public class C0517_09 {
	
	
	public static void main(String[] args) {
		
		// static 이 있으면 객체 없이 사용 시
		int [] num = new num[2];
	int a = 10;
	int b = 5;
	
	calulate(num, a,b);
		
		
		System.out.println("합계 : "+num[0]);//15
		System.out.println("평균 : "+num[1]);//7
		
		
		
	}//main

	static void calulate(int[] num, int a, int b) {
		//두수의 합, 평균
		num[0]  = a+b;
		num[1] = (a+b)/2;
		
		 // 같이 return total, avg; 사용 하면 안됨 
		//num 객체 선언 뒤  unm 삽입
		
	}
	
	
	
	
	
}//class

