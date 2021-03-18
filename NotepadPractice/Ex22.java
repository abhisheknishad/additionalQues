import java.util.*;

class Ex22{
	public static void main(String args[]){
	Ex22 app = new Ex22();
	String input="helloworld";
	String result=app.getResult(input);
	System.out.println(result);
    }
 
        public String getResult(String input){
	Set<Character>set= new LinkedHashSet<>();
	for(int i=0;i<input.length();i++){
	set.add(input.charAt(i));
	}
	StringBuilder sb = new StringBuilder();
	for(Character c:set){
	sb.append(c);
	}
	return sb.toString();
     }
}