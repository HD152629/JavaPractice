/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_PrimitiveDataType
 * 
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author		: JEON
 * @version		: 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 25;
		double height = 161.8;
		float weight = 44.3F;
		char bloodtype = 'A';
		String name = "아이유";
		boolean isMale = true;
		
		System.out.printf("<<아이유 프로필>>\n");
		System.out.println("이름 :" + name);
		System.out.println("성별 :" + ((isMale) ? "여자" : "남자"));
		System.out.println("나이 :" + age + "세");
		System.out.println("키 :" + height + "cm");
		System.out.println("몸무게 :" + weight +"kg");
		System.out.println("혈액형:" + bloodtype+"형");
		

	}

}
