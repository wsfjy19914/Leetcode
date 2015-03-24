package test;

import java.util.Stack;


public class LongestValidParentheses {

	public int longestValidParentheses(String s) {
		if(s.length() == 0)
			return 0;
		int maxLength = 0;
		
		int last = -1;
		
		Stack<Integer> stack = new Stack<Integer>();
		
        for(int i = 0; i < s.length(); i ++)
        {
        	if(s.charAt(i) == '(')
        		stack.push(i);
        		
        	else
        	{
        		if(stack.isEmpty())
        		{
        			last = i;
        			
        		}
        		else
        		{
        			stack.pop();
        			if(stack.isEmpty())
        			{
        				maxLength = Math.max((i - last), maxLength);
        			}
        			else
        				maxLength = Math.max((i - stack.peek()), maxLength);
        		}
        	}
        	
        }
        return maxLength;
        
    }

}
