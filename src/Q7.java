import java.util.Random;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int success = 0;
		int fail = 0;

		do {
			// 0-9 �� �������� �� ���� ���� ����
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);
			int result = a + b;

			System.out.printf("%d + %d = ", a,b);
			int input = sc.nextInt();

			// ������� �Է��� ���� ���� ���
			if (result == input) {
				System.out.println("Success!");
				success++;
			} else { // ������� �Է��� ���� �ٸ� ���
				System.out.println("Fail!");
				fail++;
			}
			
			System.out.print("����Ͻðڽ��ϱ�? ");
			char answer = sc.next().charAt(0);
			if (answer == 'Y') {
				continue;
			}else if(answer == 'N') {
				break;
			}else {	// �߸��� �Է��� ���
				System.out.println("�ٽ� �Է����ּ���");
			}
		} while (true); 
		
		System.out.printf("����!\n���ᰳ�� : %d\nƲ������ : %d", success, fail);


	}
}
