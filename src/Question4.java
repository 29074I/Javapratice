import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int sum = (num1+ num2);
		
		if(sum >= 10){
			System.out.println("�� ���� ���� 10�̻��Դϴ�.");
		} else {
			System.out.println("�� ���� ���� 10�̸��Դϴ�.");
		}

	}

}
