package additionalques;

import java.util.*;

public class ListQues4 {
	
	public static void main(String args[]) {
		String arr[] = {"apple","orange","grapes"};
		List<String>list = new ArrayList<>(Arrays.asList(arr));
		List<String>list2 = new ArrayList<>(Arrays.asList("melon","apple","mango"));
		List<String>result = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			String s=list.get(i).toUpperCase();
				if(s.charAt(i)=='A'||s.charAt(i)=='G') {
					
				}
				else {
					result.add(s);
				}
			}
		
		for(int i=0;i<list2.size();i++) {
			String s=list2.get(i).toUpperCase();
			int lastIndex=s.length()-1;
				if(s.charAt(lastIndex)=='E'||s.charAt(lastIndex)=='N') {
					
				}
				else {
					result.add(s);
				}
			}
		System.out.println(result);
	
		}
		
	}

