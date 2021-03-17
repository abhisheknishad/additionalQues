import java.util.*;

class Ex8{
	public static void main(String args[]){
	Ex8 app=new Ex8();
	List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
	List<Integer>list2=new ArrayList<>(Arrays.asList(6,7,8,9,10));
	List<Integer>result=app.getResult(list1,list2);
	System.out.println(result);
    }

     public List<Integer> getResult(List<Integer>list1,List<Integer>list2){
	List<Integer>result=new ArrayList<>();
	for(Integer i :list1){
		if(i%2==0){
		result.add(i);
                }
	}
	for(Integer i :list2){
		if(i%2==0){
		result.add(i);
                }
	}
	return result;
     }
}