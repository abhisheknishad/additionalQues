class Ex20{
	public static void main(String args[]){
	Ex20 app = new Ex20();
	String arr[]={"Vikash","Lokesh","Ashok"};
	System.out.print('"');
	for(String s :arr){
	if(s.equals("Ashok")){
	System.out.print(s);
	break;
	}
	System.out.print(s+",");
	}
	System.out.println('"');
   }
}
		