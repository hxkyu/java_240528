package day05;

public class LCMex01 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 작성하시오
		 * A의 배수 B : B를 A로 나누었을때 나머지를 A의 배수라고 표현
		 * 6의 배수 : 6, 12, 18, 24, 30, ...
		 * 8의 배수 : ...
		 * 공배수 : 두 수의 배수 중 공통으로 있는 수
		 * 6과 8의 공배수 : 24, 48, 72,...
		 * 최소 공배수 : 두수의 공배수 중 가장 작은 수
		 * 6과 8의 최소 공배수 : 24
		 * 반복횟수 : i는 1부터 무한대까지 1씩 증가
		 * 규칙성 : i가 num1의 배수이고 i가 unm의 배수이면 i를 출력한 후 반복문을 종료
		 * 		 =>i가 num1로 나누었을 때 나머지가 0과 같고 i를 num2로 나누었을때 0과 같다면
		 * 반복문 종료 후 : 없음
		 * */
		
		int num1 = 111 , num2 = 30000;
		int i;
		 //증가시 for문 많이 사용
		for(i = 1; ;i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + "과" + num2 + "의 최소 공배수 :" + i);
				break;//반복문 종료
			
		}
	}
		/* 반복횟수 : i는 num1부터 무한대까지 num1씩 증가 => i는 num의 배수들만 사용
		 * 규칙성 : i는 num2의 배수이면 i를 출력하고 반복문 종료 
		 * 반복문 종료 후 : 없음*/
		
		//num1이 num2q보다 작으면 num1과 num2를 바꾸는 코드(두 수를 바꾸는 코드 자주사용)
		//num1이 111이고 
		int tmp;//임시
		if(num1 < num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(i = num1; ; i += num1) {
			if(i % num2 == 0) {
				System.out.println(num1 + "과" + num2 + "의 최소 공배수 :" + i);
				break;//반복문 종료
			}
		}
		}
	
}

