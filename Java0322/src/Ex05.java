import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �� ���� ������ �Է� �޾� ū ������ ���� ���� �� ������� ����ϱ�
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = num1 - num2;
		System.out.println((result>=0)?result: -result); // -1*result
		
		System.out.println("�� ���� �� : "+((num1>num2)? num1-num2 : num2-num1));


	}

}
