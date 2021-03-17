class Ex25 {
	public static void main(String args[]){
	Ex25 app = new Ex25();
	String input="I work in capgemini";
	int result = app.getResult(input);
	System.out.println(result);
    }
 
	public int getResult(String input){
	int count=0;
	for(int i=0;i<input.length();i++){
	if(input.charAt(i)==' '){
		count++;
		}
	}
	return count+1;
    }
}