/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 |_Galaxy
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class Galaxy extends SmartPhone{

	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelssCharging(){
		System.out.println("무선 충전 기능를 이용합니다.");
	}
	
}
