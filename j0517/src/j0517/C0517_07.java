package j0517;

public class C0517_07 {


	public static void main(String[] args) {
		//
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		System.out.println("=================================");
		change(d.x);
//		int num;
//		num = change(d.x); //1000
		System.out.println("change d.x : "+d.x);

	}//main
	static int change(int x) {
		x=1000;
		System.out.println("x : "+x);
		return x;
	}

}//class
