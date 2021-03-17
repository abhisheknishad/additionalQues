class Ex23 {
	public static void main(String args[]){
	Ex23 app = new Ex23();
	String arr[]={"100","111","10100","10","1111"} ;
	String input="10";
	int result = app.getResult(arr,input);
	System.out.println(result);
    }

	public int getResult(String arr[],String input){
	int count=0;
	for(String s:arr){
	   if(s.length()>2){
		String str=s.substring(0,2);
		if(str.equals(input)){
		count++;
		}
	    }
	}
	return count;
    }
}