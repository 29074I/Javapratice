import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// 1. ��ɵ� ��������
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 2. ��¹� : �Է�
		// ���� Game �����
		System.out.println("=====1���� 100 ���� ���� ���߱� ����!=====");
		
		// ������ ���� �Ѱ� --> �� : �ѹ��� ���� 
		int num = rd.nextInt(100)+1;
		
		// 3. ��¹� �Է�
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ��� >> ");
			int input = sc.nextInt();
			// �Է��� ���� ���� ���ڿ� ��ġ�ϴ��� �Ǵ�
			if(input==num) {
				System.out.printf("%d �����Դϴ�!!", num);
				break;
			}else if(input<num) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����");
			}else {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����");
			}
		}while(true);

	}


	}

}
