package day05;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		

//		System.out.println("학생 1의 성적 입력 : ");
//		int score1 = scan.nextInt();
//		System.out.print(score1);
//		int student1 [] = new int [1];
//		student1[0] = score1;
//
//		System.out.println("학생 2의 성적 입력 : ");
//		int score2 = scan.nextInt();
//		System.out.print(score2);
//		int student2 [] = new int [1];
//		student2[0] = score2;
//
//		System.out.println("학생 3의 성적 입력 : ");
//		int score3 = scan.nextInt();
//		System.out.print(score3);
//		int student3 [] = new int [1];
//		student3[0] = score3;
	
	int i;
	int [] score = new int[3];
	int sum = 0;
	/* int sum = (scores[0] + scores[1] + scores[2]); */
	/*
	 * sum = sum + score[0];
	 * sum = sum + score[1];
	 * sum = sum + score[2];
	 * sum : 총점
	 */
	for(i = 0; i < score.length; i++) {
		score[i] = i + 1;
		System.out.print("학생 " + (i + 1) + "의 성적 : ");
		score[i] = scan.nextInt();
		sum += score[i]; // sum = sum + score[i];
	}
	for(i = 0; i < score.length; i++) {
		System.out.println("학생 " + (i + 1) + "의 성적 : " + score[i]);
	}
	
	/*
	 * 입력받은 성적의 평균을 구하는 코드를 작성하세요.
	 */
	
	double avg = sum / (double)score.length;
	System.out.println("학생 "+ score.length +"명의 총 점 : " + sum + ", 평균 값 : " + avg);

	}
	}


