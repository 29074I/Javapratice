import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �󱸰��� ��� ���� �ʿ��� ������ ���� ���ϱ�
		// ���� �ϳ����� �󱸰��� 5�� �� �� ����

		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int ball = sc.nextInt();

		int box = (ball%5==0)?ball/5:ball/5+1;
		System.out.println("�ʿ��� ������ �� : " + box);
	}

}
