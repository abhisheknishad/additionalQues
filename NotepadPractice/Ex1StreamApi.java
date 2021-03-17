import java.util.*;
import java.util.stream.*;
class Ex1StreamApi{
	public static void main(String args[]){
		Ex1StreamApi app = new Ex1StreamApi();
		String arr[]={"goa","kerala","gujarat"};
		Map<String,String>result=app.getResult(arr);
		System.out.println(result);
	}

	
	public Map<String,String> getResult(String arr[]){
	List<String> list = Arrays.asList(arr);
	Map<String, String> map = new HashMap<>();
	List<String> keysInUpperCase = list.stream().map(element -> element.substring(0,3).toUpperCase	()).collect(Collectors.toList());
	for(int i =0;i<list.size();i++){
	map.put(keysInUpperCase.get(i),arr[i]);
	}
	return map;
	}
}