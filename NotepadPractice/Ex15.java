class Ex15{
	public static void main(String args[]){
	int input=125;
	Ex15 app = new Ex15();
	int result=app.getResult(input);
	System.out.println(result);
   }

	public int getResult(int number){
	int sum=0;
	while(number!=0){
	int mod=number%10;
	int fact=mod*mod;
	sum+=fact;
	number/=10;
	}
	return sum;
   }
}