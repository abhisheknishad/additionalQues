class Ex16{
	public static void main(String args[]){
	String input="madam";
	Ex16 app = new Ex16();
	boolean result = app.getResult(input);
	System.out.println(result);
    }
 
	public boolean getResult(String input){
	StringBuilder str = new StringBuilder() ;
	for(int j=input.length()-1;j>=0;j--){
	str.append(input.charAt(j));
	}
	String strResult=str.toString();
	if(input.equals(strResult)){
	return true;
	}
	else{
	return false;
	}
   }
}