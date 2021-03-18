class Ex32 {
	public static void main(String args[]){
	Ex32 app = new Ex32();
	String str="ABD8080C";
	boolean result=app.getResult(str);
	if(result){
	System.out.println("Pan Number format is correct");
	}
	else{
	System.out.println("Pan Number format is not correct");
	}
    }

	public boolean getResult(String str){
	if(str.length()!=8){
	return false;
	}
	for(int i=0;i<3;i++){
	if(Character.isDigit(str.charAt(i))){
	return false;
	}	
	}
	for(int i=3;i<7;i++){
	if(Character.isAlphabetic(str.charAt(i))){
	return false;
	}
	}
	for(int i=0;i<str.length();i++){
	if(Character.isLowerCase(str.charAt(i))){
	return false;
	}
	}
	if(Character.isDigit(str.charAt(str.length()-1)) || Character.isLowerCase(str.charAt(str.length()-1))){
	return false;
	}
	return true;
    }
}
	