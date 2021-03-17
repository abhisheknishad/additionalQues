class Ex16{
	public static void main(String args[]){
	String input="madam";
	Ex16 app = new Ex16();
	boolean result = app.getResult(input);
	System.out.println(result);
    }
 
	public boolean getResult(String input){
	int a=0,e=0,i=0,o=0,u=0;
	for(int j=0;j<input.length();j++){
	if(input.toLowerCase().charAt(j)=='a'){
	a++;
	}
	if(input.toLowerCase().charAt(j)=='e'){
	e++;
	}
	if(input.toLowerCase().charAt(j)=='i'){
	i++;
	}
	if(input.toLowerCase().charAt(j)=='o'){
	o++;
	}
	if(input.toLowerCase().charAt(j)=='u'){
	u++;
	}
}
	if(a>1 || e>1 || i>1 || o>1 || u>1){
	return false;
	}
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