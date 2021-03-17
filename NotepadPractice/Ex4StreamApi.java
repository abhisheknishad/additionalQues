import java.util.*;
import java.util.stream.*;

class Ex4StreamApi{
	public static void main(String args[]){
	List<String>list1=new ArrayList<>(Arrays.asList("apple","orange","grapes"));
	List<String>list2=new ArrayList<>(Arrays.asList("melon","apple","mango"));
	List<String>result=getResult(list1,list2);
	for(String s:result){
	System.out.println(s.toLowerCase());
	}
   }

	public static List<String> getResult(List<String>list1,List<String>list2){
	List<String>result=new ArrayList<>();
	List<String>result1=list1.stream().filter(element->!element.toLowerCase().startsWith("a") && !element.toLowerCase().startsWith("g")).collect(Collectors.toList());
	List<String>result2=list2.stream().filter(element->!element.toLowerCase().endsWith("n")  && !element.toLowerCase().endsWith("e")).collect(Collectors.toList());
	result.addAll(result1);
	result.addAll(result2);
	return result;
 }
}