package day07;

import java.util.Arrays;

public class ArrayInitiallzeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr1));//배열에있는거 하나씩 꺼내서 한줄 출력
		//뉴 자료형을 잘 쓰자 !
		arr1 = new int[] {5,4,3,2,1};
		
		System.out.println(Arrays.toString(arr1));
		
		int [] arr2 = {3,4,5,6,7};
		
		System.out.println(Arrays.toString(arr2));
		// arr2 = {7,6,5,4,3};//에러 발생. 불가능
	}

}
