public class REMatching {

	public boolean isMatch(String s, String p) {
		// TODO Auto-generated constructor stub
		if(onlyContainStars(p))
			return true;
		
		if(p.length() == 0)
            return s.length() == 0;
 
        //p's length 1 is special case    
        if(p.length() == 1)
        {
        	if(s.length() == 0)
        		return false;
//        	if(p.charAt(0) == '*')
//        		return true;
        	if(p.charAt(0) == '.')
        		return s.length() == 1;        	
        	if(p.charAt(0) == s.charAt(0))
        		return true;
        	else
        		return false;       	       	
        }
        else{
        	if(s.length() == 1)
        	{
        		if((p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) && onlyContainStars(p.substring(1)) )
        			return true;
        		else
        			return false;
        	}
        	else{
        		if((p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)))
        			return isMatch(s.substring(1), p.substring(1));
        	}
        	
        	
        	
        	
        		
        	
        }
	}
	
	private boolean onlyContainStars(String s)
	{
		
	}

}
