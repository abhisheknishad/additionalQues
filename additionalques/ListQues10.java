package additionalques;

import java.util.Arrays;
import java.util.*;

public class ListQues10 {

	public static void main(String[] args) {

		List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer>list2=new ArrayList<>(Arrays.asList(3,4,5,6));
		List<Integer>result=new ArrayList<>();
        list1.retainAll(list2);
        int sum=0;
        for(int i:list1) {
        	sum+=i;
        }
        System.out.print(sum);
	}

}
