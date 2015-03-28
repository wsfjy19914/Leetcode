/**
 * Author: Jinyang Fan
 * Date: 2015/3/4
 */

import java.io.File;
import java.util.*;

public class FunctionCallingCount {

	public void functionCount() throws Exception {
		//Flie input
	      Scanner in = new Scanner(new File("src/task-2-in.txt"));
	      int caseNum = Integer.parseInt(in.nextLine());
	      in.nextLine();
//	      System.out.println(caseNum);
	      
	      
//	      System.out.println(in.nextLine().length());
	      for(int i = 0; i < caseNum; i ++)					//For each case, do the same processing
	      {
	    	  String functions = in.nextLine();
	    	  String mainFunction = functions.split(" ")[0];
	    	  String countFunction = functions.split(" ")[1];
	    	  
	    	  int function = Integer.parseInt(in.nextLine());
	    	  
	    	  //Hashmap to store each function and functions it include.
	    	  HashMap<String, List<String>> func = new HashMap<String, List<String>>();
	    	  
	    	  //Put each case into the hashmap
	    	  for(int j = 0; j < function; j ++)
	    	  {
	    		  List<String> list = new ArrayList<String>();
	    		  String currentFunction = in.nextLine();
	    		  int functionIncluded = Integer.parseInt(currentFunction.split(" ")[1]);
	    		  if(functionIncluded > 0)
	    		  {
		    		  for(int k = 0; k < functionIncluded; k ++)
		    		  {
		    			  list.add(currentFunction.split(" ")[2 + k]);
		    		  }	    		  
	    		  }
	    		  else
	    			  list = null;
	    		  
	    		  func.put(currentFunction.split(" ")[0], list);    		  
	    	  }
	    	  	    	  
	    	  int output = count(mainFunction, countFunction, func);   //Call the function to count
	    	  
	    	  System.out.println("Case #" + (i + 1) + ": " + output);
	    	  
	    	  if(i == caseNum - 1)
	    		  break;
	    	  in.nextLine();
	      }
	      in.close();
	}
	
	//Recursive function for counting the objective function
	private int count(String mainFunction, String countFunction, HashMap<String, List<String>> func)
    {
    	if(func.get(mainFunction) == null)
    		return 0;
    	
    	int ct = 0;
    	
    	
    	Iterator<String> it = func.get(mainFunction).iterator();
    	while(it.hasNext())
    	{
    		String current = it.next();
    		if(current.equals(countFunction))
    			ct ++;
    		else
    		{
    			ct += count(current, countFunction, func);
    		}
    	}
    	
		return ct;
    	
    }

}
