
public class Question6 {

	public static void main(String[] args) {
		// 반복문을 사용하여 1부터 100까지의 정수의 합 구하기

		int sum = 0; // 합계 값 초기화
		// i의 값 1로 초기화, i가 100보다 작거나 같다면  i + 1
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;  // sum + i의 값을 sum에 저장
		}
		System.out.println("1부터 100까지의 합 : " + sum );
	}

}
