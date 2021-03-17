class Ex24{
	public static void main(String args[]){
	Ex24 app = new Ex24();
	String input="hello";
	String result=app.getResult(input);
	System.out.println(result);
   }

	public String getResult(String str){
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<str.length();i++){
	if(i%2==0){
		sb.append(str.charAt(i));
	   }
	}
	String result=sb.toString();
	return result;
     }
}
	