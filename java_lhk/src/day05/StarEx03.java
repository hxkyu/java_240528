package day05;

public class StarEx03 {

	public static void main(String[] args) {
		/* 		 *		i=1,
		 *	    **		i=2,
		 * 	   ***		i=3,
		 *	  ****		i=4,
		 *	 ***** 		i=5,
		 *				공백=5-i  *=i개
		 * 반복횟수 : i는 5-1부터 *을 i개 출력 후 엔터
		 * 규칙성 : 공백을 출력
		 * 		=> 반복횟수 :j는 1부터 5-i까지 1씩증가
		 * 		   규칙성 : *을 출력
		 * 	       반복문 종료 후 : 엔터출력
		 * 반복문 종료 후 : 없음
		 * */
		
		int i, j, n;
		char star = '*';
		
		// i는 1부터 5까지 1개씩 증가
		for(i = 1; i <= 5; i++) {
			// 공백을 (5-i)개 출력하고
			for(j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			// *을 i개 출력
			for(j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}