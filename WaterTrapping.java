package test;

public class WaterTrapping {

///first solution with O(n^2)	

//	public int trap(int[] A){
//		int i, j, k;
//		int sum = 0;
//		for(i = 0; i < height(A); i ++){
//			for(j = 0; j < A.length; j ++)
//			{
//				if(A[j] > i)
//					break;
//			}
//			if(i == A.length)
//				break;
//			for(k = A.length - 1; k >= 0; k --)
//			{
//				if(A[k] > i)
//					break;
//			}
//			if(j == k)
//				continue;
//			for(int p = j + 1; p < k; p ++)
//			{
//				if(A[p] < i + 1)
//					sum ++;
//			}
//		}
//		
//		return sum;
//	}
//	
//	private int height(int[] A){
//		
//		int max = 0;
//		for(int i = 0; i < A.length; i ++){
//			if(A[i] > max)
//				max = A[i];
//		}
//		return max;
//	}

//second solution with O(n)
	
	public int trap(int[] A){
		if(A.length == 0)
			return 0;
		int[] maxLeft = new int[A.length];
		int[] maxRight = new int[A.length];
		int max = A[0];
		for(int i = 1; i < A.length - 1; i ++){
			maxLeft[i] = max; 
			if(A[i] > max)
				max = A[i];
		}
		max = A[A.length - 1];
		for(int i = A.length - 2; i > 0; i --){
			maxRight[i] = max;
			if(A[i] > max)
				max = A[i];
		}
		int sum = 0;
		for(int i = 1; i < A.length - 1; i ++){
			sum += Math.max(Math.min(maxLeft[i], maxRight[i]) - A[i], 0);				
		}
		
		return sum;
	}
	
}
