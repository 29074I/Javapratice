import java.util.Random;
import java.util.Scanner;

public class PlusGame {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// ctrl + shift + o -> 한 번에 import 단축키
		
		System.out.println("===Plus Game===");
		
		while(true) {
			
			int num1 = rd.nextInt(50)+1;
			int num2 = rd.nextInt(50)+1;
			
			System.out.printf("%d + %d = ", num1, num2);
			int input = sc.nextInt();
		}

	}

}
