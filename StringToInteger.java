package test;

import java.util.Stack;

public class StringToInteger {

public int atoi(String str) {
		
		if(str.length() == 0)
			return 0;
		
		Stack<Integer> stack = new Stack<Integer>();

		int plus = 0;
		int minus = 0;
		
        char[] ch = str.toCharArray();
        for(char c : ch)
        {
        	if(c >= '0' && c <= '9')
        		stack.push(c - 48);        	
        	else if(c == '+')
        	{
        		if(minus == 1 || plus == 1)
        			return 0;
        		stack = new Stack<Integer>();
        		stack.push(0);
        		plus = 1;
        		
        	}
        	else if(c == '-')
        	{
        		if(minus == 1 || plus == 1)
        			return 0;
        		stack = new Stack<Integer>();
        		stack.push(0);
        		minus = 1;
        		
        	}
        	else if(c != ' ' && stack.isEmpty())
        		return 0;
        	else if(!stack.isEmpty())
        	    break;
        		
        	
        }
        
        if(stack.isEmpty())
        	return 0;
        else
        {
        	long result = 0;
        	long i = 1;
        	while(!stack.isEmpty())
        	{
        		result += stack.pop() * i;
        		if(minus == 0 && result > Integer.MAX_VALUE)
            	    return Integer.MAX_VALUE;
            	else if(minus == 1 && (result * (-1)) < Integer.MIN_VALUE)
            		return Integer.MIN_VALUE;
        		i *= 10;
        	}
        	
        	
        	if (minus == 1)
        		return (int)result * (-1);
        	else
        		return (int)result;
        	
        }        
    }

}
