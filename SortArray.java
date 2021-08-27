package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "Aspire systems", "cts", "wipro", "hcl" };
		List<String> strlist = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(strlist);
		int listsize = strlist.size();
		System.out.println("The Length of the array is:" + listsize);

		Collections.sort(strlist);

		Collections.reverse(strlist);
		System.out.println("Reversed List");
		System.out.println(strlist);

	}
}
