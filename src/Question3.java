
public class Question3 {

	public static void main(String[] args) {
		// ���׿����� ���
		int inbox = 52;
		int a = 3729;
		
		// ���� 0���� �������ٸ� a/inbox�� ���� ������ 
		// �ƴ϶�� a/inbox �� 1�� ���� ���� ���
		int result = a % inbox == 0 ? a/inbox : a/inbox+1;
		System.out.println("�ʿ��� �� �ڽ��� ���� " + result + "�� �̴�.");

	}

}
