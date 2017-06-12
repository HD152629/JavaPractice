/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *	 |_MelonChart
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class MelonChart {
	public static void main(String[] args) {
	
		Music[] m1 = {
			new Music("ILUV IT","PSY"),
			new Music("맞지?","언니쓰")
		};

		
		List<Music> list1 = new ArrayList<Music>();
		list1.add(m1[0]); list1.add(m1[1]); 
		
		System.out.println("--<< 멜론 차트 >>--");
		printList(list1);
		
		System.out.println();
		System.out.println("--<< 2위 곡 추가 >>--");
		list1.add(1, new Music("SIGNAL","트와이스"));
		printList(list1);
		
		System.out.println();
		System.out.println("--<< 3위곡 변경 >>--");
		list1.set(2, new Music("팔레트","아이유"));
		printList(list1);
		
		System.out.println();
		System.out.println("--<< 2위 곡 삭제 >>--");
		list1.remove(1);
		printList(list1);
		
		System.out.println();
		System.out.println("--<< 전체 리스트 삭제 >>--");
		list1.clear();
		printList(list1);
		
			
	}
	
	public static void printList(List<Music> list){
		int i=1;
		for(Music s : list){
			System.out.println(i+". " + s.toString());
			i++;
		}
	}
	
	
}
