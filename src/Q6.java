import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		do {
			// ���� �Է� �ޱ�
			System.out.print("����1 : ");
			num1 = sc.nextInt();
			System.out.print("����2 : ");
			num2 = sc.nextInt();
			
			// ������ �Է� �ޱ�
			System.out.print("������(+/-) : ");
			char operator = sc.next().charAt(0);
			
			// �Է��� �����ڰ� + �Ǵ� - �� �ƴϸ� "�ٽ� �Է����ּ���" ���
			if (operator == '+' || operator == '-') {
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
			
			// �Է��� �����ڿ� ���� ����ϰ� ���
			if (operator == '+') {
				System.out.printf("%d %c %d = %d\n", num1, operator, num2, num1+num2);
			} else if (operator == '-') {
				System.out.printf("%d %c %d = %d\n", num1, operator, num2, num1-num2);
			}
			
			//������� ���� �Է� �ޱ�
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
			char go = sc.next().charAt(0);
			
			// Y�� �Է��ϸ� ���� �Է� ���� �ʱ�ȭ �� �ٽ� �ݺ��� ����
			if (go == 'Y') {
				num1 = 0; num2 = 0;
				continue;
			} 
			// N�� �Է��ϸ� "����" ����ϰ� �ݺ��� ����
			else if (go == 'N') {
				System.out.println("����");
				break;
			} 
			// Y �Ǵ� N �̿��� �ٸ� ���ڸ� �Է��ϸ� "�ٽ� �Է����ּ���" ��� �� �ݺ��� ����
			else {
				System.out.println("�ٽ� �Է����ּ���");
				break;
			}
		} while (true); // ���� �ݺ���
	}
}
