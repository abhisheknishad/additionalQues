
import java.util.*;

public class Ex1{

	public static void main(String args[]){
		String arr[]={"goa","kerala","gujarat"};
		Map<String,String>result=getResult(arr);
		Set<String>key=result.keySet();
		for(String s:key){
		System.out.println(s+" "+result.get(s));
	}
}

	public static Map<String,String> getResult(String arr[]){
	Map<String,String>map=new HashMap<>();
	for(String s:arr){
		String sub=s.substring(0,3).toUpperCase();
		map.put(sub,s);
	}
	return map;
    } 
}