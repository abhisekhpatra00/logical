package basic.array;

public class ArrayBubbleSort {
	public static int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 ,2,20};
	public static void main(String[] args) {
   int temp;
   int length =array.length;
		for(int i=0;i<length;i++) {
    	 for(int j=0;j<length-(1+i);j++) {
    		 if(array[j]>array[j+1]) {
    		 temp=array[j];	
    		 array[j]=array[j+1];
    		 array[j+1]=temp;
             
    		 }
    	 }
    	 
     }	
		for(int i:array) {
			System.out.println(i);
		}
	}
}

/*
 * 1)for loop increase by one after every partial short until it reaches to its length value
 * 1)for loop increase by one after every 2 number get sorted until it reaches length -(i+1) ( i+1 bcz the last values getting shorted by default better not to compare those values) 
 *    -compare to get the bigger value
 *      -if true get the bigger number 
 *      -if false both are in sorted order
 *    -replace the values big<--small
 *    -assign the big value to the empty place
 * 
 * 
 * 
 */
