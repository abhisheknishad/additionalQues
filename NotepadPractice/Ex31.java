class Ex31{
	public static void main(String args[]){
	String password="asd@kf#if";
	Ex31 app = new Ex31();
	boolean result=app.getResult(password);
	if(result){
	System.out.println("Password format is correct");
	}
	else{
	System.out.println("Password format is not correct");
	}
    }

        public boolean getResult(String password){
	if(password.length()<9){
	return false;
	}
	if(!(password.contains("@")) && !(password.contains("_")) && !(password.contains("#"))){
	return false;
	}
	if(Character.isDigit(password.charAt(0)) || password.charAt(0)=='@' ||password.charAt(0)=='#' || password.charAt(0)=='_'){
	return false;
	}
	if(password.endsWith("@") || password.endsWith("_") || password.endsWith("#")){
	return false;
	}
	return true;
    }
}	