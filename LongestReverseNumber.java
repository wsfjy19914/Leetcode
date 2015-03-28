/**
 * Author: Jinyang Fan
 * Date: 2015/3/4
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestReverseNumber{

    public void longest() {
      
      //Flie input
		Scanner in = null;
		try {
			in = new Scanner(new File("src/pi-100M.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String s = in.nextLine();
      in.close();
           
      s = s.substring(2, s.length());       //Cut from float point
      
//      System.out.println(s.length());     //Confirm length of string
 
      
//      s = "5123432178912344321";   //test cases
      
      String currentLongest = null;         //Save current longest substring that fulfill the condition
      int maxLength = 0;					//Save the length of current longest substring
      
      for(int i = 1; i < s.length() - 1; i ++)			//Traverse the whole string
      {
    	  //12321-like
    	  if(s.charAt(i - 1) == s.charAt(i + 1))		//For each character, check its left and right,
    	  {												//if they are the same, check one more next to them
    		  int j = 1;  
    		  int currentLength;
    		  while(j <= i && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j)) 
    		  {
    			  j ++;
    		  }
    		  
    		  currentLength = 2 * (j - 1) + 1;
    		  if(currentLength > maxLength)
    		  {
    			  maxLength = currentLength;
    			  currentLongest = s.substring(i - j + 1, i + j);
    		  }
    		  
    	  }
    	  
    	  //12344321-like
    	  if(s.charAt(i) == s.charAt(i + 1))			//For each character, check the next character,
    	  {												//if they are the same, do similar check as 12321-like
    		  int j = 1;
    		  int currentLength;
    		  while(j <= i && i + j + 1 < s.length() && s.charAt(i - j) == s.charAt(i + j +1))
    		  {
    			  j ++;
    		  }
    		  
    		  currentLength = 2 * j;
    		  if(currentLength > maxLength)
    		  {
    			  maxLength = currentLength;
    			  currentLongest = s.substring(i - j + 1, i + j + 1);
    		  }
    	  }
    			  
      }
      System.out.println(maxLength);
      System.out.println(currentLongest);
    }
}

