import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int login = 0;	// �α��� �õ� Ƚ�� �ʱ�ȭ

		do {
			// ���̵�� ��й�ȣ �Է� ��
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String pw = sc.next();

			// ���̵�� ��й�ȣ�� ���� ���
			if (id.equals("smhrd") && (pw.equals("1234"))) {
				System.out.println("�α��� ����!");
				break;
			} else {
				System.out.println("�α��� ����");
				
				// �α��� ���� Ƚ���� 3ȸ �̻��� ���
				if (++login == 3) {
					System.out.println("���������� ���ּ���");
					break;
				}
				System.out.print("��� �Ͻðڽ��ϱ�? ");
				char yn = sc.next().charAt(0);
				// ��� ������ ���
				if (yn == 'Y') {		
					continue;
				} // ������ ���
				else if (yn == 'N') { 
					break;
				} // �߸��� �Է��� ���
				else {				
					System.out.println("�ٽ� �Է����ּ���(Y/N)");
				}
			}
		}while (true); // do-while�� ����
	} 

}
