
public class Ex08 {

	public static void main(String[] args) {
		
		/* ġȯ  */
		
		String left = "red";
		String right = "blue";
		
		String temp;				// �ӽ� ������� ����  // �ʱ�ȭ�� ����
		String temp1 = null;		// �ʱ�ȭ�� ��  null -> ����ִ� �� / reference type�� ����
		// int temp2 = null;  �⺻Ÿ���� null�� �ʱ�ȭx
		
		temp = right;				// left : red , temp : blue , right : blue
		right = left;				// left : red , temp : blue , right : red
		left = temp;				// left : blue , temp : blue . right : red
		
		System.out.println(left); 	// blue
		System.out.println(right); 	// red

	}

}
