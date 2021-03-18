class Ex34{
	public static void main(String args[]){
	Ex34 app = new Ex34();
	String str1="hello";
	String str2="helloworld";
	String result=app.getResult(str1,str2);
	System.out.println(result);
    }

	public String getResult(String str1,String str2){
	int length1=str1.length();
	int length2=str2.length();
	String result="";
	if(length1==length2){
	result=str1.concat(str2);
	return result;
	}
	else if(length1<length2){
	String subString=str2.substring(str1.length());
	result=str2+str1;
	return result;
	}
	else{
	String subString=str1.substring(str2.length());
	result=str1+str2;
	return result;
	}
    }
}