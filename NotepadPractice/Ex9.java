import java.util.*;

class Ex9 {
	public static void main(String args[]) {
	String arr[]= {"red","green","blue","ivory"};
	Ex9 app = new Ex9();
	int input=1;
	String result=app.getResult(arr,input);
	System.out.println(result);
   }

	public String getResult(String arr[],int input){
	List<String>list=new ArrayList<>(Arrays.asList(arr));
	Collections.reverse(list);
	if(input!=1) {
	  return null; 
	}
	return (list.get(0));
	}

}