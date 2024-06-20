package day02;

public class VariablelnitEx01 {

	public static void main(String[] args) {
		int num;
		//The local variable num may not have been initialized 발생
		//System.out.println(num); //num를 초기화 하지않아서 에러발생
		
		num = 10;
		
		System.out.println(num); //num를 초기화 하지않아서 에러 발생하지 않음
		
	}

}
