/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_FamilyMember
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class FamilyMember {

	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(){
		
	}
	
	public FamilyMember(String MemberName){
		this.memberName = MemberName;
		memberCnt++;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
	
	
}
