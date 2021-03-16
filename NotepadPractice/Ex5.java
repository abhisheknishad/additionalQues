import java.util.*;


class Ex5{
	public static void main(String args[]){
	String str="Hello*World";
	boolean result=getResult(str);
	System.out.println(result);
	}
	
	public static boolean getResult(String str){
	int index=str.indexOf("*");
	if(str.charAt(index-1)==str.charAt(index+1)){
	return true;
	}
	else{
		return false;
		}
	}
}