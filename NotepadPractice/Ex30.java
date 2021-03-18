class Ex30{
	public static void main(String args[]){
	Ex30 app = new Ex30();
	boolean result = app.getResult("0201103311");
	System.out.println(result);
	}

	public boolean getResult(String str){
	int sum=0;
	int counter = 10;
	for(int i=0;i<str.length();i++){
	char character = str.charAt(i);
	String digit = Character.toString(character);
	Integer element = Integer.parseInt(digit);
	sum=sum+(element*counter);
	counter--;
	}
	return (sum%11==0);
	}
}