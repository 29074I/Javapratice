
public class Question6 {

	public static void main(String[] args) {
		// �ݺ����� ����Ͽ� 1���� 100������ ������ �� ���ϱ�

		int sum = 0; // �հ� �� �ʱ�ȭ
		// i�� �� 1�� �ʱ�ȭ, i�� 100���� �۰ų� ���ٸ�  i + 1
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;  // sum + i�� ���� sum�� ����
		}
		System.out.println("1���� 100������ �� : " + sum );
	}

}
