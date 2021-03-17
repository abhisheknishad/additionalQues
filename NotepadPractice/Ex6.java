import java.util.*;


class Ex6
{
	public static void main(String args[]){
		Map<String,Integer>map=new HashMap<>();
		map.put("abc", 50);
		map.put("efg", 70);
		Ex6 app= new Ex6();
		Map<String,String>result=app.getResult(map);
		Set<String>keySet=result.keySet();
		for(String s:keySet) {
			System.out.println(s+ ":"+result.get(s));
		}
	}

	public Map<String,String> getResult (Map<String,Integer>map){
		Map<String,String>result=new HashMap<>();
		Set<String>keys=map.keySet();
		for(String s:keys) {
			if(map.get(s)>60) {
				result.put(s, "pass");
			}
			else {
				result.put(s, "fail");
			}
		}
		return result;
	}
}
