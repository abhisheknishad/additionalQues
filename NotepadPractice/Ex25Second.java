class Ex25Second{
	public static void main(String args[]){
	Ex25Second app = new Ex25Second();
	String str="HelloWorld";
	String result = app.getResult(str);
	System.out.println(result);
	}
	public String getResult(String input){
	StringBuilder builder = new StringBuilder(input);
	char first = builder.charAt(0);
	char last = builder.charAt(input.length()-1);
	builder.setCharAt(0,last);
	builder.setCharAt(input.length()-1,first);
	return builder.toString();
	}
}