class Ex36 {
	public static void main(String args[]){
	Ex36 app = new Ex36();
	String str="education";
	boolean result=app.getResult(str);
	System.out.println(result);
    }

	public boolean getResult(String str){
	if(str.contains("a") && str.contains("a") && str.contains("a") &&	str.contains("a") && str.contains("a") ){
	return true;
	}
	return false;
   }
}