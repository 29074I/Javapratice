import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ������ �Է¹޾� Ȧ������ ¦������ �Ǻ��ϱ�
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		// Ȧ��(2�� ����� �ƴ� ��), ¦��(2�� ����� �� -> 2�� ������ �� �������� 0)
		String s = (num%2==0)?"(��)�� ¦���Դϴ�":"(��)�� Ȧ���Դϴ�";
		System.out.println(s);
		

	}

}
