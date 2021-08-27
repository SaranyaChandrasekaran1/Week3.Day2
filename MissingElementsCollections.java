package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsCollections {
	
	
public static void main(String[] args) {
	int count;
	int[] arr = { 1, 2, 4, 6, 7, 8 };
	List <Integer> list = new ArrayList<Integer>(arr.length);
	for(int i:arr)
	{
		list.add(i);
	}
	
	Collections.sort(list);
	count=1;
	System.out.print("Missing elements in the list are: ");
	for(int i:list)
	{
		if (i != count) {
			System.out.print(count + " ");
			count++;
		}
		count++;

	}
}
}
