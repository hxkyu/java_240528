package day08;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		/*정수 배열이 주어지고 주어진 배열에 원하는 정수가 있는지 없는지 확인하는 코드를 작성하세요.
		 * 단 메서드를 이용*/
		int [] arr = new int[] {3,5,2};
		int num = 3;
		if(contains(arr,num)) {
			System.out.println(num + "는"  + Arrays.toString(arr) + "배열에 있습니다");	
		}
		else {
			System.out.println(num + "는"  + Arrays.toString(arr) + "배열에 없습니다");
		}
	}
	/**기능 : 정수 배열이 주어지면 배열에 정수 num가 있는지 없는지 알려주는 메서드
	 * 매개변수 : 정수 배열과 정수 num => int [] arr, int num
	 * 리턴타입 : 정수 num가 배열에 있는지 없는지 => boolean(둘중에하나)
	 * 메서드명 : contains
	 * */
	public static boolean contains(int []arr, int num) {
		//배열이 null이면 false를 리턴
		if(arr == null) {
			return false;
		}
		
		//반복문을 이용하여 배열 전체를 탐색
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		
		return false;
	}

}
