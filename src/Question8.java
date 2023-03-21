
public class Question8 {

	public static void main(String[] args) {
		// 반복문을 사용하여 7의 팩토리얼 값 구하기
		// n! 은 n * (n-1)!
		
		int fac = 1;
		for (int i=1; i<=7; i++) {
			fac *= i;
		}
		System.out.println("'7'의 팩토리얼 값은 ? " + fac);
		

	}

}
