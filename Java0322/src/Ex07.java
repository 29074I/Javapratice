import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �ñް���
		// �⺻ �ñ��� 9000���̰� 8�ð��� ���� ��� �ʰ��ð��� �ñ��� 1.5�踦 å��
		
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int hour = sc.nextInt();

		// 8�ð� ���� �ٹ� : 9000 * ���� �ð�(hour)
		// 8�ð� �ʰ� �ٹ� : 8*9000 + (���� �ð�(hour) - 8) * 9000 * 1.5
				
		int �⺻�ñ� = 9000;
				
		// �Ǽ� -> ���� ����ȯ ���� �ڵ�����ȯ ������ ����
		// ���� ũ����� �Ǽ��� ǥ�������� �� �б� ����
		double p = (hour>8)? 8*�⺻�ñ� + (hour - 8) * �⺻�ñ� * 1.5: �⺻�ñ�*hour;
		System.out.printf("�� �ӱ��� %.0f�� �Դϴ�", p);

	}

}
