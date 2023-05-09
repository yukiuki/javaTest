package j0508_01;

public class Class0508_03 {
   
   static int num; //전역변수(두군데에서 사용가능한 변수) 
                     // - class 영역에서도 변수선언 가능
                     //static int num 은 자동으로 0으로 세팅이 가능함.
   
   public static void main(String[]args) {
      int num; //지역변수(한군데에서만 사용가능한 변수)
//      int num;은 자동으로 0으로 세팅 되지 않음.
      num=10;
      System.out.println("main메소드 num 호출: "+num);
      sub();
   }
   
   static void sub() {
//      System.out.println(num); //이렇게는 사용 불가
      System.out.println("main 메소드 num 호출: "+num);
   }

}
