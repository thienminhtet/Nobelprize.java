public class MaxValue{


    public  static void main( String[]  ags ) { 
	int[] arr = {2,45,211,987,45664,45};
	int idx = 0;
	for(int i = 1;i < arr.length;i++){
	if(arr[idx] < arr[i]){
	idx = i;
}
}
	System .out. println(  "�ő�l�̃C���f�N�X�g��[" + idx + "]" ) ;
	System.out.println("�ő�l��" + arr[idx]);
    }
}