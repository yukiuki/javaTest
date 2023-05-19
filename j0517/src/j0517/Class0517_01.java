package j0517;

public class Class0517_01 {
	public static void main(String[] args) { //public:접근 권한 의미

		//객체 선언
		Card c1 = new Card();
		c1. kind = "Heart";
		c1. number = 7;
		c1.number = 25;
		c1. width = 500;


		Card c2 = new Card();
		c2. kind = "Spade";
		c2.number = 4;


		Card c3 = new Card();

		System.out.println("c1 카드종류 : "+c1. kind);
		System.out.println("c1 카드 숫자 : "+ c1. number);
		System.out.println("c1 가로 길이 : "+ c1. width);
		System.out.println("c1 세로길이 : "+ c1 .height);
		System.out.println("======================================");
		System.out.println("c2 카드종류 : "+c2. kind);
		System.out.println("c2 카드 숫자 : "+ c2. number);
		System.out.println("c2 가로 길이 : "+ c2. width);
		System.out.println("c2 세로길이 : "+ c2. height);
		System.out.println("======================================");
		System.out.println("c3 가로 길이 : "+ c3. width);





	}//main

}//class
