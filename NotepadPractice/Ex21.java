class Ex21{
	public static void main(String args[]){
	Ex21 app = new Ex21();
	String input = "test@gmail.com";
	boolean result = app.getResult(input);
	if(result){
	System.out.println("Email Verified");
	}
	else{
	System.out.println("Email Not  Verified");
	}

   }

	public boolean getResult(String str){
	if(!str.contains("@") || !str.contains(".")){
		return false;
	}
	if(!str.endsWith(".com")){
	return false;
	}
	int countAt=0,countDot=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='@'){
			countAt++;
			}
		if(str.charAt(i)=='.'){
			countDot++;
			}
	}
	if(countAt>1 || countDot>1){
	return false;
	}
	int atIndex=str.indexOf("@");
	int dotIndex=str.indexOf(".");
	String subString = str.substring(atIndex+1,dotIndex);
	if(subString.length()!=5){
	return false;
	}
	String starts=str.substring(0,atIndex);
	if(starts.length()<3){
	return false;
	}
	return true;
    }
}
