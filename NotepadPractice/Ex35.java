class Ex35{
	public static void main(String args[]){
	Ex35 app = new Ex35();
	String input = "Honesty is the best policy";
	String result = app.getResult(input);
	System.out.println(result);
    }

	public String getResult(String str){
	String arr[]=str.split(" ");
	String result="";
	for(int i=0;i<arr.length-1;i++){
	   for(int j=i+1;j<arr.length;j++){
		if(arr[i].length()>arr[j].length())
		result=arr[i];
		} 
	}
	return result;
   }
}