class Ex26 {
	public static void main(String args[]){
	Ex26 app = new Ex26();
	int arr[]={1,2,1,3,4,5,8};
	boolean result = app.getResult(arr);
	System.out.println(result);
   }

	public boolean getResult(int arr[]){
	for(int i=0;i<arr.length;i++){
		if(arr[arr.length-2] == 1|| arr[arr.length-1]==1){
	return false;
	}
		if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3){
		return true;
		}
	}
	return false;
 }
}