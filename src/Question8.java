
public class Question8 {

	public static void main(String[] args) {
		// �ݺ����� ����Ͽ� 7�� ���丮�� �� ���ϱ�
		// n! �� n * (n-1)!
		
		int fac = 1;
		for (int i=1; i<=7; i++) {
			fac *= i;
		}
		System.out.println("'7'�� ���丮�� ���� ? " + fac);
		

	}

}
