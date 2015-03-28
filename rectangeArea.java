public class rectangeArea {

	 public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
	        // write your code in Java SE 8
	    	try{
	    	long area1 = calcArea(K, L, M, N);
	    	long area2 = calcArea(P, Q, R, S);
	    	
	    	long areaIntercecting = calcAreaIntercecting(K, L, M, N, P, Q, R, S);
	    	
	    	long result = area1 + area2 - areaIntercecting;
	    	
	    	if (result > Integer.MAX_VALUE)
	    		throw new RuntimeException("Overflowed!!");
	    	else    		
	    		return (int)result;
	    	}
	    	
	    	catch(RuntimeException e)
	    	{    		
	    		return -1;
	    	}
	    	
	    	
	    }
	    
	    
	    
	    private long calcArea(int x1, int y1, int x2, int y2)
	    {
	        return (x2 - x1) * (y2 - y1);
	    }
	    
	    private long calcAreaIntercecting(int R1_x1, int R1_y1, int R1_x2, int R1_y2, int R2_x1, int R2_y1, int R2_x2, int R2_y2)
	    {
	    	long x_length = getLength(R1_x1, R1_x2, R2_x1, R2_x2);
	    	long y_length = getLength(R1_y1, R1_y2, R2_y1, R2_y2);
	    	
	    	return x_length * y_length;
	    }
	    
	    private long getLength(int start1, int end1, int start2, int end2)
	    {
	    	return Math.max(0, (Math.min(end1, end2) - Math.max(start1, start2)));
	    }

}
