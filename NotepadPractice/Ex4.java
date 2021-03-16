import java.util.*;

class Ex4{
	public static void main(String args[]){
	List<String>list1=new ArrayList<>(Arrays.asList("apple","orange","grapes"));
	List<String>list2=new ArrayList<>(Arrays.asList("melon","apple","mango"));
	List<String>result=getResult(list1,list2);
	for(String s:result){
	System.out.println(s.toLowerCase());
	}
   }

	public static List<String> getResult(List<String>list3,List<String>list4){
	List<String>result=new ArrayList<>();
	for(int i=0;i<list3.size();i++) {
			String s=list3.get(i).toUpperCase();
				if(s.charAt(i)=='A'||s.charAt(i)=='G') {
					
				}
				else {
					result.add(s);
				}
			}
		
		for(int i=0;i<list4.size();i++) {
			String s=list4.get(i).toUpperCase();
			int lastIndex=s.length()-1;
				if(s.charAt(lastIndex)=='E'||s.charAt(lastIndex)=='N') {
					
				}
				else {
					result.add(s);
				}
			}
        return result;
}
}