class Ex28{
	public static void main(String args[]){
	String input="so";
	Ex28 app = new Ex28();
	String result=app.getResult(input);
	System.out.println(result);
    }

	public String getResult(String str){
	int length=str.length();
	String result="";
	if(length==2){
	for(int i=0;i<3;i++){
	result+=str;
	}
	}
	if(length==3){
	for(int i=0;i<3;i++){
	result+=str;
	}
	}
	return result;
    }
}