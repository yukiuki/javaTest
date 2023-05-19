package j0517;

import java.net.MulticastSocket;

public class C0517_08 {
	
	
	public static void main(String[] args) {
		//tv
		//객체선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t1.channel = 7;
		System.out.println("Tv t1 channel : "+ t1.channel);
		
		t2.channel = 8;
		System.out.println("Tv t2 channel : "+ t2.channel);
		
		t2 = t1;
		System.out.println("t2 channel : "+ t2.channel);
		
		t2.channel = 0;
		System.out.println();
		
	}//main

}//class
