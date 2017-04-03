/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_Question
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] questions = {"1.가장 좋아하는 가수는?","2.가장 좋아하는 배우는?","3.가장 좋아하는 과목은?"};
		String[] answers = {"김광석","박보영","공업수학"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(questions[0]);
		String singer = scanner.nextLine();
		System.out.println(answers[0].equals(singer) ? "정답입니다!" : "틀렸습니다!");
		
		System.out.println(questions[1]);
		String actor = scanner.nextLine();
		System.out.println(answers[1].equals(actor) ? "정답입니다!" : "틀렸습니다!");
		
		System.out.println(questions[2]);
		String subject = scanner.nextLine();
		System.out.println(answers[2].equals(subject) ? "정답입니다!" : "틀렸습니다!");
		
		System.out.println("<<결과 출력>>");
		for(int i=0; i<3; i++){
			System.out.println(questions[i] + " " + answers[i] + "입니다");
		}
		
		
		
		
		
		

	}

}
