import java.util.*;

class Ex18{
	public static void main(String args[]){
	Ex18 app = new Ex18();
	Integer array[]={10,10,20,30,76};
	Integer input=10;
	Integer result[]=app.getResult(array,input);
	for(Integer i:result){
	System.out.println(i);
	}
   }


	public Integer[] getResult(Integer array[],Integer input){
	List<Integer>list= new ArrayList<>();
	for(int i=0;i<array.length;i++){
		if(array[i]!=input){
			list.add(array[i]);
			}
	}
	Integer result[]=list.toArray(new Integer[0]);
	return result;
	}
}