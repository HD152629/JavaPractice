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
		
		StringBuilder result = new StringBuilder("<<결과 출력>>");
		
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<3; i++){
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			System.out.println(answers[i].equals(answer) ? "정답입니다!" : "틀렸습니다!");
		}
		
		System.out.println(result.append("\n").append(questions[0]).append(" "+answers[0]+"입니다\n").append(questions[1]).append(" "+answers[1]+"입니다\n").append(questions[2]).append(" "+answers[2]+"입니다\n"));
		
		
		
		
		
	

	}

}
