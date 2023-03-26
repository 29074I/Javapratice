import java.util.Scanner;

public class Ex04while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int cnt = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		int week = 1;
		while (true) {
			System.out.printf("%d주차 감량 몸무게 : ", week++);
			int weightLoss = sc.nextInt();
			cnt -= weightLoss;
			if (cnt <= goal) {
				break;
			}
		}
		System.out.printf("최종몸무게 : %d\n", cnt);
		System.out.println("축하합니다!!!");
	}

}
