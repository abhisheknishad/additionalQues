import java.util.*;

class Ex12 {
	public static void main(String args[]){
	String details1="arun#12#12#12";
	String details2="deepak#13#12#12";
	Ex12 app = new Ex12();
	String result=app.getResult(details1,details2);
	System.out.println(result);
    }
 
	public String getResult(String details1,String details2){
	int firstIndex=details1.indexOf('#');
	String name=details1.substring(0,firstIndex);
	int secondIndex=details1.indexOf('#',firstIndex+1);
	int lastIndex=details1.lastIndexOf('#');
	String firstMarks=details1.substring(firstIndex+1,secondIndex);
	String secondMarks=details1.substring(secondIndex+1,lastIndex);
	String thirdMarks=details1.substring(lastIndex+1,details1.length());
	Integer arunFirst=Integer.parseInt(firstMarks);
	Integer arunSecond=Integer.parseInt(secondMarks);
	Integer arunThird=Integer.parseInt(thirdMarks);
	Integer arunSum=arunFirst+arunSecond+arunThird;


	int firstIndex2=details2.indexOf('#');
	String name2=details2.substring(0,firstIndex2);
	int secondIndex2=details2.indexOf('#',firstIndex2+1);
	int lastIndex2=details2.lastIndexOf('#');
	String firstMarks2=details2.substring(firstIndex2+1,secondIndex2);
	String secondMarks2=details2.substring(secondIndex2+1,lastIndex2);
	String thirdMarks2=details2.substring(lastIndex2+1,details2.length());
	Integer deepakFirst=Integer.parseInt(firstMarks2);
	Integer deepakSecond=Integer.parseInt(secondMarks2);
	Integer deepakThird=Integer.parseInt(thirdMarks2);
	Integer deepakSum=deepakFirst+deepakSecond+deepakThird;
	if(deepakSum>arunSum){
	return "deepak";
	}
	return "arun";
	}
}