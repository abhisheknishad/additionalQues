class Ex27{
	public static void main(String args[]){
	String input1="AAA/abb/CCC";
	char input2='/';
	Ex27 app = new Ex27();
	String result[]=app.getResult(input1,input2);
	for(String s:result){
		System.out.println(s);
	}
    }

	public String[] getResult(String input1,char input2){
	int firstIndex=input1.indexOf('/');
	int secondIndex=input1.indexOf('/',firstIndex+1);
	int lastIndex=input1.indexOf('/');
	String subString1=input1.substring(0,firstIndex);
	String subString2=input1.substring(firstIndex+1,secondIndex);
	String subString3=input1.substring(secondIndex+1,input1.length());
	System.out.println(subString1);
	System.out.println(subString2);
	System.out.println(subString3);
	return 
     }
}
	