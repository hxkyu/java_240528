package day08;

import java.util.Arrays;

public class ArraySortEx02 {

	public static void main(String[] args) {
		String [] arr = new String[] {"apple","a","zoo","banana"};
				
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j< arr.length-1; j++) {
				//문자열.compareto(문자열2) : 문자열 1과 문자열2를 알파벳순으로 놓았을때
				//같으면 0, 문자열1이 앞이면 음수, 문자열 1이 뒤이면 양수
				//apple과 a를 비교하면
				//apple의 a와 a의 a를 비교 같으니까 다음 문자로 이동
				//apple의 p와 a의 다음이 없어서 a가 앞으로
				//같으면 0, 문자열1이 앞이면 음수, 문자열 1이 뒤이면 양수
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
