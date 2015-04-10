/**
 * Author: Jinyang Fan
 * Date: 2015/3/4
 */

import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("asdb");
        int[] a = {1,2,3,4,5};
		int[] b = Arrays.copyOfRange(a, 0, 2);

        for(int i : a)
            System.out.println(i);

        for(int i : b)
            System.out.println(i);

      
    }
    
   
    
    
}
      
      
           
      



