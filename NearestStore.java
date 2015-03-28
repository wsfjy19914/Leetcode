/**
 * Author: Jinyang Fan
 * Date: 2015/3/4
 */

import java.io.File;
import java.util.Scanner;

public class NearestStore{
    public void findNearestStore() throws Exception {
      
      //Flie input
      Scanner in = new Scanner(new File("src/task-1-in.txt"));
      int caseNum = Integer.parseInt(in.nextLine());      //Save how many cases are there in the file
      in.nextLine();
//      System.out.println(caseNum);
      
      
//      System.out.println(in.nextLine().length());
      for(int i = 0; i < caseNum; i ++)					//For each case, do the same processing
      {
    	  String userLocation = in.nextLine();	
    	  int user_x = Integer.parseInt(userLocation.split(" ")[0]);	//Record user's x coordinate
    	  int user_y = Integer.parseInt(userLocation.split(" ")[1]);	//Record user's y coordinate
//    	  System.out.println(user_x + ", " + user_y);
    	  
    	  int StoreNum = Integer.parseInt(in.nextLine());	//Save how many stores
    	  int max_index = 0;
    	  double max_distance = 2000;
    	  
    	  for(int j = 0; j < StoreNum; j ++)		//For each store, calculate its distance to the user
    	  {											//If it's shorter than the current shortest distance then update
    		 String storeLocation = in.nextLine();
    		 int store_x = Integer.parseInt(storeLocation.split(" ")[0]);
       	  	 int store_y = Integer.parseInt(storeLocation.split(" ")[1]);
       	  	 
       	  	 double distance = Math.sqrt((store_x - user_x) *(store_x - user_x) + (store_y - user_y) * (store_y - user_y));
       	  	 if(distance < max_distance)
       	  	 {
       	  		 max_distance = distance;
       	  		 max_index = j + 1;
       	  	 }
       	  	 
    	  }
    	  System.out.println("Case #" + (i + 1) + ": " + max_index + " " + max_distance);
    	  if(i == caseNum - 1)
    		  break;
    	  in.nextLine();
      }
      in.close();
    }
}
      
      
           
      



