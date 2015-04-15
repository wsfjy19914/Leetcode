public class JumpGame {
    public boolean canJump(int[] A) {
        if(A.length == 1)
            return true;

        int length = A.length;
        int maxlength = 0;
        for(int i = 0; i < length && i <= maxlength; i++)
        {
            if(i + A[i] > maxlength)
                maxlength = i + A[i];

            if(maxlength >= length - 1)
                return true;
        }
        return false;
    }
}
