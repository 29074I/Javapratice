import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 현재 몸무게와 목표 몸무게 입력 받기
		System.out.print("현재 몸무게 : ");
		int cnt = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		int week = 1;			// 몇 주차인지 나타내는 변수
		int weightLoss = 0;		// 감량한 몸무게의 합을 저장하는 변수

		// 현재 몸무게에서 목표 몸무게까지 감량할 때까지 반복
		while (cnt-weightLoss > goal) {
			// 몇 주차인지 출력 후 감량한 몸무게 입력 받기
			System.out.printf("%d주차 감량 몸무게 : ", week++);
			weightLoss += sc.nextInt();	// 감량한 몸무게 누적
		}
		
		// 최종 몸무게 출력하고 축하 메시지 출력
		System.out.printf("최종몸무게 : %d\n", cnt-weightLoss);
		System.out.println("축하합니다!!!");
	}

}
