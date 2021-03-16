package additionalques;

import java.util.*;

public class MapQues6 {
	public static void main(String args[]) {
		Map<String,Integer>map=new HashMap<>();
		map.put("abc", 50);
		map.put("efg", 70);
		Map<String,String>result=result(map);
		Set<String>keySet=result.keySet();
		for(String s:keySet) {
			System.out.println(s+ ":"+result.get(s));
		}
	}
	
	public static Map<String,String> result(Map<String,Integer>map){
		Map<String,String>result=new HashMap<>();
		Set<String>keys=map.keySet();
		for(String s:keys) {
			if(map.get(s)>60) {
				result.put(s, "pass");
			}
			else {
				result.put(s, "fail");
			}
		}
		return result;
	}
}
