import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� �����Կ� ��ǥ ������ �Է� �ޱ�
		System.out.print("���� ������ : ");
		int cnt = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();

		int week = 1;			// �� �������� ��Ÿ���� ����
		int weightLoss = 0;		// ������ �������� ���� �����ϴ� ����

		// ���� �����Կ��� ��ǥ �����Ա��� ������ ������ �ݺ�
		while (cnt-weightLoss > goal) {
			// �� �������� ��� �� ������ ������ �Է� �ޱ�
			System.out.printf("%d���� ���� ������ : ", week++);
			weightLoss += sc.nextInt();	// ������ ������ ����
		}
		
		// ���� ������ ����ϰ� ���� �޽��� ���
		System.out.printf("���������� : %d\n", cnt-weightLoss);
		System.out.println("�����մϴ�!!!");
	}

}
