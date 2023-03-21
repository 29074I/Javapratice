
public class Question7_2 {

	public static void main(String[] args) {
		// 중첩반복문을 이용하여 구구단 2단 ~ 9단까지 출력
		
		for (int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for (int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
