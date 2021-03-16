package additionalques;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques1 {

	public static void main(String[] args) {
		String stringarr[]= {"goa","kerala","gujarat"};
		List<String>list=new ArrayList<>();
		for(String s:stringarr) {
			list.add(s.substring(0, 3).toUpperCase());
		}
		Map<String,String>map=new HashMap<>();
		for(int i=0;i<list.size();i++) {
			map.put(stringarr[i], list.get(i));
		}
		Set<String>key=map.keySet();
		for(String s:key) {
			System.out.print(map.get(s)+":"+s+"   ");
		}

	}

}
