import java.util.Random;
import java.util.Scanner;

public class PlusGame {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// ctrl + shift + o -> �� ���� import ����Ű
		
		System.out.println("===Plus Game===");
		
		int fail = 0;
		
		while(true) {
			
			int num1 = rd.nextInt(50)+1;
			int num2 = rd.nextInt(50)+1;
			
			System.out.printf("%d + %d = ", num1, num2);
			int input = sc.nextInt();
			
			if(input==(num1+num2)) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
				fail++;
				if(fail==3) {
					System.out.println("GAME OVER");
					break;
				}
				System.out.print("��� �Ͻðڽ��ϱ�? >> ");
				String input2 = sc.next();
				if(input2.equals("Y")) {
					
				}else if (input2.equals("N")) {
					System.out.println("�����մϴ�");
					break;
				}
				
			}
		}

	}

}
