import java.util.*;

import java.util.stream.*;

class Ex11StreamApi{
	public static void main(String args[]){
	List<Integer>list1=new ArrayList<>(Arrays.asList(12,1,32,3));
	List<Integer>list2=new ArrayList<>(Arrays.asList(0,12,2,23));
	Ex11StreamApi app = new Ex11StreamApi();
	List<Integer>result=app.getResult(list1,list2);
	System.out.println(result);
     }

	public List<Integer> getResult(List<Integer>list1,List<Integer>list2){
	List<Integer>result1=list1.stream().filter(element->list1.indexOf(element)%2!=0).collect(Collectors.toList());
	List<Integer>result2=list2.stream().filter(element->list2.indexOf(element)%2==0).collect(Collectors.toList());
	List<Integer>result=new ArrayList<>();
	for(int i=0;i<list1.size()||i<result1.size();i++){
		if(result1.get(i)==list1.get(i)){
			result.set(i,result.get(i));
			}
		}
	for(int i=0;i<list2.size()||i<result2.size();i++){
		if(list2.get(i)==result2.get(i)){
			result.set(i,result2.get(i));
			}
		}
	return result;
	}
}