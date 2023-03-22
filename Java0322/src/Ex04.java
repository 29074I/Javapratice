import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력받아 홀수인지 짝수인지 판별하기
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 홀수(2의 배수가 아닐 때), 짝수(2의 배수일 때 -> 2로 나눴을 때 나머지가 0)
		String s = (num%2==0)?"(는)은 짝수입니다":"(는)은 홀수입니다";
		System.out.println(s);
		

	}

}
