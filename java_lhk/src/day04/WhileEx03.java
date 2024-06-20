package day04;

public class WhileEx03 {
	/*구구단 2단을 출력하는 코드를 작성하세요
	 * 반복회수 : i는 1부터 9까지 1씩 증가
	 * 규칙성 : 2 X i = (2*i)를 출력
	 * 반복문 종료 후 : 없음
	 * */
	
	public static void main(String[] args) {
		int i = 1;
		while(i <= 9) {
			System.out.println(2 * i);
			++i;
		}
	}

}

