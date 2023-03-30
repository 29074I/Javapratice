import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 크기가 5인 정수형 배열 생성
		int[] score = new int[5];
		int sum = 0;

		// 정수형 배열에 5개의 점수를 입력받아 저장
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 입력 >> ", i + 1);
			score[i] = sc.nextInt();
			// sum에 점수 합산
			sum += score[i];
		}

		// 배열에 저장된 모든 점수 출력하기
		System.out.print("입력된 정수 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d ", score[i]);
		}

		// 최고 점수, 최저점수, 총합 초기화
		int max = score[0];
		int min = score[0];
		int hap = 0;
		
		// 최고 점수와 최저 점수 비교
		for (int i = 0; i < score.length; i++) {
			hap += score[i];
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("\n최고 점수 : %d\n", max);
		System.out.printf("최저 점수 : %d\n", min);
		System.out.printf("총 합 : %d\n", hap);
		System.out.printf("평균 : %.1f", hap / (float) score.length);

	}

	}


