import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num%4==0) {
			System.out.println("나머지는 0입니다.");
		} else if (num%4==1) {
			System.out.println("나머지는 1입니다.");
		} else if (num%4==2) {
			System.out.println("나머지는 2입니다.");
		} else if (num%4==3) {
			System.out.println("나머지는 3입니다.");
		}else {
			System.out.println("나머지는 " + num%4 + "입니다.");
		}

	}

}
