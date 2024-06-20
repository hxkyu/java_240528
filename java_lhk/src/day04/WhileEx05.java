package day04;

public class WhileEx05 {
	public static void main(String[] args) {
		/* 짝수의 합이 30이 나오도록 코드를 작성하세요.
		 * 		sum
		 *		sum =  0
		 * i=2	sum = sum + 2
		 * i=4	sum = sum + 4
		 * i=6	sum = sum + 6
		 *
		 *....
		 * i=10	sum= sum + 10
		 * 		sum= sum + i
		 * 
		 * 반복횟수 : i는 2부터 10까지2씩 증가
		 * 규칙성 : sum= sum + i
		 * 반복문 종료 후 : sum을 출력
		 * */
		int sum = 0; //0으로 초기화
		int i = 2;
		while(i <= 10){
			sum += i;
			i += 2;
		}
		System.out.println("1부터 10까지 합 :" + sum);
	}
}
