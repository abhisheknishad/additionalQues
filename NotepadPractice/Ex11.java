import java.util.*;

class Ex11{
	public static void main(String args[]){
	List<Integer>list1=new ArrayList<>(Arrays.asList(12,1,32,3));
	List<Integer>list2=new ArrayList<>(Arrays.asList(0,12,2,23));
	Ex11 app = new Ex11();
	List<Integer>result=app.getResult(list1,list2);
	System.out.println(result);
     }

	public List<Integer> getResult(List<Integer>list1,List<Integer>list2){
	List<Integer>result=new ArrayList<>();
	for(int i=0;i<list1.size();i++){
	    if(i%2!=0){
		result.add(list1.get(i));	
		    }
 		}
	for(int i=0;i<list2.size();i++){
	    if(i%2==0){
		result.add(list2.get(i));	
		    }
 		}
	return result;
	}
}