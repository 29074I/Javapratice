import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA ���� �Է� : ");
		int javaScore = sc.nextInt();
		
		System.out.print("WBE ���� �Է� :");
		int webScore = sc.nextInt();
		
		System.out.print("ANDROID ���� �Է� : ");
		int andScore = sc.nextInt();
		
		int sum = javaScore + webScore + andScore;
		System.out.printf("�հ� : %d\n", sum);
		
		float avg = (float)sum / 3;
		System.out.printf("��� : %.2f", avg);

	}

}
