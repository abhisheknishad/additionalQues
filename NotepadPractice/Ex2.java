import java.util.*;

class Ex2{
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
	List<String>list=new ArrayList<>();
	Set<String>keys=map.keySet();
	for(String s:keys){
	if(map.get(s).equals(match)){
		list.add(s);	
	    }	
	}
	String arr[]=new String[list.size()];
	for(int i=0;i<list.size();i++){
	arr[i]=list.get(i);
	}
	return arr;
     }
  }

	