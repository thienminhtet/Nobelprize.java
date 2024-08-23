public class August25{


    public  static void main( String[]  ags ) { 
	int[] arr = {2,45,2,553,222,5};
	int max = arr[0];
	for(int x : arr){
	if(max < x){
	max = x;
}
}
	System .out. println( "最大値" + max  ) ;
    }
}
