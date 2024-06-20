package day05;

public class StarEx02 {

	public static void main(String[] args) {
		/* *		공백=4, *=1,
		 * **		공백=3, *=1,
		 * ***		공백=2, *=1,
		 * ****		공백=1, *=1,
		 * ***** 	공백=0, *=1
		 * 			공백=?, *= i개
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : 공백 ?개 출력하고 *을 i개로 출력 후 엔터
		 * 		=> 반복횟수 :j는 1부터 ?까지 1씩증가
		 * 		   규칙성 : 공백 출력
		 * 	       반복문 종료 후 : 없음
		 * 		=> 반복횟수 :j는 1부터 i까지 1씩증가
		 * 		   규칙성 : *을 출력
		 * 	       반복문 종료 후 : 엔터출력
		 * 반복문 종료 후 : 없음
		 * */
		
		int i, j;
		char star = '*';
		
		// i는 1부터 5까지 1개씩 증가

		for(i = 0; i < 5; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}
