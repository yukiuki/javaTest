package j0508_01;

public class Class0508_01 {
	
	public static void main(String[] args) {
		
		boolean temp = true;
		boolean temp2 = false;
		boolean temp3;
		temp3 = true;
		
		char ch1 = ' ';//' ' 공백없이는 사용할 수 없음. 문자형 타입
		char ch2 = 'a';//''만 사용가능
		char ch3 = 'A';
		char ch4 = 't';
		//char ch5 = " "; "" 사용불가
		
		byte num1 = 1;
		//byte num3 = 256; // 127까지 숫자표현 가능
		short num2 = 10;
		//short num4 = 32768; //3267,까지 숫자표현 가능    
		
		int num5 = 21;
		//int num6 = 2147483648; //2147483647까지 숫자표현 가능
		long num7 = 21;
		long num8 = 2147483648L; //8을 넘어가면 L을 붙인다.
		
		float num9 = 9.87654321111111F; //실수형 소수점 (대문자 F나 소문자 f 둘다 사용 가능), 
		                                //숫자 8자리까지 정밀도 표현가능
		float num10 = 987.654321F;//접미사 f,F를 붙여야함. 
		                          //실수형 소수점 (대문자 F나 소문자 f 둘다 사용 가능),
		                          //뒷 숫자 사용해도 되지만 정밀도가 떨어짐 8자리까지만 가능
		double num11 = 1.12345678012345;//d,D는 붙여도 되고 안붙여도 된다
		                                // 실수형 16자리까지 정밀도 표현 가능
		
		//문자열 -class일 때 대문자 표현(소문자로 쓰면 error남)
		String str1 = new String("abc");
		//상수의 이름은 대문자로 단어는 '-'로 구분한다. 여러 단어 이름은 단어의 첫글자는 대문자로 사용한다.
		char str3 =' ';//''안에 공백을 넣지 않으면 error남.
		String str4 = ""; // ""안에 공백을 넣어도 안넣어도 문자로 인식한다.
		
		//변수
		int score = 100;
		score = score + 200; //score 300이라는 값이 들어감.
		
		//상수
		final int SCO = 100;
		//SCO = 200;  //상수는 값을 변뎡 할수 없음.
		
		String str = "aaa"; // 기본형 타입으로 선언(예외) ,변수는 첫글자를 소문자로
		
		
		
		
		

	}

	
	
}
