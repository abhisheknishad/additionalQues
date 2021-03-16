package additionalques;

import java.util.*;

public class MapQues7 {
	public static void main(String args[]) {
		Map<Integer,Integer>map= new HashMap<>();
		map.put(1,4);
		map.put(2,6);
		map.put(4,7);
		map.put(5,9);
		Integer sum=0;
		Integer count=0;
		Set<Integer>keys=map.keySet();
		for(Integer i:keys) {
			if(i%2!=0) {
				sum+=map.get(i);
				count++;
			}
		}
		System.out.println(sum/count);
	}

}
