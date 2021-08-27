package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		Set<Integer> dupSet = new LinkedHashSet<Integer>();
		for (int i : arr) {
			if (intSet.add(i) == false) {
				dupSet.add(i);
			}
		}
			System.out.println("Duplicate elements in the given set are "+dupSet);
		
	}

}
