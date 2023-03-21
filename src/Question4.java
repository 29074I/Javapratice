import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int sum = (num1+ num2);
		
		if(sum >= 10){
			System.out.println("두 수의 합은 10이상입니다.");
		} else {
			System.out.println("두 수의 합은 10미만입니다.");
		}

	}

}
