/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_SnackTest
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			Snack[] snack  = new Snack[3];
			int total = 0;
			
			snack[0] = new Snack("새우깡","농심",1100,2);
			snack[1] = new Snack("콘칲","크라운",1200,1);
			snack[2] = new Snack("허니버터칩","해태",1500,4);
			
			for(Snack value : snack){
				System.out.println(value);
			}
			
			for(int i=0; i<3; i++){
				total += snack[i].calcPrice();
			}
			
		
			
			System.out.println("총 구매 금액 : " + String.format("%,d", total) + "원" );
//
			
			
			
			
			
			
			

	}

}
