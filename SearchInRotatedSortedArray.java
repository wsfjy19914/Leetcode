public class SearchInRotatedSortedArray {
    public int search(int[] A, int target) {
        return search(A, target, 0, A.length - 1);
    }

    private int search(int[] A, int target, int start, int end)
    {
        int n = end - start + 1;
        if(n == 1)
            return A[start] == target ? start : -1;
        if(n == 2)
        {
            if(target == A[start])
                return start;
            else if(target == A[end])
                return end;
            else
                return -1;
        }
        if(target == A[start])
            return start;
        if(target == A[start + n / 2])
            return (start + n / 2);

        if(A[start] < A[start + n / 2])
        {
            if(target < A[start] || target > A[start + n / 2])
                return search(A, target, start + n / 2, end);
            else
                return search(A, target, start, start + n / 2);
        }
        else
        {
            if(target < A[start + n / 2] || target > A[start])
                return search(A, target, start, start + n / 2);
            else
                return search(A, target, start + n / 2, end);
        }

    }
}
