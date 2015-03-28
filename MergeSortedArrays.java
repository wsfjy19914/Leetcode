public class MergeSortedArrays {

	public void merge(int A[], int m, int B[], int n) {
        if(m == 0)
            System.arraycopy(B, 0, A, 0, n);
        else if(n != 0)
        {

            int[] C = new int[m + n];
            int i = 0;
            int j = 0;
            
            while(i < m || j < n)
            {
                if(i == m)
                {
                    C[i + j] = B[j];
                    j ++;
                }
                else if (j == n)
                {
                    C[i + j] = A[i];
                    i ++;
                }
                else if(A[i] > B[j])
                {
                    C[i + j] = B[j];
                    j ++;
                }
                else
                {
                    C[i + j] = A[i];
                    i ++;
                }
            }
            System.arraycopy(C, 0, A, 0, m + n);
        }
    }

}
