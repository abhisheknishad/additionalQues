import java.util.*;

class Ex3{
	public static void main(String args[]){
	List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4));
	List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,5));
	Integer result[] = getResult(list1,list2);
	for(Integer i:result){
	System.out.println(i);
	}
  }


	public static Integer[] getResult(List<Integer>list1,List<Integer>list2){
        List<Integer>unique1=new ArrayList<>(list1);
	unique1.removeAll(list2);
	List<Integer>unique2=new ArrayList<>(list2);
	unique2.removeAll(list1);
	List<Integer>unique=new ArrayList<>();
	unique.addAll(unique1);
	unique.addAll(unique2);
	Integer arr[]=new Integer[unique.size()];
	for(int i=0;i<unique.size();i++){
      		arr[i]=unique.get(i);
        }
	return arr;
   }
}