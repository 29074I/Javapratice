import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 두 개의 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과값을 출력하기
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1 - num2;
		System.out.println((result>=0)?result: -result); // -1*result
		
		System.out.println("두 수의 차 : "+((num1>num2)? num1-num2 : num2-num1));


	}

}
