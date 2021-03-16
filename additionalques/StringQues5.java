package additionalques;

public class StringQues5 {

	public static void main(String args[]) {
		String str ="Hello*World";
		int index=str.indexOf("*");
		if(str.charAt(index-1)==str.charAt(index+1)) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
	}
}
