package day08;

import java.util.Arrays;

public class ArraySortEx01 {

	public static void main(String[] args) {


			/* 정수형 배열을 버블 정렬을 이용하여 정렬하는 예제
			 * 버블정렬 시간 복잡도는 O(n) = n의 2제곱(현재 예제)
			 * nlogn = nxlogxn = 100xlogx100 같은 느낌 */
			int [] arr = new int [] {1,6,3,2,9,10,4,5};
			
			for(int i = 0; i < arr.length - 1; i++) { // 하나씩 돌 때마다 -1를 하는 이유는 어차피 확정 된 값을 알기 때문에 시간 복잡도를 조금이라도 절약하기 위해 -1한 것임.
				for(int j = 0; j < arr.length - 1; j++) {
					// 앞의 숫자가 크면 뒤로 보냄
					// 앞의 숫자가 크면 뒤의 숫자와 값을 교환
					if(arr[j] > arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
			
		}

	}
		// 실행하면 나오는 코드 -> [1, 2, 3, 4, 5, 6, 9, 10]