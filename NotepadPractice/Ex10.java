import java.util.*;

class Ex10{
	public static void main(String[] args) {	
	Ex10 app =new Ex10();
        List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4));
	List<Integer>list2=new ArrayList<>(Arrays.asList(3,4,5,6));
	Integer result= app.getResult(list1,list2);
	System.out.println(result);
    }
	public Integer getResult(List<Integer>list1,List<Integer>list2){
	list1.retainAll(list2);
        Integer sum=0;
        for(int i:list1) {
        	sum+=i;
        }
	return sum;
    }
}