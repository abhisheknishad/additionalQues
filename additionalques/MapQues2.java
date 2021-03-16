package additionalques;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapQues2 {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		String input="hari";
		List<String>list=new ArrayList<>();
		Set<String>list2=map.keySet();
		for(String s:list2) {
			if(map.get(s)==input) {
				list.add(s);
			}
		}
		System.out.println(list);

	}

}
