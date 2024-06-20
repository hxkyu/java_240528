package day05;

public class StarEx01 {
	public static void main(String[] args) {
	/* *을 하나씩 출력하여  중첩 반복문을 사용하여 하나씩 출력하시오
	 * ******
	 * ******
	 * ******
	 * ******
	 * ******
	 *  반복횟수 : i는 1부터 5까지 1씩 증가
	 *  규칙성 : *****을 출력
	 *  		=> 반복횟수 ㅣ j는 1부터 5까지 1씩증가
	 *  		   규칙성 : *을 출력(한줄로)
	 *  		   반복문 종료 후 : 엔터를 출력
	 *  		   반복문 종료 후 : 없음
	 *  */
	

		for(int i=1; i<=5; i++) {//for(; ;)
			for(int j=1; j<=5; j++) { //0으로 하면 5보다 작게
				System.out.print("*");
				//*****엔터를 출력
			}
			System.out.println("");// 엔터 Z("/n"), (), ("")


		}
	}
}
