package test;

import java.util.HashMap;
import java.util.Map;


public class MinimumWindow {

	public String minWindow(String S, String T) {
		if(S.length() < T.length())
			return "";
		Map<Character, Integer> t = new HashMap<Character, Integer>();
		
        for(int i = 0; i < T.length(); i ++)
        {
        	if(t.containsKey(T.charAt(i)))
        	{        		
        		t.put(T.charAt(i), t.get(T.charAt(i)) + 1);
        	}
        	else
        	{
        		t.put(T.charAt(i), 1);
        	}   
        }
        
        HashMap<Character, Integer> s = new HashMap<Character, Integer>();
        
        int count = 0;
        int start = 0;
        int end = 0;
        int minimum = Integer.MAX_VALUE;
        String subString = "";
        
        for(end = 0; end < S.length(); end ++)
        {
        	char ec = S.charAt(end);
        	if(t.containsKey(ec))
        	{
        		if(s.containsKey(ec))
        		{
        			s.put(ec, s.get(ec) + 1);
        		}
        		else
        		{
        			s.put(ec, 1);
        		}
        		if(s.get(ec) <= t.get(ec))
        		{
        			count ++;
        		}
        	}
        	else
        		continue;
        	
        	if(count == T.length())
        	{
        		char sc = S.charAt(start);
        		while(!s.containsKey(sc) || s.get(sc) > t.get(sc))
        		{
        			if(s.containsKey(sc) && s.get(sc) > t.get(sc))
        			{
        				s.put(sc, s.get(sc) - 1);
        			}
        			start ++;
        			sc = S.charAt(start);
        		}
        		if(end - start + 1 < minimum)
        		{
        			subString = S.substring(start, end + 1);
        			minimum = end - start + 1;
        		}
        	}
        }
        return subString;
        
    }

	
}
