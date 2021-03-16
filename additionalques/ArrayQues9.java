package additionalques;

import java.util.*;
import java.util.Arrays;

public class ArrayQues9 {
	public static void main(String args[]) {
		String arr[]= {"red","green","blue","ivory"};
		List<String>list=new ArrayList<>(Arrays.asList(arr));
		Collections.sort(list);
		Collections.reverse(list);
		int input=1;
		if(input==1) {
			System.out.println(list.get(0));
		}
	}

}
