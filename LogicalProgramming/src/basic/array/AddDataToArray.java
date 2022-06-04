package basic.array;

import java.util.Arrays;

//add a data to array with sorted order only if it is not available in that list
public class AddDataToArray {
	private int arr[] = {-1,0,5,6,3,4,-8,20};

	public int[]  addElement(int element) {
		
		int[] array;
	   Arrays.sort(arr);
	   
	   int index= Arrays.binarySearch(arr, element);
	   int elemetIndex =-(index)-1;
	   
	   if(index>0?true:false) {
		 
		  array = new int[arr.length+1];
		  for(int i=0;i<arr.length;i++) {
			  if(i<elemetIndex) {
				  array[i]=arr[i];
			  }
			  else if(i==elemetIndex) {
				  array[i]=element;
			  }
			  else
				  array[i]=arr[i-1];
				  
		  }
	   return array;
	   }
	   else
		   System.out.println("element available");
	   return arr;
		
		
	}
	
	
	public static void main(String[] args) {
	AddDataToArray add = new AddDataToArray();
	System.out.println(add.addElement(5));
	
}
}
