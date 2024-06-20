package day05;

public class RandomEx01 {

	public static void main(String[] args) {
		/* min ~ max사이의 정수를 랜덤으로 만드는 코드 설명 예제
		 * math.random()은 0이상 1미만의 랜덤한 실수를 생성해 줌
		 * 
		 * 0 <= r < 1
		 * 위 식에서 각 항에 min을 더해줌
		 * 0 + min <= r * (max-min+1) < 1*
		 * 
		 * 0 < = r * (max-min+1) < max - min + 1
		*/
		
		int min = 1, max = 7;
		int random = (int)(Math.random() * (max - min) + min);
		System.out.println("랜덤 수 :");

	}

}
