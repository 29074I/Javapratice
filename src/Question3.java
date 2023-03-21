
public class Question3 {

	public static void main(String[] args) {
		// 삼항연산자 사용
		int inbox = 52;
		int a = 3729;
		
		// 몫이 0으로 떨어진다면 a/inbox의 값이 나오고 
		// 아니라면 a/inbox 에 1이 더한 값이 출력
		int result = a % inbox == 0 ? a/inbox : a/inbox+1;
		System.out.println("필요한 귤 박스의 수는 " + result + "개 이다.");

	}

}
