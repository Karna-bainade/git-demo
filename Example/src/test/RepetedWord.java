package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class RepetedWord {

	public static void main(String[] args) {
		String str="my name is karan is";

/*		char[] arr=str.toCharArray();
		LinkedHashMap<Character, Integer> map1=new LinkedHashMap<Character, Integer>();

		for (char c: arr) {
			
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}else {
				
				map1.put(c, 1);
			}
			
		}
		System.out.println(map1);
	*/
		//-==============================================
		
		String[] arr=str.split(" ");
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		
		for (String str1: arr) {
			
			if (map1.containsKey(str1)) {
				
				map1.put(str1, map1.get(str1)+1);
			}else {		
				map1.put(str1, 1);
			}
		}
		System.out.println(map1);
		

	for (Map.Entry ent: map1.entrySet()) {
		
		System.out.println(ent.getKey()+"="+ent.getValue());
	}
	
	}

}
