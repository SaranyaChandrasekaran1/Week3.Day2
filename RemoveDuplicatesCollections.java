package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String str = "";
		String[] splitword = text.split(" ");
		Set<String> strListArr = new LinkedHashSet<String>();
		Set<String> dupstrListArr = new LinkedHashSet<String>();
		for (int i = 0; i <splitword.length;i++)
		{
			if (strListArr.add(splitword[i]) == false) {

				dupstrListArr.add(splitword[i]);
			}
		}
		strListArr.removeAll(dupstrListArr);

		for (String StrList : strListArr) {

			System.out.print(StrList + " ");
		}


 } 

}
