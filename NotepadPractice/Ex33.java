class Ex33 {
	public static void main(String args[]){
	Ex33 app = new Ex33();
	String str="this was great";
	boolean result=app.getResult(str);
	if(result){
	System.out.println("true");
	}
	else{
	System.out.println("true");
	}
    }


	public boolean getResult(String str){
	if(str.charAt(0)==str.charAt(str.length()-1)){
	return true;
	}
	return false;
    }
}