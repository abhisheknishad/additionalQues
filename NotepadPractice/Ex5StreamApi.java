import java.util.*;

import java.util.function.*;


class Ex5StreamApi{
	public static void main(String args[]){
	String str="Hello*World";
	Ex5StreamApi app = new Ex5StreamApi();
	boolean result=app.getResult(str);
	System.out.println(result);
	}
	
	public boolean getResult(String str){
	if(!str.contains("*")){
	return false;
	}
	int index=str.indexOf("*");
	Predicate<String>predicate=(str2)->str2.charAt(index-1)==str2.charAt(index+1);
	boolean result=predicate.test(str);
	return result;
	}
}