/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *	 |_MelonGenreChart
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Music[] m1={
				new Music("팔레트","아이유"),
				new Music("ILUV IT","싸이"),
				new Music("맞지?","언니쓰")
			};
			
		List<Music> balad = new ArrayList<Music>();
		balad.add(m1[0]); 
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(m1[1]); dance.add(m1[2]);
		
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", balad);
		map.put("댄스", dance);
		
		System.out.println("--<< 멜론 장르별 챠트   >>--");
		printMap(map);
		
		System.out.println();
		System.out.println("--<< 댄스 2위 곡 변경   >>--");
		dance.set(1, new Music("SIGNAL","트와이스"));
		printMap(map);
		
		System.out.println();
		System.out.println("--<< 댄스 1위 곡 제작   >>--");
		dance.remove(0);
		printMap(map);
		
		System.out.println();
		System.out.println("--<< 전체 리스트 삭제   >>--");
		map.clear();
		
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("["+ key + "]");
			int i =1;
			for(Music s : map.get(key)){
				System.out.println(i + "." + s.toString());
				i++;
			}
			
		}
	}
	
}
