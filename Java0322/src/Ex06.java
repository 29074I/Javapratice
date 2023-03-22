import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 농구공을 담기 위해 필요한 상자의 개수 구하기
		// 상자 하나에는 농구공이 5개 들어갈 수 있음

		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();

		int box = (ball%5==0)?ball/5:ball/5+1;
		System.out.println("필요한 상자의 수 : " + box);
	}

}
