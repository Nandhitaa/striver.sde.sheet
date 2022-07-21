package day01.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		int totalRows = 10;

		List<Integer> prevRow = null;
		List<Integer> currRow;

		for (int i = 0; i < totalRows; i++) {
			currRow = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					System.out.print(" " + 1 + " ");
					currRow.add(1);
				} else {
					int num = prevRow.get(j - 1) + prevRow.get(j);
					System.out.print(" " + num + " ");
					currRow.add(num);
				}
			}
			System.out.println();
			prevRow = currRow;
		}

	}

}
