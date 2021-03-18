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
	if(!password.contains("@") && !password.contains("#")){
	return false;
	}
	char ch=password.charAt(0);
	if(Character.isDigit(ch)){
	return false;
	}
	return true;
    }
}	