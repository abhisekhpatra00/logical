package basic.array;

import java.util.Arrays;

public class ArrayLogical {
	 public static int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

public static void main(String[] args) {
	System.out.println(array.length);
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
	Arrays.sort(array);  // this will sort the array into ascending order
	for(int i:array) {
		System.out.println(i);
	}
	//search a data exist or not
	//let the data is -9
	
	for(int i=0;i<array.length-1;i++) {
		
			if(array[i]==-9) {
				System.out.println("-9 exist at index"+i);
			}
		}
	}
}




