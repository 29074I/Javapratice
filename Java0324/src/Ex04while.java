import java.util.Scanner;

public class Ex04while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ : ");
		int cnt = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();

		int week = 1;
		while (true) {
			System.out.printf("%d���� ���� ������ : ", week++);
			int weightLoss = sc.nextInt();
			cnt -= weightLoss;
			if (cnt <= goal) {
				break;
			}
		}
		System.out.printf("���������� : %d\n", cnt);
		System.out.println("�����մϴ�!!!");
	}

}
