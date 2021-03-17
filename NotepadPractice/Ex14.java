import java.util.*;

class Ex14{
	public static void main(String args[]){
	Ex14 app = new Ex14();
	Map<Integer,Integer>map=new HashMap<>();
	map.put(12,90);
	map.put(35,90);
	map.put(33,90);
	map.put(56,88);
	Integer result = app.getResult(map);
	System.out.println(result);
    }

	public Integer getResult(Map<Integer,Integer>map){
	Set<Integer>keys=map.keySet();
	List<Integer>list=new ArrayList<>();
	for(Integer i :keys){
	if(i%2!=0){
		list.add(map.get(i));
	   }
	}
	int sum=0;
	int count=0;
	for(Integer i:list){
	sum+=i;
	count++;
	}
	return sum/count;
   }
}
	