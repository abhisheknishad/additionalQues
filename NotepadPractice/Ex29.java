class Ex29{
	public static void main(String args[]){
	Ex29 app = new Ex29();
	String str="hello";
	int input=2;
	String result=app.getResult(str,input);
	System.out.println(result);
    }

	public String getResult(String str,int input){
	String subString=str.substring(str.length()-input,str.length());
	String result="";
	for(int i=0;i<input;i++){
	result+=subString;
	}
	return result;
    }
}