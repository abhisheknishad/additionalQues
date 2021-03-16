package additionalques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ListQues3 {

	public static void main(String[] args) {
		Integer arr1[]= {1,2,3,4};
		Integer arr2[]= {1,2,3,5};
		List<Integer>list=new ArrayList<>(Arrays.asList(arr1));
		List<Integer>list2=new ArrayList<>(Arrays.asList(arr2));
		List<Integer>result=new ArrayList<>();
		list.addAll(list2);
		
		list.retainAll(list2);
		list.removeAll(list2);
		System.out.println(list);
	}

}
