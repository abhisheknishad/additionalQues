import java.util.*;
import java.util.stream.*;

class Ex2StreamApi{
	public static void main(String args[]){
		Map<String,String>map=new HashMap<>();
		map.put("ram","hari");
		map.put("cisco","barfi");
		map.put("honeywell","cs");
		map.put("cts","hari");
		String toFindKeyOf="hari";
		String result[]=getResult(map,toFindKeyOf);
		for(String s:result){
		System.out.println(s);	
		}
	}

	public static String[] getResult(Map<String,String>map,String match){
	Set<String> keys = map.keySet();
	 List<String>keysList=keys.stream().
	                        filter(key->{
	    String value=map.get(key);
	     return value.equals(match);	  
	    }  	   	
	   ). collect(Collectors.toList());		
	   
	       String array[]=keysList.toArray(new String[0]);
	   	return array;
     }
  }

	