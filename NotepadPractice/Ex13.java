import java.util.*;
class Ex13{
	public static void main(String args[]){
	Ex13 app = new Ex13();
	Integer sum = app.getResult(90,120);
	System.out.println(sum);
	}
	
	public boolean isPalindrome(Integer number){
	Integer sum=0;
	Integer temp = number;
	while(number!=0){
	sum=(sum*10)+number%10;
	number=number/10;
	}
	if(sum==temp){
	return true;
	}
	else{
	return false;
	}
	}

	public Integer getResult(int begin, int last){
	Integer sum=0;
	for(int i=begin;i<=last;i++){
	if(isPalindrome(i)==true){
	sum=sum+i;
	}
	}
	return sum;
	}
}