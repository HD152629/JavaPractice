/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *	 |_DBTest
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class DBTest {
	public static void main(String[] args) {
		System.out.println("<변경 전>");
		DBTest.crud(IDBManager.getDBObject("ORACLE"));
		System.out.println();
		System.out.println("<변경 후>");
		DBTest.crud(IDBManager.getDBObject("SYBASE"));
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
