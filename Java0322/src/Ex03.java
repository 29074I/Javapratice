import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int time = sc.nextInt(); // �� �Է�
		
		// 3723�� -> 1��(3600��) 2��(60��) 3��
		int hour = time/3600;
		int minute = (time%3600)/60;
		int second = time%60;
		
		System.out.printf("%d�� %d�� %d��", hour, minute, second);

	}

}
