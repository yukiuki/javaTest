import java.util.Scanner;

public class C0518_08 {
	public static void main(String[] args) {
		//1-100까지; 랜덤 숫자를 생성해서 숫자를 맞추는 프로그램을 구현하시오.
		//횟수는 10번만 가능


		//
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1; //1-100랜덤숫자
		//입력한 숫자를 모두 출력하시오
		int[] num = new int[10];
		//System.out.println(random);

		//for
		for(int i =0; i<10; i++) {
			//1. 숫자 입력
			System.out.println((i+1)+"번호를 입력하세요.");
			num[i] = scan.nextInt();

			//비교 if (입력받은 숫자와 랜덤숫자가 같은지 비교)
			//같으면 break;
			if(random == num[i]){		
				System.out.println("정답입니다.");

				break;
				//else : 틀렸습니다. 다시 입력헤주세요.
			}else{
				System.out.println("틀렸습니다. 다시 입력해주세요.");
			}
		}
		System.out.println();

		System.out.println();

	}//main
}
