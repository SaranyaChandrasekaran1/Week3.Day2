package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesSet {
	
	
	    static void removeDuplicates(String str)   
	    {     
	        //Create LinkedHashSet of type character   
	        LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	        
	    //main() method start  
	    public static void main(String args[])   
	    {   
	        //Create string variable with default value  
	        String str = "Paypal India";   
	        //removeDuplicates() method by passing the string as an argument   
	        removeDuplicates(str);   

		
        	}

}
