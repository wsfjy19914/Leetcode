public class MedianTwoArrays {

	public double findMedianSortedArrays(int A[], int B[]) {
		
		
		
		
	}
		
		
		
		
	private double findMedianSortedArrays(int A[], int startA, int endA, int B[], int startB, int endB)
	{
		int m = endA - startA + 1;
		int n = endB - startB + 1;
		
		
		
		
		if(A[m / 2] == B[n / 2])
			return (double)A[m / 2];
		else if(A[m / 2] > B[n / 2])
			findMedianSortedArrays(A, startA, m / 2, B, n / 2, endB);
		else
			findMedianSortedArrays(A, m / 2, endA, B, startB, n / 2);
			
			
	}

}
