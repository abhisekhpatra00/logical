package basic.logical;

import java.util.ArrayList;
import java.util.List;

public class PatternPrinting {

	public static void main(String[] args) {
		int row = 4;
		int column = 4;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
		for (int k = 0; k <= row; k++) {
			for (int l = 0; l < k; l++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

//find duplicate
		int[] no = { 1, 2, 5, 1, 2, 7, 1, 9, 7 };
		for (int n = 0; n < no.length; n++) {
			int a = no[n];
			for (int m = n + 1; m < no.length; m++) {
				int b = no[m];
				if (a == b) {

					if (list.contains(b))
						break;
					else
						list.add(b);

				}
			}

		}
		System.out.println(list);
	}

}