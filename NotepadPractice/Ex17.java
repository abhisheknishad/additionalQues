class Ex17{
	public static void main(String args[]){
	Ex17 app = new Ex17();
	String arr[] ={"aaa","bb","cccc","d"};
	String input="bb";
	int count = app.getResult(arr,input);
	System.out.println(count);
   }
  
   
	public int getResult(String arr[],String input){
	int length=input.length();
	int count=0;
	for(String s :arr){
		if(s.length()!=length){
			count++;
		   }
	}
	return count;
    }
}