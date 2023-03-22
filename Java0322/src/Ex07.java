import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 시급계산기
		// 기본 시급은 9000원이고 8시간이 넘을 경우 초과시간은 시급의 1.5배를 책정
		
		System.out.print("노동시간을 입력하세요 : ");
		int hour = sc.nextInt();

		// 8시간 이하 근무 : 9000 * 일한 시간(hour)
		// 8시간 초과 근무 : 8*9000 + (일한 시간(hour) - 8) * 9000 * 1.5
				
		int 기본시급 = 9000;
				
		// 실수 -> 정수 형변환 절대 자동형변환 해주지 않음
		// 같은 크기더라도 실수가 표현범위가 더 넓기 때문
		double p = (hour>8)? 8*기본시급 + (hour - 8) * 기본시급 * 1.5: 기본시급*hour;
		System.out.printf("총 임금은 %.0f원 입니다", p);

	}

}
