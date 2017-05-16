/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 |_SamrtPhoneTest
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] smartphone={
			new IPhone("iPhone7","애플",900000),
			new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for(int i=0;i<2; i++){
			System.out.println(smartphone[i].toString());
			smartphone[i].turnOn();
			smartphone[i].pay();
			smartphone[i].useSpecialFunction();
			smartphone[i].turnOff();
			System.out.println();
		}
		
		

	}

}
