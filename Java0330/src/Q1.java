import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ũ�Ⱑ 5�� ������ �迭 ����
		int[] score = new int[5];
		int sum = 0;

		// ������ �迭�� 5���� ������ �Է¹޾� ����
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d��° �Է� >> ", i + 1);
			score[i] = sc.nextInt();
			// sum�� ���� �ջ�
			sum += score[i];
		}

		// �迭�� ����� ��� ���� ����ϱ�
		System.out.print("�Էµ� ���� : ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d ", score[i]);
		}

		// �ְ� ����, ��������, ���� �ʱ�ȭ
		int max = score[0];
		int min = score[0];
		int hap = 0;
		
		// �ְ� ������ ���� ���� ��
		for (int i = 0; i < score.length; i++) {
			hap += score[i];
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("\n�ְ� ���� : %d\n", max);
		System.out.printf("���� ���� : %d\n", min);
		System.out.printf("�� �� : %d\n", hap);
		System.out.printf("��� : %.1f", hap / (float) score.length);

	}

	}


