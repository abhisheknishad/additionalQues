import java.util.*;

class Ex19{
	public static void main(String args[]){
	String arr[]={"2AA","12","ABC","c1a"};
	Ex19 app = new Ex19();
	int result = app.getResult(arr);
	System.out.println(result);
    }

	public int getResult(String arr[]){
	List<Character>list1=new ArrayList<>();
	List<Integer>list2=new ArrayList<>();
	for(String s : arr){
		char arr2[]=s.toCharArray();
		for(Character c : arr2){
			if(Character.isDigit(c)){
			list1.add(c);
			}	
		}
	}
	
	for(Character c:list1){
		list2.add(Integer.parseInt(String.valueOf(c)));
	}
	int sum=0;
	for(Integer i:list2){
		sum+=list2.get(i);
	}
	return sum;
   }
}